package sh.snaxx.gw2javaapi.client;

/**
 * The Gw2ApiClientOptions object is used to make one-time modifications to GET requests to the Guild Wars 2 api.
 * // todo: there is no means of falling back to options set in the client if some options are omitted here
 */
public class Gw2ApiClientOptions {

    private final String apiKey;
    private final String language;
    private final String schemaVersion;

    public Gw2ApiClientOptions(String apiKey, String language, String schemaVersion) {
        this.apiKey = apiKey;
        this.language = language;
        this.schemaVersion = schemaVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String apiKey = "";
        private String language = "en";
        private String schemaVersion = ""; // todo: make this fallback to LATEST using an enum potentially

        public Builder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        public Builder language(String language) {
            this.language = language;
            return this;
        }

        public Builder schemaVersion(String schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }

        public Gw2ApiClientOptions build() {
            return new Gw2ApiClientOptions(apiKey, language, schemaVersion);
        }
    }
}
