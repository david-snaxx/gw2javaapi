package sh.snaxx.gw2javaapi.exception;

/**
 * A GuildWars2ApiException is thrown any time there is an issue interacting with the Guild Wars 2 api.
 * <p>
 * Possible exceptions:
 * <ul>
 *     <li>{@link MissingApiKeyException}</li> - Authentication error from missing api key
 * </ul>
 */
public class GuildWars2ApiException extends RuntimeException {

    public GuildWars2ApiException(String message) {
        super(message);
    }
}
