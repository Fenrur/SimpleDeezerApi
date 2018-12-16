package fr.fenrur.deezer.api;

import java.net.URI;

public interface Podcast extends DeezerPicture {

    int getId();

    String getTitle();

    String getDescription();

    boolean isAvailable();

    int getRating();

    int getFansCount();

    URI getLink();

    URI getShare();
}
