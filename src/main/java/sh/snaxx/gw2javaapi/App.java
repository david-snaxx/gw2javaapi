package sh.snaxx.gw2javaapi;

import sh.snaxx.gw2javaapi.client.Gw2ApiClient;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        List<Integer> wvwAbilityIds = new ArrayList<>();
        wvwAbilityIds.add(2);
        wvwAbilityIds.add(3);
        wvwAbilityIds.add(23);
        wvwAbilityIds.add(24);

        Gw2ApiClient gw2ApiClient = new Gw2ApiClient();
        gw2ApiClient.get()
                .v2()
                .wvw()
                .guilds("na")
                .execute()
                .thenAccept(response -> {
                    response.forEach((key, value) -> {
                        System.out.println(key + " : " + value);
                    });
                })
                .exceptionally(t -> {
                    t.printStackTrace();
                    return null;
                });
    }
}
