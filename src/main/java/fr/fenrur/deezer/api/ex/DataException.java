package fr.fenrur.deezer.api.ex;

public class DataException extends DeezerException {
    DataException(String message) {
        super(message);
    }

    DataException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
