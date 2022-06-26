package stepDefinitions;

import Pages.HomePage;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class mainPage {

    public  static   WebDriver driver;
    protected static HomePage homepage;
    @BeforeAll
    public static void user_open_chrome_browser()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.nopcommerce.com/");
        homepage=new HomePage(driver);
    }
    @AfterAll
    public static void quitDriver() throws InterruptedException {
      driver.quit();
    }
}
