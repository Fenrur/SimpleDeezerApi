package fr.fenrur.deezer.api.search;

import fr.fenrur.deezer.api.Album;
import fr.fenrur.deezer.api.Artist;

import java.net.URI;

public interface Search {

    int getId();

    boolean isReadable();

    String getTitle();

    String getShortTitle();

    String getTrackVersion();

    URI getLink();

    int getDuration();

    int getRank();

    boolean hasExplicitLyrics();

    URI getPreview();

    Artist getArtist();

    Album getAlbum();
}
