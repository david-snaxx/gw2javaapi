package sh.snaxx.gw2javaapi.client.endpoint.v2.wvw;

import sh.snaxx.gw2javaapi.client.Gw2ApiClient;

import java.util.List;

public final class WvwAbilitiesEndpoint {

    private Gw2ApiClient apiClient;

    public WvwAbilitiesEndpoint(Gw2ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public WvwAbilityByIdEndpoint id(Integer abilityId) {
        return new WvwAbilityByIdEndpoint(this.apiClient, abilityId);
    }

    public WvwMultipleAbilitiesByIdEndpoint multipleIds(List<Integer> abilityIds) {
        return new WvwMultipleAbilitiesByIdEndpoint(this.apiClient, abilityIds);
    }
}
