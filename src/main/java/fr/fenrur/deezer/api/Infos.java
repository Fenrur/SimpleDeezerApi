package fr.fenrur.deezer.api;

import java.util.List;

public interface Infos {

    String getISO();

    String getCountry();

    boolean isOpen();

    String getPop();

    List<Offer> getOffers();
}
