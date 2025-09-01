package app.parabank.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static app.parabank.ui.WelcomeMessage.*;


public class RegisterMessage implements Question<String> {

        public static  RegisterMessage displayed() {
            return new RegisterMessage();
        }

        @Override
        public String answeredBy(Actor actor) {
            return Text.of(WELCOME_MESSAGE_REGISTER).answeredBy(actor);
        }
    }
