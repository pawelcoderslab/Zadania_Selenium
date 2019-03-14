package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BrowserFactory {

    static WebDriver driver;


    public static WebDriver startBrowser(String browserName, String url) {

        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
            driver = new ChromeDriver();
        } else {

            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
}
