package stepDefinitions;

import Pages.Categories;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CategoriesTest {

    Categories categoriesPage= mainPage.homepage.CategoriesPage1();
    @Given("Logged user in home page")
    public void logged_user_in_home_page() {

    }
    @When("user go Categories and to sub_Categories")
    public void user_go_Categories_and_to_sub_Categories() {
        categoriesPage.selectSubCategory();
        categoriesPage.selectCategoryBook();


    }
    @Then("Click on sub categories successfully")
    public void click_on_sub_categories_successfully() {

        System.out.println("successfylly cat");

    }

}

