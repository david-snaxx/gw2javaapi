package sh.snaxx.gw2javaapi.client.endpoint.v2.wvw;

import sh.snaxx.gw2javaapi.client.Gw2ApiClient;
import sh.snaxx.gw2javaapi.model.WvwAbility;

import java.util.concurrent.CompletableFuture;

public class WvwAbilityByIdEndpoint {

    private Gw2ApiClient apiClient;
    private Integer abilityId;

    public  WvwAbilityByIdEndpoint(Gw2ApiClient apiClient, Integer abilityId) {
        this.apiClient = apiClient;
        this.abilityId = abilityId;
    }

    public CompletableFuture<WvwAbility> execute() {
        return this.apiClient.makeAsyncGet("https://api.guildwars2.com/v2/wvw/abilities/" + this.abilityId, WvwAbility.class);
    }
}
