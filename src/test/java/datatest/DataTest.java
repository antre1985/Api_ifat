package datatest;

public class DataTest {

    public static final String BASE_URL = "https://profile.onliner.by";
    public static final String BASE_PATH = "/sdapi/kurs/api";
    public static final String BEST_RATE_ENDPOINT = "/bestrate";
    public static final String TYPE_NBRB = "nbrb";

    public static final String EXPECTED_AMOUNT = "3,5893";
    public static final int EXPECTED_SCALE = 1;

    public static final String AMOUNT_REGEX = "amount\"\\s*:\\s*\"\\d+,\\d{4}";
}
