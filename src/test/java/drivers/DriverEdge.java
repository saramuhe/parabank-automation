package drivers;

import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class DriverEdge implements DriverSource {

    @Override
    public WebDriver newDriver() {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--inprivate");
        options.addArguments("--start-maximized");
        return new org.openqa.selenium.edge.EdgeDriver(options);
    }

    @Override
    public boolean takesScreenshots() {
        return true;
    }
}
