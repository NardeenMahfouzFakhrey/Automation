package stepDefinitions;

import Company.ResetPassword;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RestPasswordStepDefinitions {

    ResetPassword restPasswordPage;

   @Given("user go to Rest page")
    public void user_go_to_rest_page() {
     //  loginPage.logOutUser();
      mainPage.homepage.TologinPage();
       restPasswordPage = mainPage.homepage.restPasspage();
    }
    @When("user rest with valid email")
    public void user_rest_with_valid_email() {
       String email= registerTest.usernEmail;
       restPasswordPage.setEmailforReset(email);
    }
    @And("user press on Recover button")
    public void user_press_on_recover_button() {
       restPasswordPage.ResetButton();
    }
    @Then("user rest password successfully")
    public void user_rest_password_successfully() throws InterruptedException {
       Assert.assertEquals(restPasswordPage.getReset(),"Email with instructions has been sent to you.","incorrect message");
       System.out.println("Nardeen---------"+restPasswordPage.getReset());
       Thread.sleep(3000);
     }


}
