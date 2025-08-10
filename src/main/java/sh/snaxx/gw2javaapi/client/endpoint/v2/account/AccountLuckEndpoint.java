package sh.snaxx.gw2javaapi.client.endpoint.v2.account;

import com.fasterxml.jackson.core.type.TypeReference;
import sh.snaxx.gw2javaapi.client.Gw2ApiClient;
import sh.snaxx.gw2javaapi.constant.Gw2ApiEndpointUrl;
import sh.snaxx.gw2javaapi.model.v2.account.AccountLuck;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public final class AccountLuckEndpoint {

    private Gw2ApiClient gw2ApiClient;
    private String endpointUrl = Gw2ApiEndpointUrl.V2.ACCOUNT.LUCK.getUrl();

    public AccountLuckEndpoint(Gw2ApiClient gw2ApiClient) {
        this.gw2ApiClient = gw2ApiClient;
    }

    //todo for some reason this is wrapped in an array; it might be because zero luck = an empty arrau
    public CompletableFuture<List<AccountLuck>> getAccountLuck() {
        return this.gw2ApiClient.makeAsyncGet(this.endpointUrl, new TypeReference<List<AccountLuck>>() {});
    }
}
