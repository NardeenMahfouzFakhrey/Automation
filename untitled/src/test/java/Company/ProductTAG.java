package Company;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.mainPage;

public class ProductTAG {
    private WebDriver driver;
    Actions actions;
    public ProductTAG(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
        actions = new Actions(driver);
    }

    public void selectCategory() {
        actions.moveToElement(mainPage.driver.findElement( By.cssSelector("a[href=\"/jewelry\"]"))).click().build().perform();
    }
    public void selectTag(String tagname){
        if(tagname =="cool"){
            driver.findElement(By.cssSelector("a[href=\"/cool\"]")).click();
        }else if(tagname=="shirt"){
            driver.findElement(By.cssSelector("a[href=\"/shirt\"]")).click();
        }
    }

}
