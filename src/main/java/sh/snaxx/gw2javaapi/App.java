package sh.snaxx.gw2javaapi;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import sh.snaxx.gw2javaapi.client.Gw2ApiClient;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Gw2ApiClient gw2ApiClient = new Gw2ApiClient();
        List<Integer> val = gw2ApiClient.get()
                .v2()
                .wvw()
                .abilities()
                .execute();

        System.out.println(val.toString());
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
