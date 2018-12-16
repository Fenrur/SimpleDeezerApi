package fr.fenrur.deezer.api;

import java.net.URI;
import java.util.List;

public interface TrackList extends List<Track> {

    int getLimit();

    int getIndex();

    URI getLink();
}
