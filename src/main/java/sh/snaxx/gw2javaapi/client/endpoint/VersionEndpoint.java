package sh.snaxx.gw2javaapi.client.endpoint;

import sh.snaxx.gw2javaapi.client.Gw2ApiClient;
import sh.snaxx.gw2javaapi.client.endpoint.v2.V2Endpoint;

public final class VersionEndpoint {

    private Gw2ApiClient gw2ApiClient;

    public VersionEndpoint(Gw2ApiClient gw2ApiClient) {
        this.gw2ApiClient = gw2ApiClient;
    }

    public V2Endpoint v2() {
        return new V2Endpoint(this.gw2ApiClient);
    }
}
