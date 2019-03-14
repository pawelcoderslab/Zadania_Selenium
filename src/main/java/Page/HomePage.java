package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;



public class HomePage {


        WebDriver driver;


        @FindBy(className = "login")
        WebElement loginButton;

        @FindBy(css = "[title='Women']")
        WebElement womenTab;

        @FindBy(css = "[title='T-shirts']")
        WebElement womenTshirtTab;


        public HomePage(WebDriver driver){
            this.driver = driver;
        }

        public void clickSignInButton(){
            loginButton.click();

        }

        public void clickWomenTab (){

            womenTab.click();
        }

        public void clickWomenTshirtTab(){

            Actions action = new Actions(driver);
            action.moveToElement(womenTab).perform();
            womenTshirtTab.click();

        }




}
