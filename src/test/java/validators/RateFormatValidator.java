package validators;

import datatest.DataTest;
import io.restassured.response.Response;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.matchesPattern;

public class RateFormatValidator {

    public static void checkAmountFormat(Response response) {
        String amount = response.jsonPath().getString("amount");

        assertThat(
                "Формат поля 'amount' не соответствует ожидаемому (X,XXXX)",
                amount,
                matchesPattern(DataTest.AMOUNT_REGEX)
        );
    }
}
