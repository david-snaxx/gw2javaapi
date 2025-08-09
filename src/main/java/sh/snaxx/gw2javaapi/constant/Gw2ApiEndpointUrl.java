package sh.snaxx.gw2javaapi.constant;

public enum Gw2ApiEndpointUrl {

    BASE("https://api.guildwars2.com");

    public enum V2 {
        BASE("https://api.guildwars2.com/v2");

        public enum ACCOUNT {
            BASE("https://api.guildwars2.com/v2/account");


            private final String url;

            ACCOUNT(String url) {
                this.url = url;
            }

            public String getUrl() {
                return url;
            }
        }

        private final String url;

        V2(String url) {
            this.url = url;
        }

        public String getUrl() {
            return url;
        }
    }

    private final String url;

    Gw2ApiEndpointUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
