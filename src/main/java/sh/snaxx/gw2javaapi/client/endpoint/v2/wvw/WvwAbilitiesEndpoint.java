package sh.snaxx.gw2javaapi.client.endpoint.v2.wvw;

import com.fasterxml.jackson.core.type.TypeReference;
import sh.snaxx.gw2javaapi.client.Gw2ApiClient;
import sh.snaxx.gw2javaapi.constant.Gw2ApiEndpointUrl;
import sh.snaxx.gw2javaapi.model.v2.wvw.WvwAbility;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public final class WvwAbilitiesEndpoint {

    private Gw2ApiClient gw2ApiClient;
    private String endpointUrl = Gw2ApiEndpointUrl.V2.WVW.ABILITIES.getUrl();

    public WvwAbilitiesEndpoint(Gw2ApiClient apiClient) {
        this.gw2ApiClient = apiClient;
    }

    public CompletableFuture<List<Integer>> executeAllIds() {
        return this.gw2ApiClient.makeAsyncGet(this.endpointUrl, new TypeReference<List<Integer>>() {});
    }

    public CompletableFuture<WvwAbility> executeById(Integer abilityId) {
        String endpointUrl = this.endpointUrl + "/" + abilityId;
        return this.gw2ApiClient.makeAsyncGet(endpointUrl, new TypeReference<WvwAbility>() {});
    }

    public CompletableFuture<List<WvwAbility>> executeByMultipleIds(List<Integer> abilityIds) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.endpointUrl).append("?ids=");
        for (Integer abilityId : abilityIds) {
            sb.append(abilityId).append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        return this.gw2ApiClient.makeAsyncGet(sb.toString(), new TypeReference<List<WvwAbility>>() {});
    }
}
