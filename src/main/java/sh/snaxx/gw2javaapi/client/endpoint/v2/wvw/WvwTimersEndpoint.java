package sh.snaxx.gw2javaapi.client.endpoint.v2.wvw;

import com.fasterxml.jackson.core.type.TypeReference;
import sh.snaxx.gw2javaapi.client.Gw2ApiClient;
import sh.snaxx.gw2javaapi.client.endpoint.AbstractGw2ApiEndpoint;
import sh.snaxx.gw2javaapi.constant.Gw2ApiEndpointUrl;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class WvwTimersEndpoint extends AbstractGw2ApiEndpoint {

    public WvwTimersEndpoint(Gw2ApiClient gw2ApiClient) {
        super(gw2ApiClient);
    }

    public CompletableFuture<Map<String, String>> executeLockoutTimer() {
        String endpointUrl = Gw2ApiEndpointUrl.V2.WVW.TIMERS_LOCKOUT.getUrl();
        return this.execute(endpointUrl, new TypeReference<Map<String, String>>() {});
    }

    public CompletableFuture<Map<String, String>> executeTeamAssignmentTimer() {
        String endpointUrl = Gw2ApiEndpointUrl.V2.WVW.TIMERS_TEAM_ASSIGNMENT.getUrl();
        return this.execute(endpointUrl, new TypeReference<Map<String, String>>() {});
    }
}
