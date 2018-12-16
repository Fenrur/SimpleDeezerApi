package fr.fenrur.deezer.api;

import java.net.URI;
import java.util.List;

public interface Playlist extends DeezerValue, DeezerPicture {

    int getId();

    String getTitle();

    String getDescription();

    int getDuration();

    boolean isPublic();

    boolean isLovedTrack();

    boolean isCollaborative();

    int getRating();

    int getTracksCount();

    int getUnSeenTrackCount();

    int getFans();

    URI getLink();

    URI getShare();

    String getChecksum();

    List<Track> getTracks();
}
