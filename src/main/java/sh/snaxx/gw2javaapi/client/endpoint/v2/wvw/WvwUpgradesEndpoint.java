package sh.snaxx.gw2javaapi.client.endpoint.v2.wvw;

import com.fasterxml.jackson.core.type.TypeReference;
import sh.snaxx.gw2javaapi.client.Gw2ApiClient;
import sh.snaxx.gw2javaapi.constant.Gw2ApiEndpointUrl;
import sh.snaxx.gw2javaapi.model.v2.wvw.WvwUpgrade;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public final class WvwUpgradesEndpoint {

    private Gw2ApiClient gw2ApiClient;
    private String endpointUrl = Gw2ApiEndpointUrl.V2.WVW.UPGRADES.getUrl();

    public WvwUpgradesEndpoint(Gw2ApiClient gw2ApiClient) {
        this.gw2ApiClient = gw2ApiClient;
    }

    public CompletableFuture<List<Integer>> getAllUpgradeIds() {
        return this.gw2ApiClient.makeAsyncGet(this.endpointUrl, new TypeReference<List<Integer>>() {});
    }

    public CompletableFuture<WvwUpgrade> getUpgrade(Integer upgradeId) {
        String endpointUrl = this.endpointUrl + "/" + upgradeId;
        return this.gw2ApiClient.makeAsyncGet(endpointUrl, new TypeReference<WvwUpgrade>() {});
    }

    public CompletableFuture<List<WvwUpgrade>> getMultipleUpgrades(List<Integer> upgradeIds) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.endpointUrl).append("?ids=");
        for (Integer upgradeId : upgradeIds) {
            sb.append(upgradeId);
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        return this.gw2ApiClient.makeAsyncGet(sb.toString(), new TypeReference<List<WvwUpgrade>>() {});
    }
}
