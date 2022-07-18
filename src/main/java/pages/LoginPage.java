package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private WebDriver driver;
    private By phoneNumberField = By.cssSelector("input[placeholder='Số điện thoại']");
    private By continueButton = By.cssSelector("div[class='styles__StyledLoginWithPhone-sc-si1ros-0 jdahxv'] form button");

    LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setPhoneNumber(String phone){
        driver.findElement(phoneNumberField).sendKeys(phone);
    }

    public EnterPasswordPage clickContinueButton(){
        driver.findElement(continueButton).click();
        return new EnterPasswordPage(driver);
    }

}
