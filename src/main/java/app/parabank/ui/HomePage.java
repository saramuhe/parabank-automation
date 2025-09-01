package app.parabank.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target REGISTER_LINK = Target.the("Register link")
            .located(By.linkText("Register"));
    public static final Target LOGOUT_LINK = Target.the("link Logout")
            .located(By.linkText("Log Out"));


}

