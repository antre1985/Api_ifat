package validators;

import datatest.DataTest;
import io.restassured.response.Response;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class RateFormatValidator {

    public static void checkAmountFormat(Response response) {
        String responseBody = response.asString();

        Pattern pattern = Pattern.compile(DataTest.AMOUNT_REGEX);
        Matcher matcher = pattern.matcher(responseBody);

        assertThat(
                "Формат поля 'amount' не соответствует ожидаемому (X,XXXX)",
                matcher.find(),
                is(true)
        );
    }
}