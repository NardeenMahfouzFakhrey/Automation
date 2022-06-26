package stepDefinitions;

import Pages.ShoppingCart;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ShppoingCartStepTest {
    ShoppingCart shoppingCartPage= mainPage.homepage.ShoppingCartPage1();
    @Given("different products to Shopping cart")
    public void logged_user_could_add_different_products_to_shopping_cart() {
    }

    @When("First products to Shopping cart")
    public void user_add_frist_products_to_shopping_cart() {
        shoppingCartPage.addFirstProductToShoppingCart();
    }
    @Then("shopping cart have First product")
    public void assert_shopping_cart_have_two_product2() {
        Assert.assertEquals(shoppingCartPage.addToTheCart(),"The product has been added to your shopping cart");
        System.out.println("Nardeen-------Frist product ----"+shoppingCartPage.addToTheCart());

    }
}
