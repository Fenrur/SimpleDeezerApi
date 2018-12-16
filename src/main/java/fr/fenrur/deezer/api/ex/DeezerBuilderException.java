package fr.fenrur.deezer.api.ex;

public class DeezerBuilderException extends DeezerException {

    public DeezerBuilderException(String message) {
        super(message);
    }

    DeezerBuilderException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
