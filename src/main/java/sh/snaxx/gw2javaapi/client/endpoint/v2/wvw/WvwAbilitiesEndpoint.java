package sh.snaxx.gw2javaapi.client.endpoint.v2.wvw;

import com.fasterxml.jackson.core.type.TypeReference;
import sh.snaxx.gw2javaapi.client.Gw2ApiClient;
import sh.snaxx.gw2javaapi.client.endpoint.AbstractGw2ApiEndpoint;
import sh.snaxx.gw2javaapi.constant.Gw2ApiEndpointUrl;
import sh.snaxx.gw2javaapi.model.v2.wvw.WvwAbility;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public final class WvwAbilitiesEndpoint extends AbstractGw2ApiEndpoint {

    public WvwAbilitiesEndpoint(Gw2ApiClient apiClient) {
        super(apiClient);
    }

    public CompletableFuture<WvwAbility> executeById(Integer abilityId) {
        String endpointUrl = Gw2ApiEndpointUrl.V2.WVW.ABILITIES.getUrl() + "/" + abilityId;
        return this.execute(endpointUrl, new TypeReference<WvwAbility>() {});
    }

    public CompletableFuture<List<WvwAbility>> executeByMultipleIds(List<Integer> abilityIds) {
        String endpointUrl = Gw2ApiEndpointUrl.V2.WVW.ABILITIES.getUrl();
        StringBuilder sb = new StringBuilder();
        sb.append(endpointUrl);
        sb.append("?ids=");
        for (Integer abilityId : abilityIds) {
            sb.append(abilityId).append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        return this.execute(endpointUrl, new TypeReference<List<WvwAbility>>() {});
    }
}
