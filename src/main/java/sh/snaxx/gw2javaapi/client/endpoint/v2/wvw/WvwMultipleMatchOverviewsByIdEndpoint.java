package sh.snaxx.gw2javaapi.client.endpoint.v2.wvw;

import com.fasterxml.jackson.core.type.TypeReference;
import sh.snaxx.gw2javaapi.client.Gw2ApiClient;
import sh.snaxx.gw2javaapi.client.endpoint.AbstractGw2ApiEndpoint;
import sh.snaxx.gw2javaapi.constant.Gw2ApiEndpointUrl;
import sh.snaxx.gw2javaapi.model.v2.wvw.WvwMatchOverview;

import java.util.List;

public final class WvwMultipleMatchOverviewsByIdEndpoint extends AbstractGw2ApiEndpoint<List<WvwMatchOverview>> {

    public WvwMultipleMatchOverviewsByIdEndpoint(Gw2ApiClient gw2ApiClient, List<String> matchIds) {
        super(gw2ApiClient);

        // append all provided ids to the url
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Gw2ApiEndpointUrl.V2.WVW.MATCHES.getUrl());
        stringBuilder.append("?ids=");
        for (String matchId : matchIds) {
            stringBuilder.append(matchId);
            stringBuilder.append(",");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);

        this.setEndpointUrl(stringBuilder.toString());
        this.setResponseType(new TypeReference<List<WvwMatchOverview>>() {});
    }
}
