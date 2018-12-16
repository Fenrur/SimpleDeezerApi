package fr.fenrur.deezer.api;

import java.net.URI;
import java.util.List;

public interface Chart {

    int getId();

    String getTitle();

    String getShortTitle();

    String getTrackVersion();

    URI getLink();

    int getDuration();

    int getRank();

    boolean hasExplicitLyrics();

    int getPosition();

    Artist getArtist();

    Album getAlbum();

    List<Album> getAlbums();

    List<Artist> getArtists();

    List<Playlist> getPlayLists();
}
