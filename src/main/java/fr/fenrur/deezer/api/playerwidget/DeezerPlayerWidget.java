package fr.fenrur.deezer.api.playerwidget;

import java.awt.*;

public interface DeezerPlayerWidget {

    int getId();

    boolean isShowPlaylist();

    int getWidget();

    int getHeight();

    boolean isAutoPlaying();

    MusicType getType();

    String getFormat();

    String getSize();

    String getLayout();

    int getAppId();

    Color getColor();

    boolean isEmptyPlayer();

    boolean isAllowingTransparency();

    int getFrameBorder();

    String generateIFrameHTML();

    String generateJS();

    enum MusicType {
        PLAYLIST,
        ALBUM,
        TRACKS,
        PODCAST,
        EPISODES,
        MIX,
        ARTIST,
        CHARTS,
        USER;

        MusicType() {

        }

        public String getMusicType() {
            return this.toString().toLowerCase();
        }
    }
}