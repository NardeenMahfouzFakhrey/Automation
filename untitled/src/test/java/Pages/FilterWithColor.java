package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class FilterWithColor {
    private WebDriver driver;
    Actions actions;
    public FilterWithColor(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        actions = new Actions(driver);
    }
    public void selectSubCategory() {
        actions.moveToElement(driver.findElement(By.cssSelector("a[href=\"/apparel\"]"))).moveToElement(driver.findElement(By.cssSelector("a[href=\"/shoes\"]"))).click().build().perform();
    }
    public void FilterBlueColor(){
        driver.findElement(By.id("attribute-option-16")).click();
    }
}
