package sh.snaxx.gw2javaapi;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import sh.snaxx.gw2javaapi.client.Gw2ApiClient;
import sh.snaxx.gw2javaapi.model.WvwAbility;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Gw2ApiClient client = new Gw2ApiClient();
        client.get()
            .v2()
            .wvw()
            .abilities()
            .id(2)
            .execute()
            .thenAccept(wvwAbility -> {
                System.out.println(wvwAbility);
            })
            .exceptionally(e -> {
                e.printStackTrace();
                return null;
            });
    }

    /**
     * This is an example of a very basic GET call with Okhttp
     */
    private static void basicGetCall() {
        OkHttpClient client = new OkHttpClient.Builder()
                .build();
        Request request = new Request.Builder()
                .url("https://api.guildwars2.com/v2/wvw/upgrades/14")
                .build();
        try(Response response = client.newCall(request).execute()) {
            if (response.isSuccessful()) {
                System.out.println(response.body().string());
            } else  {
                System.out.println(response.code() + " " + response.message());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
