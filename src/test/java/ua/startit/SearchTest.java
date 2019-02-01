package ua.startit;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.SearchResultPage;

import static com.codeborne.selenide.Selenide.$;
import static org.testng.AssertJUnit.assertEquals;

//import static org.testng.Assert.assertEquals;

public class SearchTest extends BaseTest {

    @DataProvider(name = "search queries for amazon")
    public static Object[][] searchQueries() {
        return new Object[][]{
//                {"#search query", "#expected result"},
                {"kettle amazon basics", "White 0.5L Foldable Travel Electric Kettle Food Grade Silicone Collapsable Portable Water Kettle, Easy & Convenient Storage - Boil Dry Protection 110-120V US Plug"},
                {"red dead redemption 2", "PS4 - Red Dead Redemption 2 - Ultimate Edition"}

        };
    }

    @Test(dataProvider = "search queries for amazon",
            groups = {"p0", "smoke", "regression"})
    public void testKettle(String searchQuery, String expectedResult) {
        HomePage homePage = new HomePage(driver);
        homePage.search(searchQuery);

        SearchResultPage resultPage = new SearchResultPage(driver);
        resultPage.enableFilterNew();
        resultPage.enableFourStarFilter();

        // EXPECTED RESULT
          //assertEquals(expectedResult, By.xpath("//*[@id='result_0/]//*[@class='a-size-medium s-inline  s-access-title  a-text-normal']//text()"));
          assertEquals(expectedResult, $(By.xpath("//*[@id='result_0/]//*[@class='a-size-medium s-inline  s-access-title  a-text-normal']//text()")).getText());
    }

}
