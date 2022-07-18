package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
//    private By btnLogin = By.cssSelector(".Userstyle__NoWrap-sc-6e6am-12.gJAiTt");
    private By formModal = By.xpath("//div[@class='styles__Root-sc-2hr4xa-0 jyAQAr']");
    private By headerCart = By.xpath("//div[@class='styles__StyledHeading-sc-1m1v98v-0 jKLiJX']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickLoginPage(){
        clickButton(".Userstyle__NoWrap-sc-6e6am-12.gJAiTt");
        return new LoginPage(driver);

    }


    public CartPage switchCartPage(){
        return new CartPage(driver);
    }

    public SearchPage switchSearchPage(){
        return new SearchPage(driver);
    }


    private void clickButton(String btn){
        driver.findElement(By.cssSelector(btn)).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //Doi 1 so dieu kien duoc dap ung truoc khi tiep tuc,
        //doi 5 giay de form modal xuat hien, neu khong xuat hien, neu sau 5s ma no khong xuat hien thi se nem ra 1 ngoai le
        //Thoi gian cho la thoi gian toi da ma no se doi, tuy nhien
        wait.until(ExpectedConditions.presenceOfElementLocated(formModal));
    }

//    private void clickButtonToCart(String btn){
//        driver.findElement(By.cssSelector(btn)).click();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        //Doi 1 so dieu kien duoc dap ung truoc khi tiep tuc,
//        //doi 5 giay de form modal xuat hien, neu khong xuat hien, neu sau 5s ma no khong xuat hien thi se nem ra 1 ngoai le
//        //Thoi gian cho la thoi gian toi da ma no se doi, tuy nhien
//        wait.until(ExpectedConditions.presenceOfElementLocated(headerCart));
//    }

}
