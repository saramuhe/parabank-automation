package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

        features = "src/test/resources/features/register-login.feature",
        glue = "stepsdefinitions",
        plugin = {
                "pretty",
                "html:target/register-login.html",
                "json:target/register-login.json",
                "junit:target/register-login-results.xml",
                "rerun:target/rerun.txt"
        },
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class RegisterLoginRunner {
}
