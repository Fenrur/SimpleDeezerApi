package fr.fenrur.deezer.api;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class DeezerAuthTest {

    public static void main(String... args) throws IOException {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://connect.deezer.com/fr/oauth/auth.php?app_id=316464&redirect_uri=https://www.francisbot/token.com&perms=basic_access&response_type=token")
//                .url("https://connect.deezer.com/oauth/auth.php?app_id=316464&redirect_uri=https://www.francisbot/token.com&perms=basic_access,email&display=touch")
                .build();

        Response response = client.newCall(request).execute();

        System.out.println((response.body() == null));
        System.out.println(response.body().string());
    }
}
