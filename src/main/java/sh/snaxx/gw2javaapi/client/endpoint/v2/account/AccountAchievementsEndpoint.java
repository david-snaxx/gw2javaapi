package sh.snaxx.gw2javaapi.client.endpoint.v2.account;

import com.fasterxml.jackson.core.type.TypeReference;
import sh.snaxx.gw2javaapi.client.Gw2ApiClient;
import sh.snaxx.gw2javaapi.constant.Gw2ApiEndpointUrl;
import sh.snaxx.gw2javaapi.model.v2.account.AccountAchievement;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class AccountAchievementsEndpoint {

    private Gw2ApiClient gw2ApiClient;
    private String endpointUrl = Gw2ApiEndpointUrl.V2.ACCOUNT.ACHIEVEMENTS.getUrl();

    public AccountAchievementsEndpoint(Gw2ApiClient gw2ApiClient) {
        this.gw2ApiClient = gw2ApiClient;
    }

    public CompletableFuture<List<AccountAchievement>> getAllAchievements() {
        return this.gw2ApiClient.makeAsyncGet(this.endpointUrl, new TypeReference<List<AccountAchievement>>() {});
    }

    public CompletableFuture<AccountAchievement> getAchievement(Integer achievementId) {
        String endpointUrl = this.endpointUrl + "?id=" + achievementId;
        return this.gw2ApiClient.makeAsyncGet(endpointUrl, new TypeReference<AccountAchievement>() {});
    }

    public CompletableFuture<List<AccountAchievement>> getMultipleAchievements(List<Integer> achievementIds) {
        StringBuilder sb = new  StringBuilder();
        sb.append(this.endpointUrl).append("?ids=");
        for (Integer achievementId : achievementIds) {
            sb.append(achievementId);
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        return this.gw2ApiClient.makeAsyncGet(sb.toString(), new TypeReference<List<AccountAchievement>>() {});
    }
}
