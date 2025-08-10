package sh.snaxx.gw2javaapi.client.endpoint.v2.wvw;

import sh.snaxx.gw2javaapi.client.Gw2ApiClient;

public final class WvwEndpoint {

    private Gw2ApiClient gw2ApiClient;

    public WvwEndpoint(Gw2ApiClient gw2ApiClient) {
        this.gw2ApiClient = gw2ApiClient;
    }

    public WvwAbilitiesEndpoint abilities() {
        return new WvwAbilitiesEndpoint(this.gw2ApiClient);
    }

    public WvwGuildsEndpoint guilds(String regionId) {
        return new WvwGuildsEndpoint(this.gw2ApiClient, regionId);
    }
}
