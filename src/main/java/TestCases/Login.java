package TestCases;

import Page.AuthenticationPage;
import Page.HomePage;
import PageFactory.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;




public class Login {



    @Test
    public void loginToAnAccount () {

        WebDriver driver = BrowserFactory.startBrowser("chrome", "http://automationpractice.com/index.php");
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        AuthenticationPage authenticationPage = PageFactory.initElements(driver, AuthenticationPage.class);
        homePage.clickSignInButton();
        authenticationPage.Login("kasia@kowalskaa.pl", "12345");
        authenticationPage.verifyUserLogged("Kasia Kowalska");
        driver.quit();

    }

}
