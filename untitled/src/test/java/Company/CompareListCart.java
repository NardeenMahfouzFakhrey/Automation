package Company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompareListCart extends Company.Categories {
    WebDriver driver;

    public CompareListCart(WebDriver driver) {
        super(driver);
        this.driver=driver;
    }
    public void addFirstProductToCompareListCart() {
        selectCategoryBook();
        driver.findElement(By.xpath("//div[@data-productid='38']")).click();
        driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[9]/div[2]/button")).click();
    }
    public void addSecondProductToCompareListCart(){
        selectSubCategory();
        driver.findElement(By.xpath("//div[@data-productid='20']")).click();
        driver.findElement(By.xpath("//button[@onclick='return AjaxCart.addproducttocomparelist(\"/compareproducts/add/20\"),!1']")).click();
    }
    public String getToCompare(){

        return driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div/p")).getText();
    }



}
