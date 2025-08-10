package sh.snaxx.gw2javaapi.client.endpoint.v2.account;

import com.fasterxml.jackson.core.type.TypeReference;
import sh.snaxx.gw2javaapi.client.Gw2ApiClient;
import sh.snaxx.gw2javaapi.client.endpoint.AuthenticatedEndpoint;
import sh.snaxx.gw2javaapi.constant.Gw2ApiEndpointUrl;
import sh.snaxx.gw2javaapi.model.v2.account.AccountOverview;

import java.util.concurrent.CompletableFuture;

public class AccountEndpoint implements AuthenticatedEndpoint {

    private Gw2ApiClient gw2ApiClient;
    private String endpointUrl = Gw2ApiEndpointUrl.V2.ACCOUNT.BASE.getUrl();

    public AccountEndpoint(Gw2ApiClient gw2ApiClient) {
        this.gw2ApiClient = gw2ApiClient;
    }

    public CompletableFuture<AccountOverview> executeAccountOverview() {
        return this.gw2ApiClient.makeAsyncGet(this.endpointUrl, new TypeReference<AccountOverview>() {});
    }
}
