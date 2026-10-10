package validators;

import io.restassured.response.Response;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class StatusCodeValidator {

    public static void checkStatusCode(Response response, int expectedCode) {
        assertThat(
                "Неверный статус-код ответа",
                response.getStatusCode(),
                equalTo(expectedCode)
        );
    }
}
