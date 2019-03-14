package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;



import static org.testng.Assert.assertTrue;

public class ProductsPage {

    WebDriver driver;

    @FindBy (css = "#add_to_cart>[type='submit']")
    WebElement addToCart;


    public ProductsPage(WebDriver driver){
        this.driver = driver;
    }

    public void selectProduct (String title){
        WebElement e = driver.findElement(By.cssSelector(".product-name[title='"+title+"']"));
        Actions action = new Actions(driver);
        action.moveToElement(e);
        e.click();
    }

    public void addProductToCartAfterSelecting (){
        Assert.assertEquals(addToCart.isDisplayed(), true);
        addToCart.click();
        assertTrue(driver.findElements( By.cssSelector(".icon-ok") ).size()!=0);

    }
}
