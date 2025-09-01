package app.parabank.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static app.parabank.ui.WelcomeMessage.WELCOME_MESSAGE_LOGIN;

public class LoginMessage implements Question <String>{

    public static LoginMessage displayed() {
        return new LoginMessage();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(WELCOME_MESSAGE_LOGIN).answeredBy(actor);
    }
}
