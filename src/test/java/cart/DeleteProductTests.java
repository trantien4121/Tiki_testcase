package cart;

import base.BaseTests;
import login.LoginTests;
import org.testng.annotations.*;
import pages.CartPage;
import pages.EnterPasswordPage;
import pages.LoginPage;


public class DeleteProductTests extends BaseTests {
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
    @Test
    public void testSuccessfullyDelete() throws InterruptedException{
        testSuccessfullyLogin();
        CartPage cartPage = homePage.switchCartPage();
        cartPage.clickToCartIcon();
        cartPage.waitForAppearDltButton();
        cartPage.clickDeleteProduct();
//        cartPage.waitForDisAppearConfirmModal();
        Thread.sleep(3000);
        cartPage.clickConfirmDelete();
    }
}

