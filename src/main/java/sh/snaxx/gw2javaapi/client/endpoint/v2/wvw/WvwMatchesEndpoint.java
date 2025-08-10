package sh.snaxx.gw2javaapi.client.endpoint.v2.wvw;

import com.fasterxml.jackson.core.type.TypeReference;
import sh.snaxx.gw2javaapi.client.Gw2ApiClient;
import sh.snaxx.gw2javaapi.constant.Gw2ApiEndpointUrl;
import sh.snaxx.gw2javaapi.model.v2.wvw.WvwMatchOverview;
import sh.snaxx.gw2javaapi.model.v2.wvw.WvwMatchWorldOverview;
import sh.snaxx.gw2javaapi.model.v2.wvw.WvwMatchWorldScores;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public final class WvwMatchesEndpoint {

    private Gw2ApiClient gw2ApiClient;

    public WvwMatchesEndpoint(Gw2ApiClient gw2ApiClient) {
        this.gw2ApiClient = gw2ApiClient;
    }

    public CompletableFuture<List<String>> executeForMatchIds() {
        String endpointUrl = Gw2ApiEndpointUrl.V2.WVW.MATCHES.getUrl();
        return this.gw2ApiClient.makeAsyncGet(endpointUrl, new TypeReference<List<String>>() {});
    }

    public CompletableFuture<WvwMatchOverview> executeMatchOverview(String matchId) {
        String endpointUrl = Gw2ApiEndpointUrl.V2.WVW.MATCHES.getUrl() + "/" + matchId;
        return this.gw2ApiClient.makeAsyncGet(endpointUrl, new TypeReference<WvwMatchOverview>() {});
    }

    public CompletableFuture<List<WvwMatchOverview>> executeMultipleMatchOverviews(List<String> matchIds) {
        StringBuilder sb = new StringBuilder();
        sb.append(Gw2ApiEndpointUrl.V2.WVW.MATCHES.getUrl());
        sb.append("?ids=");
        for (String matchId : matchIds) {
            sb.append(matchId);
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        return this.gw2ApiClient.makeAsyncGet(sb.toString(), new TypeReference<List<WvwMatchOverview>>() {});
    }

    public CompletableFuture<WvwMatchWorldOverview> executeMatchWorldOverview(Integer worldId) {
        String endpointUrl = Gw2ApiEndpointUrl.V2.WVW.MATCH_WORLD_OVERVIEW.getUrl() + worldId;
        return this.gw2ApiClient.makeAsyncGet(endpointUrl, new TypeReference<WvwMatchWorldOverview>() {});
    }

    public CompletableFuture<WvwMatchWorldScores> executeMatchWorldScores(Integer worldId) {
        String endpointUrl = Gw2ApiEndpointUrl.V2.WVW.MATCH_WORLD_SCORES.getUrl() + worldId;
        return this.gw2ApiClient.makeAsyncGet(endpointUrl, new TypeReference<WvwMatchWorldScores>() {});
    }
}
