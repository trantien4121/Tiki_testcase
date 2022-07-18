package search;

import base.BaseTests;
import login.LoginTests;
import org.testng.annotations.Test;
import pages.BuyPage;
import pages.SearchPage;

public class SearchPageTests extends LoginTests {

    @Test
    public void testSuccessfullySearch() throws InterruptedException{
        SearchPage searchPage = homePage.switchSearchPage();
        searchPage.searchProduct("chuột không dây");
//        Thread.sleep(2000);
//        searchPage.clickChooseProduct();
        BuyPage buyPage = searchPage.clickChooseProduct();
        buyPage.clickChooseProduct();
    }

}
