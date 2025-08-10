package sh.snaxx.gw2javaapi.client.endpoint.v2.wvw;

import com.fasterxml.jackson.core.type.TypeReference;
import sh.snaxx.gw2javaapi.client.Gw2ApiClient;
import sh.snaxx.gw2javaapi.client.endpoint.AbstractGw2ApiEndpoint;
import sh.snaxx.gw2javaapi.constant.Gw2ApiEndpointUrl;

import java.util.Map;

public final class WvwGuildsEndpoint extends AbstractGw2ApiEndpoint<Map<String, String>> {

    public WvwGuildsEndpoint(Gw2ApiClient gw2ApiClient, String region) {
        super(gw2ApiClient);
        if (region.equals("na")) {
            this.setEndpointUrl(Gw2ApiEndpointUrl.V2.WVW.GUILDS_NA.getUrl());
        } else if (region.equals("eu")) {
            this.setEndpointUrl(Gw2ApiEndpointUrl.V2.WVW.GUILDS_EU.getUrl());
        } else {
            //todo THIS IS AN ERROR HANDLE IT
        }
        this.setResponseType(new TypeReference<Map<String, String>>() {});
    }
}
