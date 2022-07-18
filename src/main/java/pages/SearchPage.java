package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchPage {
    private WebDriver driver;
    private By inputSearch = By.cssSelector("input[data-view-id='main_search_form_input']");
    private By searchButton = By.cssSelector("button[data-view-id='main_search_form_button']");

    private By searchTextResult = By.cssSelector("div[class='title'] h1");

    private By chooseProduct = By.xpath("(//a[@class='product-item'])[1]");


    public SearchPage(WebDriver driver){
        this.driver = driver;
    }

    public void setSearchResult(String result){
        driver.findElement(inputSearch).sendKeys(result);
    }
    public void clickSearch(){
        driver.findElement(searchButton).click();
    }

    public BuyPage clickChooseProduct(){
        driver.findElement(chooseProduct).click();
        return new BuyPage(driver);
    }

//    public void clickChooseProduct(){
//        driver.findElement(chooseProduct).click();
//    }

    public void searchProduct(String result){
        this.setSearchResult(result);
        this.clickSearch();
        waitForAppear();
    }
    public void waitForAppear(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(searchTextResult));
    }
}
