package fr.fenrur.deezer.api;

import java.net.URI;

public class Main {

    public static void main(String... args) {
        DeezerBuilder d = new DeezerBuilder(316464, URI.create("https://www.francisbot/token.com"), Permissions.EMAIL, Permissions.BASIC_ACCESS);
        d.build();
    }
}
