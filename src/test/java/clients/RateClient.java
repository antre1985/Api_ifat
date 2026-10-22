package clients;

import datatest.DataTest;
import io.restassured.response.Response;
import specs.RequestSpecs;

import static io.restassured.RestAssured.given;

public class RateClient {

    public static Response getRate(String currency) {
        return given()
                .spec(RequestSpecs.baseRequestSpec())
                .queryParam("currency", currency)
                .when()
                .get(DataTest.BEST_RATE_ENDPOINT);
    }
}
