package ua.startit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pageobjects.BasePage;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public WebDriver driver;
    private static final String URL = "https://www.amazon.com";

    @BeforeTest(alwaysRun = true)
    public void setEnv() {
//        BasePage basePage = new BasePage(driver);
//        basePage.befTest();
        String path = System.getProperty("user.dir");
        System.setProperty("webdriver.gecko.driver", path + "/drivers/geckodriver");
        driver = new FirefoxDriver();
        driver
                .manage()
                .timeouts()
                .implicitlyWait(10, TimeUnit.SECONDS);
    }

    @BeforeMethod(alwaysRun = true)
    public void openHomePage() {
        driver.get(URL);
    }

    @AfterTest(alwaysRun = true)
    public void closeBrowser() {
        driver.close();
    }
}
