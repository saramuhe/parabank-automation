package app.parabank.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;


import static app.parabank.ui.LoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LogIn implements Task {

    public static LogIn withCredentials() {
        return instrumented(LogIn.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String username = actor.recall("username");
        String password = actor.recall("password");

        actor.attemptsTo(
                Enter.theValue(username).into(USERNAME_FIELD),
                Enter.theValue(password).into(PASSWORD_FIELD),
                Click.on(LOGIN_BUTTON)
        );
    }
}

