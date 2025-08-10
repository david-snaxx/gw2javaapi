package sh.snaxx.gw2javaapi.client.endpoint.v2.wvw;

import com.fasterxml.jackson.core.type.TypeReference;
import sh.snaxx.gw2javaapi.client.Gw2ApiClient;
import sh.snaxx.gw2javaapi.constant.Gw2ApiEndpointUrl;
import sh.snaxx.gw2javaapi.model.v2.wvw.WvwMatchOverview;
import sh.snaxx.gw2javaapi.model.v2.wvw.WvwMatchWorldOverview;
import sh.snaxx.gw2javaapi.model.v2.wvw.WvwMatchWorldScores;
import sh.snaxx.gw2javaapi.model.v2.wvw.WvwMatchWorldStats;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public final class WvwMatchesEndpoint {

    private Gw2ApiClient gw2ApiClient;
    private String endpointUrl = Gw2ApiEndpointUrl.V2.WVW.MATCHES.getUrl();
    private String worldOverviewEndpointUrl = Gw2ApiEndpointUrl.V2.WVW.MATCH_WORLD_OVERVIEW.getUrl();
    private String worldScoresEndpointUrl = Gw2ApiEndpointUrl.V2.WVW.MATCH_WORLD_SCORES.getUrl();
    private String worldStatsEndpointUrl = Gw2ApiEndpointUrl.V2.WVW.MATCH_WORLD_STATS.getUrl();

    public WvwMatchesEndpoint(Gw2ApiClient gw2ApiClient) {
        this.gw2ApiClient = gw2ApiClient;
    }

    public CompletableFuture<List<String>> executeForMatchIds() {
        return this.gw2ApiClient.makeAsyncGet(this.endpointUrl, new TypeReference<List<String>>() {});
    }

    public CompletableFuture<WvwMatchOverview> executeMatchOverview(String matchId) {
        String endpointUrl = this.endpointUrl + "/" + matchId;
        return this.gw2ApiClient.makeAsyncGet(endpointUrl, new TypeReference<WvwMatchOverview>() {});
    }

    public CompletableFuture<List<WvwMatchOverview>> executeMultipleMatchOverviews(List<String> matchIds) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.endpointUrl).append("?ids=");
        for (String matchId : matchIds) {
            sb.append(matchId);
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        return this.gw2ApiClient.makeAsyncGet(sb.toString(), new TypeReference<List<WvwMatchOverview>>() {});
    }

    public CompletableFuture<WvwMatchWorldOverview> executeMatchWorldOverview(Integer worldId) {
        String endpointUrl = this.worldOverviewEndpointUrl + worldId;
        return this.gw2ApiClient.makeAsyncGet(endpointUrl, new TypeReference<WvwMatchWorldOverview>() {});
    }

    public CompletableFuture<WvwMatchWorldScores> executeMatchWorldScores(Integer worldId) {
        String endpointUrl = this.worldScoresEndpointUrl + worldId;
        return this.gw2ApiClient.makeAsyncGet(endpointUrl, new TypeReference<WvwMatchWorldScores>() {});
    }

    public CompletableFuture<WvwMatchWorldStats> executeMatchWorldStats(Integer worldId) {
        String endpointUrl = this.worldStatsEndpointUrl + worldId;
        return this.gw2ApiClient.makeAsyncGet(endpointUrl, new TypeReference<WvwMatchWorldStats>() {});
    }
}
