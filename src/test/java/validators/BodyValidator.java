package validators;

import io.restassured.response.Response;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class BodyValidator {

    public static void checkBanksKey(Response response) {
        assertThat(
                "В ответе отсутствует ключ 'banks'",
                response.jsonPath().getMap("$"),
                hasKey("banks")
        );
    }

    public static void checkGrowNotNull(Response response) {
        assertThat(
                "Поле 'grow' равно null",
                response.jsonPath().get("grow"),
                notNullValue()
        );
    }
}
