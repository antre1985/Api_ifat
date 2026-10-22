package validators;

import io.restassured.response.Response;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class SchemaValidator {

    public static void checkRateSchema(Response response) {
        response.then()
                .body(matchesJsonSchemaInClasspath("schemas/rate_schema.json"));
    }
}
