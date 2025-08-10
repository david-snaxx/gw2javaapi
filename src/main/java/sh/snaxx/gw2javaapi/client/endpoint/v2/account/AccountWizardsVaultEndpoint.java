package sh.snaxx.gw2javaapi.client.endpoint.v2.account;

import com.fasterxml.jackson.core.type.TypeReference;
import sh.snaxx.gw2javaapi.client.Gw2ApiClient;
import sh.snaxx.gw2javaapi.constant.Gw2ApiEndpointUrl;
import sh.snaxx.gw2javaapi.model.v2.account.AccountWizardsVaultDaily;
import sh.snaxx.gw2javaapi.model.v2.account.AccountWizardsVaultListing;
import sh.snaxx.gw2javaapi.model.v2.account.AccountWizardsVaultSpecial;
import sh.snaxx.gw2javaapi.model.v2.account.AccountWizardsVaultWeekly;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public final class AccountWizardsVaultEndpoint {

    private Gw2ApiClient gw2ApiClient;
    private String dailyEndpoint = Gw2ApiEndpointUrl.V2.ACCOUNT.WIZARDS_VAULT_DAILY.getUrl();
    private String listingsEndpoint = Gw2ApiEndpointUrl.V2.ACCOUNT.WIZARDS_VAULT_LISTINGS.getUrl();
    private String specialEndpoint = Gw2ApiEndpointUrl.V2.ACCOUNT.WIZARDS_VAULT_SPECIAL.getUrl();
    private String weeklyEndpoint = Gw2ApiEndpointUrl.V2.ACCOUNT.WIZARDS_VAULT_WEEKLY.getUrl();

    public AccountWizardsVaultEndpoint(Gw2ApiClient gw2ApiClient) {
        this.gw2ApiClient = gw2ApiClient;
    }

    public CompletableFuture<AccountWizardsVaultDaily> getDailyProgress() {
        return this.gw2ApiClient.makeAsyncGet(this.dailyEndpoint, new TypeReference<AccountWizardsVaultDaily>() {});
    }

    public CompletableFuture<List<AccountWizardsVaultListing>> getListings() {
        return this.gw2ApiClient.makeAsyncGet(this.listingsEndpoint, new TypeReference<List<AccountWizardsVaultListing>>() {});
    }

    public CompletableFuture<List<AccountWizardsVaultSpecial>> getSpecials() {
        return this.gw2ApiClient.makeAsyncGet(this.specialEndpoint, new TypeReference<List<AccountWizardsVaultSpecial>>() {});
    }

    public CompletableFuture<List<AccountWizardsVaultWeekly>> getWeeklies() {
        return this.gw2ApiClient.makeAsyncGet(this.weeklyEndpoint, new TypeReference<List<AccountWizardsVaultWeekly>>() {});
    }
}
