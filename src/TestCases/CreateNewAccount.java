package TestCases;

import Page.AuthenticationPage;
import Page.HomePage;
import PageFactory.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CreateNewAccount {

    @Test
    public void createNewAccount (){

        WebDriver driver = BrowserFactory.startBrowser("chrome","http://automationpractice.com/index.php");
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        AuthenticationPage authenticationPage = PageFactory.initElements(driver,AuthenticationPage.class);
        homePage.clickSignInButton();
        authenticationPage.enterEmailForNewAccount("kasia@kowalskaa.pl");
        authenticationPage.clickCreateNewAccount();
        authenticationPage.selectMrs();
        authenticationPage.enterFirstName("Kasia");
        authenticationPage.enterLastName("Kowalska");
        authenticationPage.enterPassword("12345");
        authenticationPage.setDateOfBirth("20","10","2000");
        authenticationPage.newsletterAgreement();
        authenticationPage.specialOffersAgreement();
        authenticationPage.enterFirstNamePI("Kasia");
        authenticationPage.enterLastNamePI("Kowalska");
        authenticationPage.enterAddress("Krucza");
        authenticationPage.enterCityName("Warszawa");
        authenticationPage.setState("California");
        authenticationPage.enterPostCode("11111");
        authenticationPage.enterMobilePhone("12345678");
        authenticationPage.enterAliasAddress("a");
        authenticationPage.registerUser();
        authenticationPage.verifyUserLogged("Kasia Kowalska");
        driver.quit();

    }
}
