package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultPage {


    private WebDriver driver;
    private By filterNew = By.xpath("//span[@class='a-list-item']//*[contains(text(),'New')]");
    private By fourStarsFilter = By.xpath("//i[contains(@class,'a-star-medium-4')]");


    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enableFilterNew() {
        driver.findElement(filterNew).click();
    }

    public void enableFourStarFilter() {
        waitToBeClickable(fourStarsFilter, 10).click();
    }

    WebElement waitToBeClickable(By by, int timeout) {
        return setWait(timeout).until(ExpectedConditions.elementToBeClickable(by));
    }

    WebElement waitToBeVisible(By by, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    WebDriverWait setWait(int timeout) {
        return new WebDriverWait(driver, timeout);
    }
}
