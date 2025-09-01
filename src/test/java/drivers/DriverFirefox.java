package drivers;

import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverFirefox implements DriverSource {

    @Override
    public WebDriver newDriver() {
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("-private");  // Firefox's equivalent of incognito
        options.addArguments("--width=1920");
        options.addArguments("--height=1080");
        return new FirefoxDriver(options);
    }

    @Override
    public boolean takesScreenshots() {
        return true;
    }
}

