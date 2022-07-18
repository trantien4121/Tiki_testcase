package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EnterPasswordPage {
    private WebDriver driver;

    private By passwordField = By.cssSelector("input[placeholder='Mật khẩu']");
    private By loginButton = By.cssSelector("div[class='styles__StyledLoginWithPass-sc-1p7u8we-0 AFbbS'] form button");

    private By formInputPass = By.xpath("//h4[contains(text(),'Nhập mật khẩu')]");

    private By loginSuccess = By.xpath("//span[@class='Userstyle__NoWrap-sc-6e6am-12 gJAiTt']");
    private By userIcon = By.xpath("//span[contains(text(),'Trần Tiến')]");


    public EnterPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForAppear(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(formInputPass));
    }

    public void waitForLogin(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(userIcon));
    }

    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public void Login(){
        driver.findElement(loginButton).click();
    }

    public HomePage clickLogin(){
        driver.findElement(loginButton).click();
        return new HomePage(driver);
    }

}
