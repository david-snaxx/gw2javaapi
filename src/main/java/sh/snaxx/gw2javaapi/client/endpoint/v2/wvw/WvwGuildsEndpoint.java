package sh.snaxx.gw2javaapi.client.endpoint.v2.wvw;

import com.fasterxml.jackson.core.type.TypeReference;
import sh.snaxx.gw2javaapi.client.Gw2ApiClient;
import sh.snaxx.gw2javaapi.constant.Gw2ApiEndpointUrl;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

public final class WvwGuildsEndpoint {

    private Gw2ApiClient gw2ApiClient;

    public WvwGuildsEndpoint(Gw2ApiClient gw2ApiClient) {
        this.gw2ApiClient = gw2ApiClient;
    }

    public CompletableFuture<Map<String, String>> executeNa() {
        String endpointUrl = Gw2ApiEndpointUrl.V2.WVW.GUILDS_NA.getUrl();
        return this.gw2ApiClient.makeAsyncGet(endpointUrl, new TypeReference<Map<String, String>>() {});
    }

    public CompletableFuture<Map<String, String>> executeEu() {
        String endpointUrl = Gw2ApiEndpointUrl.V2.WVW.GUILDS_EU.getUrl();
        return this.gw2ApiClient.makeAsyncGet(endpointUrl, new TypeReference<Map<String, String>>() {});
    }
}
