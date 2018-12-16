package fr.fenrur.deezer.api;

import java.net.URI;

public interface Episode extends DeezerPicture {

    int getId();

    String getTitle();

    String getDescription();

    boolean isAvailable();

    long getRealeaseDate();

    int getDuration();

    URI getLink();

    URI getShare();

    Podcast getpodcast();
}
