package stepDefinitions;

import Company.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class registerTest {

    private  String fristname="Nardeen";
    private String lastname="Mahfouz";
    public static String usernEmail="Nardeenmahfouz44@gmail.com";
    public static String password="Pass@1234";
    RegisterPage registerPage;
    @Given("user go to register page")
    public void user_go_to_register_page() {
        registerPage= mainPage.homepage.ToRegisterPage();

    }
    @When("user lregister with valid fristname and lastname and email and password and confirmPassword")
    public void user_lregister_with_valid_fristname_and_lastname_and_email_and_password_and_confirm_password() {
        registerPage.register(fristname,lastname,usernEmail,password);

    }
    @And("user press on register button")
    public void user_press_on_register_button() {
        registerPage.ButtonRegister();
    }
    @Then("user register to the system successfully")
    public void user_register_to_the_system_successfully() {
        Assert.assertEquals(registerPage.getRegister(), "Your registration completed");
        System.out.println("Nardeen--------------"+registerPage.getRegister());
    }
    @And("user logout to login page")
    public void user_logout_to_login_page() {
        registerPage.logOutUser();
    }

}
