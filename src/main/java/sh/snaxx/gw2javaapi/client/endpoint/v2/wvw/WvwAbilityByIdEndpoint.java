package sh.snaxx.gw2javaapi.client.endpoint.v2.wvw;

import com.fasterxml.jackson.core.type.TypeReference;
import sh.snaxx.gw2javaapi.client.Gw2ApiClient;
import sh.snaxx.gw2javaapi.client.endpoint.AbstractGw2ApiEndpoint;
import sh.snaxx.gw2javaapi.constant.Gw2ApiEndpointUrl;
import sh.snaxx.gw2javaapi.model.WvwAbility;

public final class WvwAbilityByIdEndpoint extends AbstractGw2ApiEndpoint<WvwAbility> {

    public WvwAbilityByIdEndpoint(Gw2ApiClient gw2ApiClient, Integer abilityId) {
        super(gw2ApiClient);
        this.setResponseType(new TypeReference<WvwAbility>() {});
        this.setEndpointUrl(Gw2ApiEndpointUrl.V2.WVW.ABILITIES.getUrl() + "/" + abilityId);
    }
}
