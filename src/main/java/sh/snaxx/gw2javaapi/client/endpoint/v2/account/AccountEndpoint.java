package sh.snaxx.gw2javaapi.client.endpoint.v2.account;

import com.fasterxml.jackson.core.type.TypeReference;
import sh.snaxx.gw2javaapi.client.Gw2ApiClient;
import sh.snaxx.gw2javaapi.constant.Gw2ApiEndpointUrl;
import sh.snaxx.gw2javaapi.model.v2.account.AccountOverview;

import java.util.concurrent.CompletableFuture;

public class AccountEndpoint {

    private Gw2ApiClient gw2ApiClient;
    private String endpointUrl = Gw2ApiEndpointUrl.V2.ACCOUNT.BASE.getUrl();

    public AccountEndpoint(Gw2ApiClient gw2ApiClient) {
        this.gw2ApiClient = gw2ApiClient;
    }

    public CompletableFuture<AccountOverview> getAccountOverview() {
        return this.gw2ApiClient.makeAsyncGet(this.endpointUrl, new TypeReference<AccountOverview>() {});
    }

    public AccountAchievementsEndpoint achievements() {
        return new AccountAchievementsEndpoint(this.gw2ApiClient);
    }

    public AccountBankEndpoint bank() {
        return new AccountBankEndpoint(this.gw2ApiClient);
    }

    public AccountBuildStorageEndpoint buildStorage() {
        return new AccountBuildStorageEndpoint(this.gw2ApiClient);
    }

    public AccountDailyCraftingEndpoint dailyCrafting() {
        return new AccountDailyCraftingEndpoint(this.gw2ApiClient);
    }

    public AccountDungeonsEndpoint dungeons() {
        return new AccountDungeonsEndpoint(this.gw2ApiClient);
    }

    public AccountDyesEndpoint dyes() {
        return new AccountDyesEndpoint(this.gw2ApiClient);
    }

    public AccountEmotesEndpoint emotes() {
        return new AccountEmotesEndpoint(this.gw2ApiClient);
    }

    public AccountFinishersEndpoint finishers() {
        return new AccountFinishersEndpoint(this.gw2ApiClient);
    }

    public AccountGlidersEndpoint gliders() {
        return new AccountGlidersEndpoint(this.gw2ApiClient);
    }
}
