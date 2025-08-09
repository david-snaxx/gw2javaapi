package sh.snaxx.gw2javaapi.client.endpoint.v2.wvw;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.Request;
import okhttp3.Response;
import sh.snaxx.gw2javaapi.client.Gw2ApiClient;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public final class WvwAbilitiesEndpoint {

    private Gw2ApiClient apiClient;

    public WvwAbilitiesEndpoint(Gw2ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public List<Integer> execute() {
        Request request = new Request.Builder()
                .get()
                .url("https://api.guildwars2.com/v2/wvw/abilities")
                .build();
        try (Response response = this.apiClient.getClient().newCall(request).execute()) {
            if (response.isSuccessful()) {
                String json = response.body().string();
                ObjectMapper mapper = new ObjectMapper();
                List<Integer> integers = mapper.readValue(json, mapper.getTypeFactory().constructCollectionType(List.class, Integer.class));
                return integers;
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
            return null;
        }
        return null;
    }
}
