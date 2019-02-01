package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BasePage {

    private WebDriver driver;
    //private static final String URL = "https://www.amazon.com";

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void befTest() {
        String path = System.getProperty("user.dir");
        System.setProperty("webdriver.gecko.driver", path + "/drivers/geckodriver");
        driver = new FirefoxDriver();
        driver
                .manage()
                .timeouts()
                .implicitlyWait(10, TimeUnit.SECONDS);
    }
}
