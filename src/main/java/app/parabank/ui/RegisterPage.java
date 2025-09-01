package app.parabank.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterPage {

    public static final Target FIRST_NAME = Target.the("firstName").located(By.id("customer.firstName"));
    public static final Target LAST_NAME = Target.the("lastName").located(By.id("customer.lastName"));
    public static final Target ADDRESS = Target.the("street").located(By.id("customer.address.street"));
    public static final Target CITY = Target.the("city").located(By.id("customer.address.city"));
    public static final Target STATE = Target.the("estado").located(By.id("customer.address.state"));
    public static final Target ZIP_CODE = Target.the("state").located(By.id("customer.address.zipCode"));
    public static final Target PHONE = Target.the("zipCode").located(By.id("customer.phoneNumber"));
    public static final Target SSN = Target.the("ssn").located(By.id("customer.ssn"));
    public static final Target USERNAME = Target.the("username").located(By.id("customer.username"));
    public static final Target PASSWORD = Target.the("password").located(By.id("customer.password"));
    public static final Target CONFIRM_PASSWORD = Target.the("confirm password").located(By.id("repeatedPassword"));
    public static final Target REGISTER_BUTTON = Target.the("button register").located(By.cssSelector("input[value='Register']"));

}
