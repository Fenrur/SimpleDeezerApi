package fr.fenrur.deezer.api;

import java.net.URI;
import java.util.List;
import java.util.Optional;

public interface Album extends DeezerValue {

    int getId();

    String getTitle();

    String getUPC();

    URI getLink();

    URI getShare();

    URI getCover();

    URI getSmallCover();

    URI getMediumCover();

    URI getBigCover();

    URI getXLCover();

    Optional<Genre> getGenre();

    List<Genre> getGenres();

    String getLabel();

    int getTracksCount();

    int getDuration();

    int getFans();

    int getRating();

    long getReleaseDate();

    RecordType getRecordType();

    boolean isAvailable();

    Album getAlternative();

    URI getTrackListURL();

    TrackList getTrackList();

    TrackList getTrackList(int limit, int index);

    boolean hasExplicitLyrics();

    List<Album> getContributors();

    Artist getArtist();

    List<Track> getTracks();

    boolean rateAlbum(int rate);

    boolean addAlbum(int albumId);

    boolean removeAlbum(int albumId);
}
