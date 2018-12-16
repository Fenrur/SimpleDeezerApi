package fr.fenrur.deezer.api.ex;

public class InvalidQueryException extends DeezerException {
    InvalidQueryException(String message) {
        super(message);
    }

    InvalidQueryException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
