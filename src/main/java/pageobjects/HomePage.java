package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private By inputFieldLocator = By.id("twotabsearchtextbox");
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void search(String text) {
        WebElement inputField = driver.findElement(inputFieldLocator);
        inputField.sendKeys(text);
        inputField.submit();
    }
}
