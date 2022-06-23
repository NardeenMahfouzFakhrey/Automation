package Company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class Categories {
    private WebDriver driver;
    Actions actions;
    public Categories(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        actions = new Actions(driver);
    }
    public void selectSubCategory() {
        actions.moveToElement(driver.findElement(By.cssSelector("\"a[href=\\\"/electronics\\\"]\"")))
                .moveToElement(driver.findElement(By.cssSelector("\"a[href=\\\"/cell-phones\\\"]\""))).click().build().perform();
    }
    public void selectCategoryBook() {
        actions.moveToElement(driver.findElement(By.cssSelector("\"a[href=\\\"/books\\\"]\""))).click().build().perform();
    }
}
