package stepsdefinitions;



import net.serenitybdd.annotations.Managed;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.Before;

public class Hooks {

    @Managed
    WebDriver driver;

    @Before
    public void maximizeWindow() {
        if (driver != null) {
            driver.manage().window().maximize();
        }
    }
}

