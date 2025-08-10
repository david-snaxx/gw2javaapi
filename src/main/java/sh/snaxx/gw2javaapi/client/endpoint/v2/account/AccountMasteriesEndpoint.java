package sh.snaxx.gw2javaapi.client.endpoint.v2.account;

import com.fasterxml.jackson.core.type.TypeReference;
import sh.snaxx.gw2javaapi.client.Gw2ApiClient;
import sh.snaxx.gw2javaapi.constant.Gw2ApiEndpointUrl;
import sh.snaxx.gw2javaapi.model.v2.account.AccountMasteryOverview;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public final class AccountMasteriesEndpoint {

    private Gw2ApiClient gw2ApiClient;
    private String endpointUrl = Gw2ApiEndpointUrl.V2.ACCOUNT.MASTERIES.getUrl();

    public AccountMasteriesEndpoint(Gw2ApiClient gw2ApiClient) {
        this.gw2ApiClient = gw2ApiClient;
    }

    public CompletableFuture<List<AccountMasteryOverview>> getMasteryProgressOverview() {
        return this.gw2ApiClient.makeAsyncGet(this.endpointUrl, new TypeReference<List<AccountMasteryOverview>>() {});
    }
}
