package sh.snaxx.gw2javaapi.client.endpoint.v2.account;

import com.fasterxml.jackson.core.type.TypeReference;
import sh.snaxx.gw2javaapi.client.Gw2ApiClient;
import sh.snaxx.gw2javaapi.constant.Gw2ApiEndpointUrl;
import sh.snaxx.gw2javaapi.model.v2.account.AccountHomesteadDecorationOverview;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public final class AccountHomesteadEndpoint {

    private Gw2ApiClient gw2ApiClient;
    private String endpointUrl = Gw2ApiEndpointUrl.V2.ACCOUNT.HOMESTEAD.getUrl();
    private String decorationsEndpoint = Gw2ApiEndpointUrl.V2.ACCOUNT.HOMESTEAD_DECORATIONS.getUrl();
    private String glyphsEndpoint = Gw2ApiEndpointUrl.V2.ACCOUNT.HOMESTEAD_GLYPHS.getUrl();

    public AccountHomesteadEndpoint(Gw2ApiClient gw2ApiClient) {
        this.gw2ApiClient = gw2ApiClient;
    }

    public CompletableFuture<List<String>> getHomesteadEndpointIds() {
        return this.gw2ApiClient.makeAsyncGet(this.endpointUrl, new TypeReference<List<String>>() {});
    }

    public CompletableFuture<List<AccountHomesteadDecorationOverview>> getOwnedDecorationOverviews() {
        return this.gw2ApiClient.makeAsyncGet(this.decorationsEndpoint, new TypeReference<List<AccountHomesteadDecorationOverview>>() {});
    }

    public CompletableFuture<List<String>> getOwnedGlyphIds() {
        return this.gw2ApiClient.makeAsyncGet(this.glyphsEndpoint, new TypeReference<List<String>>() {});
    }
}
