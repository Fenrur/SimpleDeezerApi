package fr.fenrur.deezer.api;

import java.net.URI;
import java.util.List;

public interface Radio extends DeezerPicture {

    int getId();

    String getTitle();

    String getDescription();

    URI getShare();

    URI getTrackListURI();

    TrackList getTrackList();

    TrackList getTrackList(int limit, int index);
}
