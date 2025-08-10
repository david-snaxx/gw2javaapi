package sh.snaxx.gw2javaapi.client.endpoint.v2.wvw;

import com.fasterxml.jackson.core.type.TypeReference;
import sh.snaxx.gw2javaapi.client.Gw2ApiClient;
import sh.snaxx.gw2javaapi.constant.Gw2ApiEndpointUrl;
import sh.snaxx.gw2javaapi.model.v2.wvw.WvwRank;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public final class WvwRanksEndpoint {

    private Gw2ApiClient gw2ApiClient;
    private String endpointUrl = Gw2ApiEndpointUrl.V2.WVW.RANKS.getUrl();

    public WvwRanksEndpoint(Gw2ApiClient apiClient) {
        this.gw2ApiClient = apiClient;
    }

    public CompletableFuture<Integer> executeAllIds() {
        return this.gw2ApiClient.makeAsyncGet(this.endpointUrl, new TypeReference<Integer>() {});
    }

    public CompletableFuture<WvwRank> executeById(Integer rankId) {
        String endpointUrl = this.endpointUrl + "/" + rankId;
        return this.gw2ApiClient.makeAsyncGet(endpointUrl, new TypeReference<WvwRank>() {});
    }

    public CompletableFuture<List<WvwRank>> executeMultipleRanksById(List<Integer> rankIds) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.endpointUrl).append("?ids=");
        for (Integer rankId : rankIds) {
            sb.append(rankId);
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        return this.gw2ApiClient.makeAsyncGet(sb.toString(), new TypeReference<List<WvwRank>>() {});
    }
}
