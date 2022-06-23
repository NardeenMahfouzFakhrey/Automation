package stepDefinitions;

import Company.LoginBeforeSearch;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class loginBeforeSearchTest {
    LoginBeforeSearch loginPageBeforeSearch;

    @Given("user go to login page before sreach")
    public void go_to_login_page1()  {
        loginPageBeforeSearch = mainPage.homepage.LoginBeforeSearch();
        loginPageBeforeSearch.loginBeforeSearch();
    }

    @When("user login  before search with valid email and password")
    public void valid_username_password()
    {
        String email= registerTest.usernEmail;
        String password= registerTest.password;
        loginPageBeforeSearch.UserLogin(email,password);

    }
    @Then("successfully3")
    public void success_login1()
    {
        Assert.assertEquals(loginPageBeforeSearch.getMyAccount(),"My account","Login successful");
        System.out.println("Nardeen-----"+loginPageBeforeSearch.getMyAccount());
    }
}
