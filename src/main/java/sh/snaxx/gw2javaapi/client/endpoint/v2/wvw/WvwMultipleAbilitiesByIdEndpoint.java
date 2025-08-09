package sh.snaxx.gw2javaapi.client.endpoint.v2.wvw;

import com.fasterxml.jackson.core.type.TypeReference;
import sh.snaxx.gw2javaapi.client.Gw2ApiClient;
import sh.snaxx.gw2javaapi.client.endpoint.AbstractGw2ApiEndpoint;
import sh.snaxx.gw2javaapi.constant.Gw2ApiEndpointUrl;
import sh.snaxx.gw2javaapi.model.WvwAbility;

import java.util.List;

public class WvwMultipleAbilitiesByIdEndpoint extends AbstractGw2ApiEndpoint<List<WvwAbility>> {

    public WvwMultipleAbilitiesByIdEndpoint(Gw2ApiClient apiClient, List<Integer> abilityIds) {
        super(apiClient);

        // ids need to be added in a comma seperated list
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Gw2ApiEndpointUrl.V2.WVW.ABILITIES.getUrl());
        stringBuilder.append("?ids=");
        for (int i = 0; i < abilityIds.size(); i++) {
            stringBuilder.append(abilityIds.get(i));
            stringBuilder.append(",");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);

        this.setEndpointUrl(stringBuilder.toString());
        this.setResponseType(new  TypeReference<List<WvwAbility>>() {});
    }
}
