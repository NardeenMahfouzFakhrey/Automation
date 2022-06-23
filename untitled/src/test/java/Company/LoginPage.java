package Company;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    protected WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void UserLogin(String Email , String pass){
        driver.findElement(By.id("Email")).sendKeys(Email);
        driver.findElement(By.id("Password")).sendKeys(pass);
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
    }
    public String getMyAccount(){
        return driver.findElement(By.xpath("//a[@href=\"/customer/info\"]")).getText();
    }
    public void logOutUser(){
        driver.findElement(By.xpath("//a[@href=\"/logout\"]")).click();
    }
    public void loginBeforeSearch() {
        driver.findElement(By.xpath("//a[@href=\"/login?returnUrl=%2Fpasswordrecovery\"]")).click();
    }
}
