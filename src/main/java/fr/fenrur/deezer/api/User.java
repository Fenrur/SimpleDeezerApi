package fr.fenrur.deezer.api;

import java.net.URI;
import java.util.List;

public interface User extends DeezerPicture {

    int getId();

    String getName();

    String getLastName();

    String getFirstName();

    String getEmail();

    Status getStatue();

    long getBirthday();

    long getInscriptionDate();

    GenderType getGender();

    URI getLink();

    String getCountry();

    String getLang();

    boolean isKid();

    URI getTrackListURI();

    TrackList getTrackList();

    TrackList getTrackList(int limit, int index);
}
