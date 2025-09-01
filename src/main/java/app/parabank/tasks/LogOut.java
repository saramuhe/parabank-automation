package app.parabank.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;

import static app.parabank.ui.HomePage.LOGOUT_LINK;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LogOut implements Task {

    public static LogOut fromApp() {
        return instrumented(LogOut.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LOGOUT_LINK)
        );
    }
}

