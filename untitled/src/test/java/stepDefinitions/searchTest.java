package stepDefinitions;

import Pages.SearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class searchTest {
    SearchPage searchPage=mainPage.homepage.SearchPage1();
    @When("user clicks on search field")
    public void user_clicks_on_search_field()
    {
        searchPage.Search();
    }

    @And("user search with name of product")
    public void user_search_with_name_of_product()
    {

        searchPage.SearchBtn("book");

    }

    @Then("user could find relative results")
    public void user_could_find_relative_results()
    {
        int count = mainPage.driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).size();  // 0
        System.out.println(count);
        Assert.assertTrue(count > 0);
        for (int x = 0; x < count ; x++) {
            System.out.println("Nardeen-----------"+mainPage.driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).get(x).getText());
            Assert.assertTrue(mainPage.driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).get(x).getText().toLowerCase().contains("book"));
        }
    }

}
