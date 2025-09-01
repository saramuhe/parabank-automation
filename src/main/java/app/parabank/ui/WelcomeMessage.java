package app.parabank.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WelcomeMessage {

    public static final Target WELCOME_MESSAGE_REGISTER = Target.the("message welcome after register")
            .locatedBy("//div[@id='rightPanel']/h1");

    public static final Target WELCOME_MESSAGE_LOGIN =
            Target.the("welcome message login")
                    .locatedBy("//div[@id='leftPanel']/p");
}
