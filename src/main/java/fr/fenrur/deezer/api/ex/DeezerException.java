package fr.fenrur.deezer.api.ex;

public class DeezerException extends Exception {

    DeezerException(String message) {
        super(message);
    }

    DeezerException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
