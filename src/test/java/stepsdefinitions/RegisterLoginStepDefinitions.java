package stepsdefinitions;

import app.parabank.models.UserData;
import app.parabank.questions.LoginMessage;
import app.parabank.questions.RegisterMessage;
import app.parabank.tasks.LogIn;
import app.parabank.tasks.LogOut;
import app.parabank.tasks.OpenPageParabank;
import app.parabank.tasks.RegisterUser;
import app.parabank.utils.GenerateData;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class RegisterLoginStepDefinitions {

    private Actor user = Actor.named("Usuario");
    private UserData testUser;


    @Managed
    WebDriver browser;

    @Given("que el usuario ingresa a la pagina de Parabank")
    public void queElUsuarioIngresaALaPaginaDeParabank() {
        user.can(BrowseTheWeb.with(browser));
        user.attemptsTo(OpenPageParabank.inTheWeb());
    }

    @When("el usuario se registra con datos validos")
    public void elUsuarioSeRegistraConDatosValidos() {
        testUser = GenerateData.randomUser();
        user.attemptsTo(RegisterUser.withTheData(testUser));
        user.should(seeThat("the welcome message after register", RegisterMessage.displayed(), containsString(
                user.recall("username"))));
    }

    @And("el usuario inicia sesion con las credenciales registradas")
    public void elUsuarioIniciaSesionConLasCredencialesRegistradas() {
        user.attemptsTo(LogOut.fromApp());
        user.attemptsTo(LogIn.withCredentials());

    }

    @Then("el usuario ingresa correctamente a la plataforma Parabank")
    public void elUsuarioIngresaCorrectamenteALaPlataformaParabank() {
        user.should(seeThat("the welcome message after login", LoginMessage.displayed(), containsString(
                user.recall("nameComplete")))
        );
    }
}
