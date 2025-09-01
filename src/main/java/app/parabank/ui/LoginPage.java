package app.parabank.ui;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target USERNAME_FIELD = Target.the("username").located(By.name("username"));
    public static final Target PASSWORD_FIELD = Target.the("password").located(By.name("password"));
    public static final Target LOGIN_BUTTON = Target.the("button login").located(By.cssSelector("input.button[value='Log In']"));
}

