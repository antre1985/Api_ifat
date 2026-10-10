package validators;

import io.restassured.response.Response;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class HeaderValidator {

    public static void checkContentTypeJson(Response response) {
        assertThat(
                "Content-Type не содержит application/json",
                response.getHeader("Content-Type"),
                containsString("application/json")
        );
    }
}
