package Company;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    public JavascriptExecutor j;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    private void ClickLink(String LinkText){
        driver.findElement(By.linkText(LinkText)).click();
    }

    public Company.RegisterPage ToRegisterPage(){
        ClickLink("Register");
        return new Company.RegisterPage(driver);
    }
    public Company.LoginPage TologinPage(){
        ClickLink("Log in");
        return new Company.LoginPage(driver);
    }
    public Company.LoginBeforeSearch LoginBeforeSearch(){
        return new Company.LoginBeforeSearch(driver);
    }
    public Company.Currency currencePage(){

        return new Company.Currency(driver);
    }
    public Company.SearchPage SearchPage1(){
        return new Company.SearchPage(driver);
    }
    public Company.Categories CategoriesPage1(){
        return new Company.Categories(driver);
    }
    public Company.ShoppingCart ShoppingCartPage1(){
        return new Company.ShoppingCart(driver);
    }
    public WishList WishListCartPage1(){
        return new WishList(driver);
    }
    public CompareListCart CompareListCartPage(){
        return new CompareListCart(driver);
    }
    public Company.Checkout CheckOutPage(){
        return new Company.Checkout(driver);
    }
    public Company.FilterWithColor FliterColorPage(){
        return new Company.FilterWithColor(driver);
    }
    public Company.ProductTAG ProducTag(){
        return new Company.ProductTAG(driver);
    }
    public Company.ResetPassword restPasspage(){
        ClickLink("Forgot password?");
        return new Company.ResetPassword(driver);
    }
    public void scrollTo(String scroll) {
        j= (JavascriptExecutor) driver;
        j.executeScript("scrollBy(0," + scroll + ")");
    }
}
