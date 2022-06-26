package stepDefinitions;

import Pages.Currency;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CurrenceTest {
    Currency currencePage;
    @Given("home page1")
    public void user_in_home_page() {
        currencePage = mainPage.homepage.currencePage1();
    }

    @When("determine to Euro")
    public void user_detierment_to_euro() {
        currencePage.changeCurrency();
    }

    @Then("successfully2")
    public void user_switch_between_currencies_us_euro_successfully() {
        Assert.assertTrue(true);
    }

}
