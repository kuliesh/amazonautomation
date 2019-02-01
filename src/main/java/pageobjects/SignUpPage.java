package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SignUpPage {

    private WebDriver driver;
    private By navLinkLocator = By.id("nav-link-accountList");

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public void signup() {
        WebElement navLink = driver.findElement(navLinkLocator);
        Actions action = new Actions(driver);
        action
                .moveToElement(navLink)
                .build()
                .perform();


        // 3. Click the 'Sign in' value
        driver.findElement(By.linkText("Sign in")).click();
    }
}
