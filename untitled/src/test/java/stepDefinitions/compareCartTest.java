package stepDefinitions;
import Company.CompareListCart;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class compareCartTest {
    CompareListCart compareListCartPage= mainPage.homepage.CompareListCartPage();
    @Given("different products to compare cart")
    public void logged_user_could_add_different_products_to_compare_cart() {

    }
    @When("Frist products to compare cart")
    public void user_add_frist_products_to_compare_cart() {
       compareListCartPage.addFirstProductToCompareListCart();
    }
    @And("And Second products to compare cart")
    public void user_add_scoend_products_to_compare_cart() {
        compareListCartPage.addSecondProductToCompareListCart();
    }
    @Then("compare cart have two product")
    public void assert_compare_cart_have_two_product() throws InterruptedException {
        Assert.assertEquals(compareListCartPage.getToCompare(),"The product has been added to your product comparison");
        System.out.println("Nardeeen----Two product ----"+compareListCartPage.getToCompare());
        Thread.sleep(3000);
    }
}
