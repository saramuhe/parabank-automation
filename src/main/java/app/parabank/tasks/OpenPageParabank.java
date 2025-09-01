package app.parabank.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenPageParabank {

    private OpenPageParabank() {
    }

    public static Task inTheWeb() {
        return Task.where("{0} abre la pagina de Parabank",
                Open.url("https://parabank.parasoft.com/")
        );
    }
}
