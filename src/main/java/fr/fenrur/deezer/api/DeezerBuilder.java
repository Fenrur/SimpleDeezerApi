package fr.fenrur.deezer.api;

import fr.fenrur.deezer.api.ex.DeezerBuilderException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.net.URI;

public class DeezerBuilder {

    private final OkHttpClient client;
    private final int appId;
    private final URI redirectLink;
    private final Permissions[] permissions;

    public DeezerBuilder(int appId, URI redirectLink, Permissions... permissions) {
        this.client = new OkHttpClient();
        this.appId = appId;
        this.redirectLink = redirectLink;
        this.permissions = permissions;
    }


    public Response build() {
        StringBuilder builder = new StringBuilder();
        for (Permissions permission : permissions) {
            builder.append(permission.getPermission()).append(",");
        }
        builder.deleteCharAt(builder.length() - 1);

        Request request = new Request.Builder()
                .url("https://connect.deezer.com/fr/oauth/auth.php?app_id=" + appId + "&redirect_uri=" + redirectLink.toString() + "&perms=" + builder + "&response_type=token")
                .build();


        try {
            Response response = client.newCall(request).execute();
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);

            if (response.request().url().toString().endsWith("login")) {
                if (response.body().string().contains("You must specify a valid")) {
                    try {
                        throw new DeezerBuilderException("Bad URL redirect Link " + redirectLink.toString() + "\nFor find App Id -> https://developers.deezer.com/myapps/app");
                    } catch (DeezerBuilderException e) {
                        e.printStackTrace();
                    }
                }

            } else if (response.body().string().contains("No application data")) {
                try {
                    throw new DeezerBuilderException("Bad App Id " + appId + "\nFor find App Id -> https://developers.deezer.com/myapps/app");
                } catch (DeezerBuilderException e) {
                    e.printStackTrace();
                }
            }

            return response;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
