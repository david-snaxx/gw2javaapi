package sh.snaxx.gw2javaapi.exception;

/**
 * A MissingRequiredApiKeyException is thrown any time a Guild Wars 2 endpoint requires an api key to
 * return a valid response, and there was none provided for the GET request.
 * <p>
 * The GET request should have either <code>?access_token={apiKey}</code> applied to the url OR
 * a valid <code>Authorization</code> header with the value <code>Bearer {apiKey}</code>.
 */
public class MissingRequiredApiKeyException extends GuildWars2ApiException {

    public MissingRequiredApiKeyException(String message) {
        super("The requested API endpoint requires a Guild Wars 2 account API key and no key was supplied.");
    }
}
