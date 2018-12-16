package fr.fenrur.deezer.api;

public interface Comment {

    int getId();

    String getText();

    long getDate();

    DeezerValue getObject();
}
