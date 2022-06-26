package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCart extends Categories {
    WebDriver driver;

    public ShoppingCart(WebDriver driver) {
        super(driver);
        this.driver=driver;
    }
    public void addFirstProductToShoppingCart(){
        selectCategoryBook();
        driver.findElement(By.xpath("//div[@data-productid='39']")).click();
        driver.findElement(By.id("add-to-cart-button-39")).click();
    }


    public String addToTheCart(){

        return driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div/p")).getText();
    }


}
