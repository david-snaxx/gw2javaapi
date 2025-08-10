package sh.snaxx.gw2javaapi.client.endpoint.v2.account;

import com.fasterxml.jackson.core.type.TypeReference;
import sh.snaxx.gw2javaapi.client.Gw2ApiClient;
import sh.snaxx.gw2javaapi.constant.Gw2ApiEndpointUrl;
import sh.snaxx.gw2javaapi.model.v2.account.AccountOverview;

import java.util.concurrent.CompletableFuture;

public final class AccountEndpoint {

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

    public AccountHomeEndpoint home() {
        return new AccountHomeEndpoint(this.gw2ApiClient);
    }

    public AccountHomesteadEndpoint homestead() {
        return new AccountHomesteadEndpoint(this.gw2ApiClient);
    }

    public AccountInventoryEndpoint inventory() {
        return new AccountInventoryEndpoint(this.gw2ApiClient);
    }

    public AccountJadebotsEndpoint jadebots() {
        return new AccountJadebotsEndpoint(this.gw2ApiClient);
    }

    public AccountLegendaryArmoryEndpoint legendaryArmory() {
        return new AccountLegendaryArmoryEndpoint(this.gw2ApiClient);
    }

    public AccountLuckEndpoint luck() {
        return new AccountLuckEndpoint(this.gw2ApiClient);
    }

    public AccountMailCarriersEndpoint mailCarriers() {
        return new AccountMailCarriersEndpoint(this.gw2ApiClient);
    }

    public AccountMapChestsEndpoint mapChests() {
        return new AccountMapChestsEndpoint(this.gw2ApiClient);
    }

    public AccountMasteriesEndpoint masteries() {
        return new AccountMasteriesEndpoint(this.gw2ApiClient);
    }

    public AccountMaterialsEndpoint materials() {
        return new AccountMaterialsEndpoint(this.gw2ApiClient);
    }

    public AccountMinisEndpoint minis() {
        return new AccountMinisEndpoint(this.gw2ApiClient);
    }

    public AccountMountsEndpoint mounts() {
        return new AccountMountsEndpoint(this.gw2ApiClient);
    }

    public AccountNoveltiesEndpoint novelties() {
        return new AccountNoveltiesEndpoint(this.gw2ApiClient);
    }

    public AccountOutfitsEndpoint outfits() {
        return new AccountOutfitsEndpoint(this.gw2ApiClient);
    }

    public AccountProgressionEndpoint progression() {
        return new AccountProgressionEndpoint(this.gw2ApiClient);
    }

    public AccountPvpHeroesEndpoint pvpHeroes() {
        return new AccountPvpHeroesEndpoint(this.gw2ApiClient);
    }

    public AccountRaidsEndpoint raids() {
        return new AccountRaidsEndpoint(this.gw2ApiClient);
    }

    public AccountRecipesEndpoint recipes() {
        return new AccountRecipesEndpoint(this.gw2ApiClient);
    }

    public AccountSkiffsEndpoint skiffs() {
        return new AccountSkiffsEndpoint(this.gw2ApiClient);
    }

    public AccountSkinsEndpoint skins() {
        return new AccountSkinsEndpoint(this.gw2ApiClient);
    }

    public AccountTitlesEndpoint titles() {
        return new AccountTitlesEndpoint(this.gw2ApiClient);
    }

    public AccountWalletEndpoint wallet() {
        return new AccountWalletEndpoint(this.gw2ApiClient);
    }

    public AccountWizardsVaultEndpoint wizardsvault() {
        return new AccountWizardsVaultEndpoint(this.gw2ApiClient);
    }

    public AccountWorldbossesEndpoint worldbosses() {
        return new AccountWorldbossesEndpoint(this.gw2ApiClient);
    }

    public AccountWvwEndpoint wvw() {
        return new AccountWvwEndpoint(this.gw2ApiClient);
    }
}
