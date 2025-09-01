package app.parabank.utils;

import app.parabank.models.UserData;
import com.github.javafaker.Faker;

import java.util.Locale;

public class GenerateData {
    private static final Faker FAKER = new Faker(Locale.forLanguageTag("es-MX"));

    public static String firstName() {
        return FAKER.name().firstName();
    }

    public static String lastName() {
        return FAKER.name().lastName();
    }

    public static String address() {
        return FAKER.address().streetAddress();
    }

    public static String city() {
        return FAKER.address().city();
    }

    public static String state() {
        return FAKER.address().state();
    }

    public static String zipCode() {
        return FAKER.address().zipCode();
    }

    public static String phone() {
        return FAKER.phoneNumber().cellPhone();
    }

    public static String ssn() {
        return FAKER.idNumber().ssnValid();
    }

    public static String username() {
        return FAKER.name().username();
    }

    public static String password() {
        return FAKER.internet().password();
    }


    public static UserData randomUser() {
        UserData user = new UserData();
        user.setFirstName(firstName());
        user.setLastName(lastName());
        user.setAddress(address());
        user.setCity(city());
        user.setState(state());
        user.setZipCode(zipCode());
        user.setPhone(phone());
        user.setSsn(ssn());
        user.setUsername(username());
        user.setPassword(password());
        return user;
    }
}




