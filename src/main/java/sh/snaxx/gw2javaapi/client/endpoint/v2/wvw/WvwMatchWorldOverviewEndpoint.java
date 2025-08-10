package sh.snaxx.gw2javaapi.client.endpoint.v2.wvw;

import com.fasterxml.jackson.core.type.TypeReference;
import sh.snaxx.gw2javaapi.client.Gw2ApiClient;
import sh.snaxx.gw2javaapi.client.endpoint.AbstractGw2ApiEndpoint;
import sh.snaxx.gw2javaapi.constant.Gw2ApiEndpointUrl;
import sh.snaxx.gw2javaapi.model.v2.wvw.WvwMatchWorldOverview;

public class WvwMatchWorldOverviewEndpoint extends AbstractGw2ApiEndpoint<WvwMatchWorldOverview> {

    public WvwMatchWorldOverviewEndpoint(Gw2ApiClient client, Integer worldId) {
        super(client);
        this.setEndpointUrl(Gw2ApiEndpointUrl.V2.WVW.MATCH_WORLD_OVERVIEW.getUrl() + worldId);
        this.setResponseType(new TypeReference<WvwMatchWorldOverview>() {});
    }
}
