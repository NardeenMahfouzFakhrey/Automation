package Company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WishList extends Categories {
  WebDriver driver;
    public WishList(WebDriver driver) {
        super(driver);
        this.driver=driver;
    }
    public void addFirstProductToWishList(){
        selectCategoryBook();
        driver.findElement(By.xpath("//div[@data-productid='37']")).click();
        driver.findElement(By.id("add-to-wishlist-button-37")).click();
    }

    public void addSecondProductToWishlist(){
        selectSubCategory();
        driver.findElement(By.xpath("//div[@data-productid='18']")).click();
        driver.findElement(By.id("add-to-wishlist-button-18")).click();
    }
    public String getWishLisT(){
        return driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div/p")).getText();
    }

}
