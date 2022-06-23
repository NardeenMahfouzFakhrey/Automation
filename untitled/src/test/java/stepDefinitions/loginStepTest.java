package stepDefinitions;

import Company.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class loginStepTest {
    LoginPage loginPage;
    @Given("user go to login page")
    public void go_to_login_page()  {
        loginPage = mainPage.homepage.TologinPage();
       }

    @When("user login with valid email and password")
    public void valid_username_password()
    {
        String email= registerTest.usernEmail;
        String password= registerTest.password;
        loginPage.UserLogin(email,password);

    }
    @Then("successfully4")
    public void success_login()
    {
        Assert.assertEquals(loginPage.getMyAccount(),"My account","Login successful");
        System.out.println("Nardeen---------"+loginPage.getMyAccount());
        loginPage.logOutUser();
    }

}
