package Company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class RegisterPage {
    private WebDriver driver;

    public RegisterPage(WebDriver d){
        this.driver=d;
    }
    public void register(String fristName,String lastName ,String email ,String password){
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(By.id("FirstName")).sendKeys(fristName);
        driver.findElement(By.id("LastName")).sendKeys(lastName);
        driver.findElement(By.id("Email")).sendKeys(email);
        driver.findElement(By.id("Password")).sendKeys(password);
        driver.findElement(By.id("ConfirmPassword")).sendKeys(password);
    }
    public void ButtonRegister(){
        driver.findElement(By.id("register-button")).click();
    }
    public String getRegister(){
        return driver.findElement(By.className("result")).getText();
    }
    public void logOutUser(){
        driver.findElement(By.linkText("Log out")).click();
    }

}
