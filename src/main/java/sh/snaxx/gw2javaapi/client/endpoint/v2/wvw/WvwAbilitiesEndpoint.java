package sh.snaxx.gw2javaapi.client.endpoint.v2.wvw;

import sh.snaxx.gw2javaapi.client.Gw2ApiClient;

public final class WvwAbilitiesEndpoint {

    private Gw2ApiClient apiClient;

    public WvwAbilitiesEndpoint(Gw2ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public WvwAbilityByIdEndpoint id(Integer abilityId) {
        return new WvwAbilityByIdEndpoint(this.apiClient, abilityId);
    }
}
