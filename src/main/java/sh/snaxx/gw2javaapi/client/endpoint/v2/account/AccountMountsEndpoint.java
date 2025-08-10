package sh.snaxx.gw2javaapi.client.endpoint.v2.account;

import com.fasterxml.jackson.core.type.TypeReference;
import sh.snaxx.gw2javaapi.client.Gw2ApiClient;
import sh.snaxx.gw2javaapi.constant.Gw2ApiEndpointUrl;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public final class AccountMountsEndpoint {

    private Gw2ApiClient gw2ApiClient;
    private String endpointUrl = Gw2ApiEndpointUrl.V2.ACCOUNT.MOUNTS.getUrl();
    private String skinsUrl = Gw2ApiEndpointUrl.V2.ACCOUNT.MOUNT_SKINS.getUrl();
    private String typesUrl = Gw2ApiEndpointUrl.V2.ACCOUNT.MOUNT_TYPES.getUrl();

    public AccountMountsEndpoint(Gw2ApiClient gw2ApiClient) {
        this.gw2ApiClient = gw2ApiClient;
    }

    private CompletableFuture<List<String>> getMountEndpointIds() {
        return this.gw2ApiClient.makeAsyncGet(this.endpointUrl, new TypeReference<List<String>>() {});
    }

    private CompletableFuture<List<Integer>> getOwnedMountSkinIds() {
        return this.gw2ApiClient.makeAsyncGet(this.skinsUrl, new TypeReference<List<Integer>>() {});
    }

    private CompletableFuture<List<String>> getOwnedMountTypes() {
        return this.gw2ApiClient.makeAsyncGet(this.typesUrl, new TypeReference<List<String>>() {});
    }
}
