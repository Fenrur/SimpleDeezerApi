package fr.fenrur.deezer.api.playerwidget;

import java.awt.*;

public class DeezerPlayerWidgetBuilder {

    public static String LAYOUT_DARK = "dark";
    public static String LAYOUT_LIGHT = "light";

    public static String FORMAT_CLASSIC = "classic";
    public static String FORMAT_SQUARE = "square";

    private DeezerPlayerWidget.MusicType type;
    private boolean showPlaylist;
    private int width = 350;
    private int height = 700;
    private boolean autoPlaying = false;
    private String format = FORMAT_CLASSIC;
    private String layout = LAYOUT_DARK;
    private int id;
    private Color color = Color.getColor("#007FEB");
    private boolean allowTransparency = true;
    private int frameBorder = 0;

    public DeezerPlayerWidgetBuilder(int id) {
        this.id = id;
    }

    /**
     * @param allowTransparency the allowTransparency to set
     */
    public DeezerPlayerWidgetBuilder setAllowTransparency(boolean allowTransparency) {
        this.allowTransparency = allowTransparency;
        return this;
    }

    /**
     * @param autoPlaying the autoPlaying to set
     */
    public DeezerPlayerWidgetBuilder setAutoPlaying(boolean autoPlaying) {
        this.autoPlaying = autoPlaying;
        return this;
    }

    /**
     * @param showPlaylist the showPlaylist to set
     */
    public DeezerPlayerWidgetBuilder setShowPlaylist(boolean showPlaylist) {
        this.showPlaylist = showPlaylist;
        return this;
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public DeezerPlayerWidgetBuilder setColor(Color color) {
        this.color = color;
        return this;
    }

    /**
     * @return the format
     */
    public String getFormat() {
        return format;
    }

    /**
     * @param format the format to set
     */
    public DeezerPlayerWidgetBuilder setFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * @return the frameBorder
     */
    public int getFrameBorder() {
        return frameBorder;
    }

    /**
     * @param frameBorder the frameBorder to set
     */
    public DeezerPlayerWidgetBuilder setFrameBorder(int frameBorder) {
        this.frameBorder = frameBorder;
        return this;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public DeezerPlayerWidgetBuilder setId(int id) {
        this.id = id;
        return this;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public DeezerPlayerWidgetBuilder setHeight(int height) {
        this.height = height;
        return this;
    }

    /**
     * @return the layout
     */
    public String getLayout() {
        return layout;
    }

    /**
     * @param layout the layout to set
     */
    public DeezerPlayerWidgetBuilder setLayout(String layout) {
        this.layout = layout;
        return this;
    }

    /**
     * @return the type
     */
    public DeezerPlayerWidget.MusicType getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public DeezerPlayerWidgetBuilder setType(DeezerPlayerWidget.MusicType type) {
        this.type = type;
        return this;
    }

    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width the widget to set
     */
    public DeezerPlayerWidgetBuilder setWidth(int width) {
        this.width = width;
        return this;
    }

    public DeezerPlayerWidget build() {
        return null;
    }
}