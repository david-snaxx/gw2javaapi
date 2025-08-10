package sh.snaxx.gw2javaapi;

import sh.snaxx.gw2javaapi.client.Gw2ApiClient;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Integer> wvwAbilityIds = new ArrayList<>();
        wvwAbilityIds.add(2);
        wvwAbilityIds.add(3);
        wvwAbilityIds.add(23);
        wvwAbilityIds.add(24);

        List<String> wvwMatchIds = new ArrayList<>();
        wvwMatchIds.add("1-1");
        wvwMatchIds.add("1-2");

        Gw2ApiClient apiClient = new Gw2ApiClient();
        apiClient.request()
                .v2()
                .wvw()
                .abilities()
                .getAbility(2)
                .thenAccept(response -> {
                    System.out.println(response.getDescription());
                })
                .exceptionally(e -> {
                    e.printStackTrace();
                    return null;
                });
    }
}
