package fr.fenrur.deezer.api;

public interface Options {

    boolean canStreaming();

    int getStreamingDuration();

    boolean isOffline();

    boolean canActivatedHQ();

    boolean displayADS();

    boolean activatesAudioADS();

    boolean haveTooManyDevices();

    boolean canSubscribe();

    int getLimitSkipsRadio();

    boolean isAvailableLossless();

    boolean allowDiplayPreview();

    boolean allowStreamRadio();
}
