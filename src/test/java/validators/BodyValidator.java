package validators;

import datatest.DataTest;
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

    public static void checkAmount(Response response) {
        assertThat(
                "Поле 'amount' не совпадает с ожидаемым",
                response.jsonPath().getString("amount"),
                equalTo(DataTest.EXPECTED_AMOUNT)
        );
    }

    public static void checkScale(Response response) {
        assertThat(
                "Поле 'scale' не совпадает с ожидаемым",
                response.jsonPath().getInt("scale"),
                equalTo(DataTest.EXPECTED_SCALE)
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
