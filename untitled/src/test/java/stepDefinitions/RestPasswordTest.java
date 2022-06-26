package stepDefinitions;

import Pages.ResetPassword;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RestPasswordTest {

    ResetPassword restPasswordPage;

   @Given("go to Rest page")
    public void goToRestPage() {
      mainPage.homepage.loginPage1();
       restPasswordPage = mainPage.homepage.restPasspage();
    }
    @When("rest with valid email")
    public void RestWithValidEmail() {
       String email= registerTest.usernEmail;
       restPasswordPage.setEmailforReset(email);
    }
    @And("press on Recover button")
    public void pressOnRecoverButton() {
       restPasswordPage.ResetButton();
    }
    @Then("rest password successfully")
    public void RestPasswordSuccessfully() throws InterruptedException {
       Assert.assertEquals(restPasswordPage.getReset(),"Email with instructions has been sent to you.","incorrect message");
       System.out.println("Nardeen---------"+restPasswordPage.getReset());
       Thread.sleep(3000);
     }


}
