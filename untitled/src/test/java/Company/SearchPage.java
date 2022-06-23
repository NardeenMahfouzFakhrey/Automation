package Company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    WebDriver driver;
    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }
    public void Search(){
        driver.findElement(By.xpath("small-searchterms")).click();
    }
    public void SearchButton(String search){
        driver.findElement(By.id("small-searchterms")).sendKeys(search);
        driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]")).click();
    }
}
