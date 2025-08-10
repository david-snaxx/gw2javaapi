package sh.snaxx.gw2javaapi.client.endpoint;

import com.fasterxml.jackson.core.type.TypeReference;
import sh.snaxx.gw2javaapi.client.Gw2ApiClient;
import sh.snaxx.gw2javaapi.client.Gw2ApiClientOptions;

import java.util.concurrent.CompletableFuture;

/**
 * Abstract base for endpoint classes within the {@code sh.snaxx.gw2javaapi.lient.endpoint} package.
 * <p>
 * <pre>
 * Implementing classes should do the following:
 * - The generic {@code <T>} should be replaced with the object type expected from the endpoint.
 * - A {@code TypeReference<T>} should be set with {@code this.setResponseType} in the constructor.
 * - A String endpoint url should be set with {@code this.setEndpointUrl} in the constructor.
 * </pre>
 * @see {@link sh.snaxx.gw2javaapi.constant.Gw2ApiEndpointUrl} for endpoint url constants.
 * @param <T> The return type expected from making a GET request to this endpoint.
 */
public abstract class AbstractGw2ApiEndpoint<T> {

    private Gw2ApiClient gw2ApiClient;
    private TypeReference<T> responseType;
    private String endpointUrl;

    public AbstractGw2ApiEndpoint(Gw2ApiClient gw2ApiClient) {
        this.gw2ApiClient = gw2ApiClient;
    }

    public CompletableFuture<T> execute() {
        return this.gw2ApiClient.makeAsyncGet(this.endpointUrl, this.getResponseType());
    }

    public CompletableFuture<T> executeWithOptionsAdjustment(Gw2ApiClientOptions clientOptions) {
        return this.gw2ApiClient.makeAsyncGetWithOptionsAdjustment(this.endpointUrl,
                this.getResponseType(),
                clientOptions);
    }

    public CompletableFuture<T> executeWithOptionsOverride(Gw2ApiClientOptions clientOptions) {
        return this.gw2ApiClient.makeAsyncGetWithOptionsOverride(this.endpointUrl,
                this.getResponseType(),
                clientOptions);
    }

    public String getEndpointUrl() { return this.endpointUrl; }
    public void setEndpointUrl(String endpointUrl) { this.endpointUrl = endpointUrl; }

    public TypeReference<T> getResponseType() { return this.responseType; }
    public void setResponseType(TypeReference<T> responseType) { this.responseType = responseType; }
}
