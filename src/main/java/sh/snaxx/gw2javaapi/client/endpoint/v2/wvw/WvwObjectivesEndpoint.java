package sh.snaxx.gw2javaapi.client.endpoint.v2.wvw;

import com.fasterxml.jackson.core.type.TypeReference;
import sh.snaxx.gw2javaapi.client.Gw2ApiClient;
import sh.snaxx.gw2javaapi.constant.Gw2ApiEndpointUrl;
import sh.snaxx.gw2javaapi.model.v2.wvw.WvwObjective;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public final class WvwObjectivesEndpoint {

    private Gw2ApiClient gw2ApiClient;
    private String endpointUrl = Gw2ApiEndpointUrl.V2.WVW.OBJECTIVES.getUrl();

    public WvwObjectivesEndpoint(Gw2ApiClient client) {
        this.gw2ApiClient = client;
    }

    public CompletableFuture<List<String>> executeAllIds() {
        return this.gw2ApiClient.makeAsyncGet(this.endpointUrl, new TypeReference<List<String>>() {});
    }

    public CompletableFuture<WvwObjective> executeById(String objectiveId) {
        String endpointUrl = this.endpointUrl + "/" + objectiveId;
        return this.gw2ApiClient.makeAsyncGet(endpointUrl, new TypeReference<WvwObjective>() {});
    }

    public CompletableFuture<List<WvwObjective>> executeByMultipleIds(List<String> objectiveIds) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.endpointUrl).append("?ids=");
        for (String objectiveId : objectiveIds) {
            sb.append(objectiveId);
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        return this.gw2ApiClient.makeAsyncGet(sb.toString(), new TypeReference<List<WvwObjective>>() {});
    }
}
