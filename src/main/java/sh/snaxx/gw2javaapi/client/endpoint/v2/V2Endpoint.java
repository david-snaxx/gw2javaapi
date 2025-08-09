package sh.snaxx.gw2javaapi.client.endpoint.v2;

import sh.snaxx.gw2javaapi.client.Gw2ApiClient;
import sh.snaxx.gw2javaapi.client.endpoint.v2.wvw.WvwEndpoint;

public final class V2Endpoint {

    private Gw2ApiClient gw2ApiClient;

    public V2Endpoint(Gw2ApiClient gw2ApiClient) {
        this.gw2ApiClient = gw2ApiClient;
    }

    public WvwEndpoint wvw() {
        return new WvwEndpoint(this.gw2ApiClient);
    }
}
