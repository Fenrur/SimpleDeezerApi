package fr.fenrur.deezer.api;

public enum Permissions {

    BASIC_ACCESS("Access users basic information", "Incl. name, firstname, profile picture only."),
    EMAIL("Get the user's email", ""),
    OFFLINE_ACCESS("Access user data any time", "Application may access user data at any time"),
    MANAGE_LIBRARY("Manage users' library", "Add/rename a playlist. Add/order songs in the playlist."),
    MANAGE_COMMUNITY("Manage users' friends", "Add/remove a following/follower."),
    DELETE_LIBRARY("Delete library items", "Allow the application to delete items in the user's library"),
    LISTENING_HISTORY("Allow the application to access the user's listening history", "");

    private final String title;
    private final String description;

    Permissions(String title, String description) {
        this.title = title;
        this.description = description;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    public String getPermission() {
        return this.toString().toLowerCase();
    }
}