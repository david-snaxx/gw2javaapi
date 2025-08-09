package sh.snaxx.gw2javaapi.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.*;
import org.jetbrains.annotations.NotNull;
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

    public VersionEndpoint get() {
        return new VersionEndpoint(this);
    }

    public <T> CompletableFuture<T> makeAsyncGet(String url, Class<T> responseType) {
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
                    if (!response.isSuccessful()) {
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

    public String getApiKey() { return apiKey; }
    public void setApiKey(String apiKey) { this.apiKey = apiKey; }

    public String getLanguage() { return language; }
    public void setLanguage(String language) { this.language = language; }

    public String getSchemaVersion() { return schemaVersion; }
    public void setSchemaVersion(String schemaVersion) { this.schemaVersion = schemaVersion; }
}
