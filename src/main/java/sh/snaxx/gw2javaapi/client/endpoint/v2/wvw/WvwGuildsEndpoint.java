package sh.snaxx.gw2javaapi.client.endpoint.v2.wvw;

import com.fasterxml.jackson.core.type.TypeReference;
import sh.snaxx.gw2javaapi.client.Gw2ApiClient;
import sh.snaxx.gw2javaapi.constant.Gw2ApiEndpointUrl;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public final class WvwGuildsEndpoint {

    private Gw2ApiClient gw2ApiClient;
    private String endpointUrl = Gw2ApiEndpointUrl.V2.WVW.GUILDS.getUrl();
    private String naEndpointUrl = Gw2ApiEndpointUrl.V2.WVW.GUILDS_NA.getUrl();
    private String euEndpointUrl = Gw2ApiEndpointUrl.V2.WVW.GUILDS_EU.getUrl();

    public WvwGuildsEndpoint(Gw2ApiClient gw2ApiClient) {
        this.gw2ApiClient = gw2ApiClient;
    }

    public CompletableFuture<List<String>> executeRegionIds() {
        return this.gw2ApiClient.makeAsyncGet(this.endpointUrl, new TypeReference<List<String>>() {});
    }

    public CompletableFuture<Map<String, String>> executeNa() {
        return this.gw2ApiClient.makeAsyncGet(this.naEndpointUrl, new TypeReference<Map<String, String>>() {});
    }

    public CompletableFuture<Map<String, String>> executeEu() {
        return this.gw2ApiClient.makeAsyncGet(this.euEndpointUrl, new TypeReference<Map<String, String>>() {});
    }
}
