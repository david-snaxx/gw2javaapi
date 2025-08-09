package sh.snaxx.gw2javaapi;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import sh.snaxx.gw2javaapi.client.Gw2ApiClient;
import sh.snaxx.gw2javaapi.constant.Gw2ApiEndpointUrl;
import sh.snaxx.gw2javaapi.model.WvwAbility;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Integer> abilityIds = new ArrayList<>();
        abilityIds.add(2);
        abilityIds.add(3);
        abilityIds.add(23);
        abilityIds.add(24);

        Gw2ApiClient gw2ApiClient = new Gw2ApiClient();
        gw2ApiClient.get()
                .v2()
                .wvw()
                .abilities()
                .multipleIds(abilityIds)
                .execute()
                .thenAccept(wvwAbilitiesList -> {
                    for(WvwAbility wvwAbility : wvwAbilitiesList) {
                        System.out.println(wvwAbility.getName());
                        System.out.println();
                    }
                })
                .exceptionally(throwable -> {
                    throwable.printStackTrace();
                    return null;
                });
    }
}
