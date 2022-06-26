package stepDefinitions;

import Pages.ProductTAG;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductTAGTest {
    ProductTAG producTag = mainPage.homepage.ProducTag1();
    @Given("Any Category to select Popular tags")
    public void logged_user_in_any_category_to_select_popular_tags() {
        producTag.selectCategory();
    }
    @When("determined to tags and assert successfully1")
    public void user_determined_to_tags_and_assert_successfully() {
        producTag.selectTag("cool");
    }
    @And("tags determined assert successfully")
    public void tags_determined_assert_successfully() {
    }
    @Then("determined to tags and assert successfully")
    public void user_anthor_detierment_to_tags_and_assert_successfully() {
        producTag.selectTag("shirt");
    }
    @And("successfully6")
    public void anthor_tags_determined_assert_successfully() {
    }
}
