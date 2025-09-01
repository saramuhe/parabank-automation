package app.parabank.tasks;

import app.parabank.models.UserData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static app.parabank.ui.HomePage.REGISTER_LINK;
import static app.parabank.ui.RegisterPage.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegisterUser implements Task {

    private  UserData userData;

    public RegisterUser(UserData userData) {
        this.userData = userData;
    }

    public static RegisterUser withTheData(UserData userData) {
        return instrumented(RegisterUser.class, userData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(REGISTER_LINK),
                Enter.theValue(userData.getFirstName()).into(FIRST_NAME),
                Enter.theValue(userData.getLastName()).into(LAST_NAME),
                Enter.theValue(userData.getAddress()).into(ADDRESS),
                Enter.theValue(userData.getCity()).into(CITY),
                Enter.theValue(userData.getState()).into(STATE),
                Enter.theValue(userData.getZipCode()).into(ZIP_CODE),
                Enter.theValue(userData.getPhone()).into(PHONE),
                Enter.theValue(userData.getSsn()).into(SSN),
                Enter.theValue(userData.getUsername()).into(USERNAME),
                Enter.theValue(userData.getPassword()).into(PASSWORD),
                Enter.theValue(userData.getPassword()).into(CONFIRM_PASSWORD),
                Click.on(REGISTER_BUTTON)
        );
        actor.remember("username", userData.getUsername());
        actor.remember("password", userData.getPassword());
        actor.remember("nameComplete", userData.getFirstName() + " " + userData.getLastName()
        );
    }
}
