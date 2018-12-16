package fr.fenrur.deezer.api.ex;

public class OAuthException extends DeezerException {
    OAuthException(String message) {
        super(message);
    }

    OAuthException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
