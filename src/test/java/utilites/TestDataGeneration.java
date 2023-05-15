package utilites;

import com.github.javafaker.Faker;

public class TestDataGeneration {
    private static Faker faker = new Faker();

    public static String getNumber() {
        return  faker.numerify("##");
    }
}
