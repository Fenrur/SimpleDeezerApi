package fr.fenrur.deezer.api;

import java.net.URI;
import java.util.Currency;

public interface Offer {

    int getId();

    String getName();

    float amount();

    Currency getCurrency();

    String getDisplayedAmount();

    URI getTC();

    URI getTC_HTML();

    URI getTC_TEXT();

    int getTryAndBuy();
}
