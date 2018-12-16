package fr.fenrur.deezer.api.ex;

public class MissingParameterException extends DeezerException {
    MissingParameterException(String message) {
        super(message);
    }

    MissingParameterException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
