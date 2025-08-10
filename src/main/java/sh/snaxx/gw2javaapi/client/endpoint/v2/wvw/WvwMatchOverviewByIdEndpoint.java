package sh.snaxx.gw2javaapi.client.endpoint.v2.wvw;

import com.fasterxml.jackson.core.type.TypeReference;
import sh.snaxx.gw2javaapi.client.Gw2ApiClient;
import sh.snaxx.gw2javaapi.client.endpoint.AbstractGw2ApiEndpoint;
import sh.snaxx.gw2javaapi.constant.Gw2ApiEndpointUrl;
import sh.snaxx.gw2javaapi.model.v2.wvw.WvwMatchOverview;

public final class WvwMatchOverviewByIdEndpoint extends AbstractGw2ApiEndpoint<WvwMatchOverview> {

    private String matchId;

    public WvwMatchOverviewByIdEndpoint(Gw2ApiClient gw2ApiClient, String matchId) {
        super(gw2ApiClient);
        this.matchId = matchId;
        this.setEndpointUrl(Gw2ApiEndpointUrl.V2.WVW.MATCHES.getUrl() + "/" + matchId);
        this.setResponseType(new TypeReference<WvwMatchOverview>() {});
    }
}
