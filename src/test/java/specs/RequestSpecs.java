package specs;

import datatest.DataTest;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RequestSpecs {

    public static RequestSpecification baseRequestSpec() {
        return new RequestSpecBuilder()
                .setBaseUri(DataTest.BASE_URL)
                .setBasePath(DataTest.BASE_PATH)
                .addQueryParam("type", DataTest.TYPE_NBRB)
                .build()
                .log().all();
    }
}
