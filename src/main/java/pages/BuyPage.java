package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuyPage {
    private WebDriver driver;
    private By btnBuy = By.cssSelector(".btn.btn-add-to-cart");

    public BuyPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickChooseProduct(){
        driver.findElement(btnBuy).click();
    }
}
