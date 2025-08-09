package sh.snaxx.gw2javaapi.client;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.*;
import sh.snaxx.gw2javaapi.client.endpoint.VersionEndpoint;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public class Gw2ApiClient {

    private OkHttpClient client = new OkHttpClient.Builder().build();
    private ObjectMapper mapper = new ObjectMapper();
    private String apiKey;
    private String language;
    private String schemaVersion;

    public Gw2ApiClient() {}

    public Gw2ApiClient(String apiKey, String language, String schemaVersion) {
        this.apiKey = apiKey;
        this.language = language;
        this.schemaVersion = schemaVersion;
    }

    /**
     * Begins method-chaining guiding the caller through endpoints of the Guild Wars 2 api.
     * @return Options for actions to take with api version endpoints.
     */
    public VersionEndpoint get() {
        return new VersionEndpoint(this);
    }

    /**
     * Makes an async GET request to the provided url presuming that the url returns the specified type.
     * @param url The url to make a GET request to.
     * @param responseType The type of object the url provides.
     * @return A CompletableFuture holding an object of the specified type.
     */
    public <T> CompletableFuture<T> makeAsyncGet(String url, TypeReference<T> responseType) {
        CompletableFuture<T> future = new CompletableFuture<>();

        Request request = new Request.Builder().url(url).get().build();

        Callback callback = new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                future.completeExceptionally(e);
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                try (ResponseBody responseBody = response.body()) {
                    if (!response.isSuccessful() || responseBody == null) {
                        future.completeExceptionally(new IOException("Unexpected code " + response.body()));
                        return;
                    }

                    T result = mapper.readValue(responseBody.string(), responseType);
                    future.complete(result);
                } catch (IOException e) {
                    future.completeExceptionally(e);
                }
            }
        };

        this.client.newCall(request).enqueue(callback);
        return future;
    }

    /**
     * Makes an async GET request to the provided url presuming that the url returns the specified type.
     * Merges the existing {@link Gw2ApiClientOptions} on this api client with custom options. If an option is present
     * in the provided {@link Gw2ApiClientOptions}, it will take priority. If an option is absent from the provided
     * {@link Gw2ApiClientOptions}, then the api client's option will be used.
     * <p>
     * This does not override the options set on the api client.
     * @param url The url to make a GET request to.
     * @param responseType The type of object the url provides.
     * @param options The request options to take priority for this request only.
     * @return A CompletableFuture holding an object of the specified type.
     */
    public <T> CompletableFuture<T> makeAsyncGetWithOptionsAdjustment(String url, TypeReference<T> responseType, Gw2ApiClientOptions options) {
        String finalApiKey = (options.getApiKey() == null) ? this.apiKey : options.getApiKey();
        String finalLanguage = (options.getLanguage() == null) ? this.language : options.getLanguage();
        String finalSchemaVersion = (options.getSchemaVersion() == null) ? this.schemaVersion : options.getSchemaVersion();
        Gw2ApiClient tempClient = new Gw2ApiClient(finalApiKey, finalLanguage, finalSchemaVersion);
        return tempClient.makeAsyncGet(url, responseType);
    }

    /**
     * Makes an async GET request to the provided url presuming that the url returns the specified type.
     * Ignores all options set by the api client and instead uses the options specified by the provided
     * {@link Gw2ApiClientOptions} for this request only. Missing options imply that they should simply not be used
     * for this request.
     * <p>
     * This does not override the options set on the api client.
     * @param url The url to make a GET request to.
     * @param responseType The type of object the url provides.
     * @param options The request options to take priority for this request only.
     * @return A CompletableFuture holding an object of the specified type.
     */
    public <T> CompletableFuture<T> makeAsyncGetWithOptionsOverride(String url, TypeReference<T> responseType, Gw2ApiClientOptions options) {
        Gw2ApiClient tempClient = new Gw2ApiClient(
                options.getApiKey(),
                options.getLanguage(),
                options.getSchemaVersion());
        return tempClient.makeAsyncGet(url, responseType);
    }

    public String getApiKey() { return apiKey; }
    public void setApiKey(String apiKey) { this.apiKey = apiKey; }

    public String getLanguage() { return language; }
    public void setLanguage(String language) { this.language = language; }

    public String getSchemaVersion() { return schemaVersion; }
    public void setSchemaVersion(String schemaVersion) { this.schemaVersion = schemaVersion; }
}
