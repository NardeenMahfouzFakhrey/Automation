package stepDefinitions;

import Pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class registerTest {



    private  String fristname="Nardeen";
    private String lastname="Mahfouz";
    public static String usernEmail="Nardeenmahfouuzzz@gmail.com";
    public static String password="Pass@1234";
    RegisterPage registerPage;


    @Given("go to register page")
    public void go_to_register_page() {
        registerPage=mainPage.homepage.redirectedToregisterPage();

    }
    @When("register with valid firstname and lastname and email and password and confirmPassword")
    public void register_with_valid_fristname_and_lastname_and_email_and_password_and_confirm_password() {
        registerPage.registerNewUser(fristname,lastname,usernEmail,password);
    }
    @And("press on register button")
    public void press_on_register_button() {
        registerPage.clickBtnregister();
    }
    @Then("register to the system successfully")
    public void register_to_the_system_successfully() {
        Assert.assertEquals(registerPage.resulteRegister(), "Your registration completed");
        System.out.println("Nardeen---------"+registerPage.resulteRegister());
    }
    @And("logout to login page")
    public void user_logout_to_login_page() {
        registerPage.logOutUser();
    }
}
