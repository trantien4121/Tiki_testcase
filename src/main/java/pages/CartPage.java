package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.lang.model.element.Element;
import java.time.Duration;

public class CartPage {
    private WebDriver driver;
    private By deleteBtn = By.cssSelector(".product__delete");
    private By dltByb = By.xpath("(//span[@data-view-id='cart_main_remove.product'])[2]");
    private By cartIcon = By.cssSelector(".Userstyle__Item-sc-6e6am-1.Userstyle__CartItemInner-sc-6e6am-2.cHRIKv.cucUum");

    private By headerCart = By.xpath("//div[@class='styles__StyledHeading-sc-1m1v98v-0 jKLiJX']");

    private By confirmForm = By.xpath("//div[@role='dialog']");

    private By modalForm = By.xpath("//div[@id='coupon-modal-container']");

    private By confirmDlt = By.xpath("//div[@class='dialog-control__button dialog-control__button--secondary']");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickToCartIcon(){
        driver.findElement(cartIcon).click();
    }

    public void waitForAppearDltButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(headerCart));
    }

    public void waitForDisAppearConfirmModal(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(modalForm)));
    }

    public void clickDeleteProduct(){
        driver.findElement(dltByb).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(confirmForm));
    }

    public void clickConfirmDelete(){
        driver.findElement(confirmDlt).click();
    }
}
