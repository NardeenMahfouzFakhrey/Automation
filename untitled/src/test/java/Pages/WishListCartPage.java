package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WishListCartPage extends Categories {
    WebDriver driver;


    public WishListCartPage(WebDriver driver) {
        super(driver);
        this.driver=driver;
    }
    public void addFristproducte(){
        selectCategoryBook();
        driver.findElement(By.xpath("//div[@data-productid='37']")).click();
        driver.findElement(By.id("add-to-wishlist-button-37")).click();
    }

    public void addSecondproducte(){
        selectSubCategory();
        driver.findElement(By.xpath("//div[@data-productid='18']")).click();
        driver.findElement(By.id("add-to-wishlist-button-18")).click();
    }
    public String getresultsuccessaddtowishlist(){
        return driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div/p")).getText();
    }



}
