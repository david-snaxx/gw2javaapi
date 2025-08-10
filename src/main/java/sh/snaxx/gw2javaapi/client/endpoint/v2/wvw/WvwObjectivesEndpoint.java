package sh.snaxx.gw2javaapi.client.endpoint.v2.wvw;

import com.fasterxml.jackson.core.type.TypeReference;
import sh.snaxx.gw2javaapi.client.Gw2ApiClient;
import sh.snaxx.gw2javaapi.client.endpoint.AbstractGw2ApiEndpoint;
import sh.snaxx.gw2javaapi.constant.Gw2ApiEndpointUrl;
import sh.snaxx.gw2javaapi.model.v2.wvw.WvwObjective;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public final class WvwObjectivesEndpoint extends AbstractGw2ApiEndpoint {

    public WvwObjectivesEndpoint(Gw2ApiClient client) {
        super(client);
    }

    public CompletableFuture<List<String>> executeAllIds() {
        String endpointUrl = Gw2ApiEndpointUrl.V2.WVW.OBJECTIVES.getUrl();
        return this.execute(endpointUrl, new TypeReference<List<String>>() {});
    }

    public CompletableFuture<WvwObjective> executeById(String objectiveId) {
        String endpointUrl = Gw2ApiEndpointUrl.V2.WVW.OBJECTIVES.getUrl() + "/" + objectiveId;
        return this.execute(endpointUrl, new TypeReference<WvwObjective>() {});
    }

    public CompletableFuture<List<WvwObjective>> executeByMultipleIds(List<String> objectiveIds) {
        StringBuilder sb = new StringBuilder();
        sb.append(Gw2ApiEndpointUrl.V2.WVW.OBJECTIVES.getUrl());
        sb.append("?ids=");
        for (String objectiveId : objectiveIds) {
            sb.append(objectiveId);
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        return this.execute(sb.toString(), new TypeReference<List<WvwObjective>>() {});
    }
}
