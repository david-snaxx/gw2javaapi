package sh.snaxx.gw2javaapi.client.endpoint;

import com.fasterxml.jackson.core.type.TypeReference;
import sh.snaxx.gw2javaapi.client.Gw2ApiClient;
import sh.snaxx.gw2javaapi.client.Gw2ApiClientOptions;

import java.util.concurrent.CompletableFuture;

public abstract class AbstractGw2ApiEndpoint {

    private Gw2ApiClient gw2ApiClient;

    public AbstractGw2ApiEndpoint(Gw2ApiClient gw2ApiClient) {
        this.gw2ApiClient = gw2ApiClient;
    }

    public <T> CompletableFuture<T> execute(String endpointUrl, TypeReference<T> responseType) {
        return this.gw2ApiClient.makeAsyncGet(endpointUrl, responseType);
    }

    public <T> CompletableFuture<T> executeWithOptionsAdjustment(String endpointUrl, TypeReference<T> responseType, Gw2ApiClientOptions clientOptions) {
        return this.gw2ApiClient.makeAsyncGetWithOptionsAdjustment(endpointUrl, responseType, clientOptions);
    }

    public <T> CompletableFuture<T> executeWithOptionsOverride(String endpointUrl, TypeReference<T> responseType, Gw2ApiClientOptions clientOptions) {
        return this.gw2ApiClient.makeAsyncGetWithOptionsOverride(endpointUrl, responseType, clientOptions);
    }
}
