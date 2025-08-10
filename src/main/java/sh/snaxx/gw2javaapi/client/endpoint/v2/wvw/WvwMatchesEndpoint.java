package sh.snaxx.gw2javaapi.client.endpoint.v2.wvw;

import com.fasterxml.jackson.core.type.TypeReference;
import sh.snaxx.gw2javaapi.client.Gw2ApiClient;
import sh.snaxx.gw2javaapi.client.endpoint.AbstractGw2ApiEndpoint;
import sh.snaxx.gw2javaapi.constant.Gw2ApiEndpointUrl;

import java.util.List;

public final class WvwMatchesEndpoint extends AbstractGw2ApiEndpoint<List<String>> {

    public WvwMatchesEndpoint(Gw2ApiClient gw2ApiClient) {
        super(gw2ApiClient);
        this.setEndpointUrl(Gw2ApiEndpointUrl.V2.WVW.MATCHES.getUrl());
        this.setResponseType(new TypeReference<List<String>>() {});
    }

    public WvwMatchOverviewByIdEndpoint id(String matchId) {
        return new WvwMatchOverviewByIdEndpoint(this.getGw2ApiClient(), matchId);
    }

    public WvwMultipleMatchOverviewsByIdEndpoint multipleIds(List<String> matchIds) {
        return new WvwMultipleMatchOverviewsByIdEndpoint(this.getGw2ApiClient(), matchIds);
    }

    public WvwMatchWorldOverviewEndpoint worldOverview(Integer worldId) {
        return new WvwMatchWorldOverviewEndpoint(this.getGw2ApiClient(), worldId);
    }

    public WvwMatchWorldScoresEndpoint worldScores(Integer worldId) {
        return new WvwMatchWorldScoresEndpoint(this.getGw2ApiClient(), worldId);
    }
}
