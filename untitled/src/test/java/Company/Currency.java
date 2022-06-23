package Company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Currency {
    private WebDriver driver;
    Select select;
    public Currency(WebDriver d) {
        this.driver = d;
    }

    public void switchBetweenCurrency(String optionselect){

        Select select=new Select(driver.findElement(By.id("customerCurrency")));
        select.selectByVisibleText(optionselect);
    }
    public void changeCurrency() {
        select = new Select(driver.findElement(By.id("customerCurrency")));
        select.selectByIndex(1);
    }
}

