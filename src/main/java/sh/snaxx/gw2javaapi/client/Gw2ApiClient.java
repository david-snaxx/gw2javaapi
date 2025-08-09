package sh.snaxx.gw2javaapi.client;

import okhttp3.OkHttpClient;
import sh.snaxx.gw2javaapi.client.endpoint.VersionEndpoint;

public class Gw2ApiClient {

    private OkHttpClient client = new OkHttpClient.Builder().build();
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

    public OkHttpClient getClient() { return client; }
    public void setClient(OkHttpClient client) { this.client = client; }

    public String getApiKey() { return apiKey; }
    public void setApiKey(String apiKey) { this.apiKey = apiKey; }

    public String getLanguage() { return language; }
    public void setLanguage(String language) { this.language = language; }

    public String getSchemaVersion() { return schemaVersion; }
    public void setSchemaVersion(String schemaVersion) { this.schemaVersion = schemaVersion; }
}
