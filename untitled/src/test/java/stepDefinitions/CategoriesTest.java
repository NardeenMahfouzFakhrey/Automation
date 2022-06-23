package stepDefinitions;

import Company.Categories;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CategoriesTest {

    Categories categoriesPage= mainPage.homepage.CategoriesPage1();
    @Given("home page")
    public void logged_user_in_home_page() {

    }
    @When("determine to Categories and Hover to sub_Categories")
    public void user_detierment_to_categories_and_hover_to_sub_categories() {
        categoriesPage.selectSubCategory();
        categoriesPage.selectCategoryBook();
    }
    @Then("1successfully")
    public void click_on_sub_categories_successfully() {

        System.out.println("successfully");

    }
}
