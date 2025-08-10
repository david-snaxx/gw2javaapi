package sh.snaxx.gw2javaapi.client.endpoint.v2.account;

import com.fasterxml.jackson.core.type.TypeReference;
import sh.snaxx.gw2javaapi.client.Gw2ApiClient;
import sh.snaxx.gw2javaapi.constant.Gw2ApiEndpointUrl;
import sh.snaxx.gw2javaapi.model.v2.account.AccountBuildStorageTemplate;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class AccountBuildStorageEndpoint {

    private Gw2ApiClient gw2ApiClient;
    private String endpointUrl = Gw2ApiEndpointUrl.V2.ACCOUNT.BUILD_STORAGE.getUrl();

    public  AccountBuildStorageEndpoint(Gw2ApiClient gw2ApiClient) {
        this.gw2ApiClient = gw2ApiClient;
    }

    public CompletableFuture<List<Integer>> getAllBuildStorageIds() {
        return this.gw2ApiClient.makeAsyncGet(this.endpointUrl, new TypeReference<List<Integer>>() {});
    }

    public CompletableFuture<AccountBuildStorageTemplate> getBuildTemplate(Integer buildStorageId) {
        String endpointUrl = this.endpointUrl + "?id=" + buildStorageId;
        return this.gw2ApiClient.makeAsyncGet(endpointUrl, new TypeReference<AccountBuildStorageTemplate>() {});
    }

    public CompletableFuture<List<AccountBuildStorageTemplate>> getMultipleBuildTemplates(List<Integer> buildStorageIds) {
        StringBuilder sb =  new StringBuilder();
        sb.append(this.endpointUrl).append("?ids=");
        for (Integer buildStorageId : buildStorageIds) {
            sb.append(buildStorageId);
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        return this.gw2ApiClient.makeAsyncGet(sb.toString(), new TypeReference<List<AccountBuildStorageTemplate>>() {});
    }
}
