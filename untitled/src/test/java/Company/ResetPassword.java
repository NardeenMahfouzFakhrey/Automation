package Company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResetPassword {
    private WebDriver driver;
    public ResetPassword(WebDriver driver) {
        this.driver = driver;
    }
    public void setEmailforReset(String email){
        driver.findElement(By.id("Email")).sendKeys(email);
    }
    public void ResetButton(){
        driver.findElement(By.xpath("//button[@name='send-email']")).click();
    }
    public String getReset(){
        return driver.findElement(By.xpath("//p[@class='content']")).getText();
    }
}
