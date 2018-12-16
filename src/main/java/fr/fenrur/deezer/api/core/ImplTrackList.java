package fr.fenrur.deezer.api.core;

import fr.fenrur.deezer.api.Track;
import fr.fenrur.deezer.api.TrackList;

import java.net.URI;
import java.util.ArrayList;
import java.util.Optional;

public class ImplTrackList extends ArrayList<Track> implements TrackList {

    private final int limit;
    private final int index;

    public ImplTrackList(int limit, int index) {
        this.limit = limit;
        this.index = index;
    }

    @Override
    public int getLimit() {
        return 0;
    }

    @Override
    public int getIndex() {
        return 0;
    }

    @Override
    public URI getLink() {
        return null;
    }

    public Optional<TrackList> getPreviousTrackList() {
        return null;
    }
}
