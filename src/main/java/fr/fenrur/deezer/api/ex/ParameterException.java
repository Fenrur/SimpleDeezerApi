package fr.fenrur.deezer.api.ex;

public class ParameterException extends DeezerException {
    ParameterException(String message) {
        super(message);
    }

    ParameterException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
