package sh.snaxx.gw2javaapi.client.endpoint.v2.account;

import com.fasterxml.jackson.core.type.TypeReference;
import sh.snaxx.gw2javaapi.client.Gw2ApiClient;
import sh.snaxx.gw2javaapi.constant.Gw2ApiEndpointUrl;
import sh.snaxx.gw2javaapi.model.v2.account.AccountCatOverview;

import java.util.List;
import java.util.concurrent.CompletableFuture;

// todo: for cats if a schema before 2019-03-22T00:00:00Z or no schema is used, then it returns ids instead of objects
public class AccountHomeEndpoint {

    private Gw2ApiClient gw2ApiClient;
    private String endpointUrl = Gw2ApiEndpointUrl.V2.ACCOUNT.HOME.getUrl();
    private String catsUrl = Gw2ApiEndpointUrl.V2.ACCOUNT.HOME_CATS.getUrl();
    private String nodesUrl = Gw2ApiEndpointUrl.V2.ACCOUNT.HOME_NODES.getUrl();

    public AccountHomeEndpoint(Gw2ApiClient gw2ApiClient) {
        this.gw2ApiClient = gw2ApiClient;
    }

    public CompletableFuture<List<String>> getHomeEndpointIds() {
        return this.gw2ApiClient.makeAsyncGet(this.endpointUrl, new TypeReference<List<String>>() {});
    }

    public CompletableFuture<List<Integer>> getOwnedCatIds() {
        return this.gw2ApiClient.makeAsyncGet(this.catsUrl, new TypeReference<List<Integer>>() {});
    }

    public CompletableFuture<List<AccountCatOverview>> getOwnedCatOverviews() {
        return this.gw2ApiClient.makeAsyncGet(this.catsUrl, new TypeReference<List<AccountCatOverview>>() {});
    }

    public CompletableFuture<List<String>> getOwnedNodeIds() {
        return this.gw2ApiClient.makeAsyncGet(this.nodesUrl, new TypeReference<List<String>>() {});
    }
}
