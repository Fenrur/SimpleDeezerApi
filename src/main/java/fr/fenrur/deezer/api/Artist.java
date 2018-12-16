package fr.fenrur.deezer.api;

import java.net.URI;

public interface Artist extends DeezerPicture, DeezerValue {

    int getId();

    String getName();

    URI getLink();

    URI getShare();

    int getAlbumCount();

    Album getAlbum();

    int getFans();

    boolean hasRadio();

    URI getTrackListURI();

    TrackList getTrackList();

    TrackList getTrackList(int limit, int index);
}
