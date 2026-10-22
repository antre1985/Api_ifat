package tests;

import clients.RateClient;
import enums.Currency;
import io.restassured.response.Response;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import validators.BodyValidator;
import validators.HeaderValidator;
import validators.RateFormatValidator;
import validators.SchemaValidator;
import validators.StatusCodeValidator;

public class ApiOnlinerTest {

    @DataProvider(name = "currencies")
    public Object[][] currencyProvider() {
        return new Object[][]{
                {Currency.RUB.getCode()},
                {Currency.EUR.getCode()},
                {Currency.USD.getCode()}
        };
    }

    @Test(dataProvider = "currencies")
    public void checkRates(String currency) {
        Response response = RateClient.getRate(currency);

        StatusCodeValidator.checkStatusCode(response, 200);
        HeaderValidator.checkContentTypeJson(response);
        SchemaValidator.checkRateSchema(response);
        BodyValidator.checkBanksKey(response);
        BodyValidator.checkGrowNotNull(response);
        RateFormatValidator.checkAmountFormat(response);
    }
}
