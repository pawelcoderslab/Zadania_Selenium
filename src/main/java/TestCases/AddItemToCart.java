package TestCases;

import Page.AuthenticationPage;
import Page.HomePage;
import Page.ProductsPage;
import PageFactory.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AddItemToCart {

    @Test
    public void addItemToCart () {

        WebDriver driver = BrowserFactory.startBrowser("chrome", "http://automationpractice.com/index.php");
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        ProductsPage productsPage = PageFactory.initElements(driver, ProductsPage.class);
        AuthenticationPage authenticationPage = PageFactory.initElements(driver, AuthenticationPage.class);
        homePage.clickWomenTab();
        productsPage.selectProduct("Faded Short Sleeve T-shirts");
        productsPage.addProductToCartAfterSelecting();
        driver.quit();

    }

}
