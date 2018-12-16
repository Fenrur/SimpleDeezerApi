package fr.fenrur.deezer.api;

import okhttp3.Request;
import okhttp3.Response;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.IOException;
import java.net.URI;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class DeezerBuilderTest {

    @Parameterized.Parameter(0)
    public DeezerBuilder builder;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{{new DeezerBuilder(316464, URI.create("https://www.franot/token.com"), Permissions.EMAIL, Permissions.BASIC_ACCESS)}};
        return Arrays.asList(data);
    }

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void build() throws IOException {
        Response r = builder.build();
        Request request = r.request();

    }
}