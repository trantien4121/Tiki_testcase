package login;

import base.BaseTests;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.EnterPasswordPage;
import pages.HomePage;
import pages.LoginPage;
import pages.SearchPage;

import java.time.Duration;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfullyLogin()  {
        LoginPage loginPage = homePage.clickLoginPage();
        loginPage.setPhoneNumber("0345476075");
        EnterPasswordPage enterPasswordPage = loginPage.clickContinueButton();
        enterPasswordPage.waitForAppear();
        enterPasswordPage.setPassword("Tien@2001");
        enterPasswordPage.Login();
        enterPasswordPage.waitForLogin();
    }

}
