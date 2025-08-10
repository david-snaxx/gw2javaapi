package sh.snaxx.gw2javaapi;

import sh.snaxx.gw2javaapi.client.Gw2ApiClient;
import sh.snaxx.gw2javaapi.model.v2.wvw.WvwMatchOverview;

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

        Gw2ApiClient gw2ApiClient = new Gw2ApiClient();
        gw2ApiClient.get().v2().wvw()
                .matches()
                .worldScores(1008)
                .execute()
                .join();
    }
}
