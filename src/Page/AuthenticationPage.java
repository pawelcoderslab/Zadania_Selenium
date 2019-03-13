package Page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class AuthenticationPage {
    WebDriver driver;


    @FindBy(id = "email_create")
    WebElement emailField;

    @FindBy(id = "email")
    WebElement emailLoginField;

    @FindBy (id = "passwd")
    WebElement passwordLoginField;

    @FindBy (id ="SubmitLogin")
    WebElement confirmLogin;

    @FindBy(id = "SubmitCreate")
    WebElement createAccountButton;

    @FindBy(id="id_gender2")
    WebElement mrsRadio;

    @FindBy(id="customer_firstname")
    WebElement firstName;

    @FindBy(id="customer_lastname")
    WebElement lastName;

    @FindBy(id="passwd")
    WebElement password;

    @FindBy(id="days")
    WebElement drpDay;

    @FindBy(id="months")
    WebElement drpMonth;

    @FindBy(id="years")
    WebElement drpYear;

    @FindBy(id="newsletter")
    WebElement newsletterCheckbox;

    @FindBy(id="optin")
    WebElement specialOffersCheckbox;

    @FindBy(id="firstname")
    WebElement firstNamePI;

    @FindBy(id="lastname")
    WebElement lastNamePI;

    @FindBy(id="address1")
    WebElement address;

    @FindBy(id="city")
    WebElement city;

    @FindBy(id="id_state")
    WebElement drpState;

    @FindBy(id="postcode")
    WebElement postCode;

    @FindBy(id="id_country")
    WebElement drpCountry;

    @FindBy(id="phone_mobile")
    WebElement mobilePhone;

    @FindBy(id="alias")
    WebElement aliasAddress;

    @FindBy(id="submitAccount")
    WebElement registerButton;

    @FindBy(className = "account")
    WebElement accountName;




    public AuthenticationPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterEmailForNewAccount (String email){
        emailField.sendKeys(email);

    }

    public void clickCreateNewAccount () {

        createAccountButton.click();
    }

    public void selectMrs(){

        mrsRadio.click();
    }

    public void enterFirstName (String firstNameStr){


        firstName.sendKeys(firstNameStr);
    }

    public void enterLastName (String lastNameStr){

        lastName.sendKeys(lastNameStr);
    }
    public void enterPassword (String pass){

        password.sendKeys(pass);
    }

    public void setDateOfBirth (String day, String month, String year){

        Select dropDownDay = new Select(drpDay);
        Select dropDownMonth = new Select(drpMonth);
        Select dropDownYear =  new Select(drpYear);
        dropDownDay.selectByValue(day);
        dropDownMonth.selectByValue(month);
        dropDownYear.selectByValue(year);
    }

    public void newsletterAgreement(){

        newsletterCheckbox.click();
    }

    public void specialOffersAgreement(){

        specialOffersCheckbox.click();
    }

    public void enterFirstNamePI (String name){

        firstNamePI.sendKeys(name);
    }

    public void enterLastNamePI (String lastName){

        lastNamePI.sendKeys(lastName);
    }

    public void enterAddress (String add){

        address.sendKeys(add);
    }

    public void enterCityName (String cityName){

        city.sendKeys(cityName);
    }
    public void setState (String state){

        Select dropDownDay = new Select(drpState);
        dropDownDay.selectByVisibleText(state);

    }

    public void enterPostCode (String code){

        postCode.sendKeys(code);
    }
    public void setCountry (String country){

        Select dropDownDay = new Select(drpCountry);
        dropDownDay.selectByValue(country);

    }

    public void enterMobilePhone (String phoneNum){

        mobilePhone.sendKeys(phoneNum);
    }

    public void enterAliasAddress (String address){

        aliasAddress.sendKeys(address);
    }

    public void registerUser () {

        registerButton.click();
    }

    public void verifyUserLogged(String expectedName){

        String user = accountName.getText();
        Assert.assertEquals(expectedName, user);
    }

    public void Login (String email, String pass){

        emailLoginField.sendKeys(email);
        passwordLoginField.sendKeys(pass);
        confirmLogin.click();

    }

}
