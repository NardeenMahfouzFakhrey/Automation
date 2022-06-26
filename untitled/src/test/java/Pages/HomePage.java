package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.zip.Checksum;

public class HomePage {
    private WebDriver driver;
    public JavascriptExecutor jse;


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    private void ClickLink(String Linkttext){
        driver.findElement(By.linkText(Linkttext)).click();
    }

    public RegisterPage redirectedToregisterPage(){
        ClickLink("Register");
        return new RegisterPage(driver);
    }
    public LoginPage loginPage1(){
        ClickLink("Log in");
        return new LoginPage(driver);
    }

    public Currency currencePage1(){
        return new Currency(driver);
    }
    public SearchPage SearchPage1(){
        // ClickLink("Log in");
        return new SearchPage(driver);
    }
    public Categories CategoriesPage1(){
        return new Categories(driver);
    }
    public ShoppingCart ShoppingCartPage1(){
        return new ShoppingCart(driver);
    }
    public WishListCartPage WishListCartPage1(){
        return new WishListCartPage(driver);
    }
    public CompareListCart CompareListCartPage1(){
        return new CompareListCart(driver);
    }
    public Checkout CheckOutPage1(){
        return new Checkout(driver);
    }
    public FilterWithColor FliterColorPage1(){
        return new FilterWithColor(driver);
    }
    public ProductTAG ProducTag1(){
        return new ProductTAG(driver);
    }
    public ResetPassword restPasspage(){
        ClickLink("Forgot password?");
        return new ResetPassword(driver);
    }
    public void scrollTo(String scroll) {
        jse = (JavascriptExecutor) driver;
        jse.executeScript("scrollBy(0," + scroll + ")");
    }

}
