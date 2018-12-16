package fr.fenrur.deezer.api;

import java.net.URI;
import java.util.List;

public interface Track {

    int getId();

    boolean isReadable();

    String getTitle();

    String getShortTitle();

    String getTrackVersion();

    boolean isUnSeen();

    String getISRC();

    URI getLink();

    URI getShare();

    int getDuration();

    int getTrackPosition();

    int getDiskNumber();

    int getRank();

    long getReleaseDate();

    boolean hasExplicitLyrics();

    URI getPreview();

    float getBPM();

    float getGain();

    List<String> getAvailableCountries();

    Track getAlternative();

    List<Artist> getContributors();

    Artist getArtist();

    Album getAlbum();
}
