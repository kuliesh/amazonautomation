package ua.startit;

import org.testng.annotations.Test;
import pageobjects.SignUpPage;

public class SignUpTest extends BaseTest {

    //private By navLinkLocator = By.id("nav-link-accountList");

    @Test(groups = {"p0", "smoke"})
    public void testSignUp() {
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.signup();


    }

    @Test(groups = "p1")
    public void testSignUp2() {
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.signup();
    }

    @Test(groups = "p2")
    public void testSignUp3() {
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.signup();
    }

}
