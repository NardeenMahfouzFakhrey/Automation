package stepDefinitions;

import Pages.WishListCartPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class wishListTest {
    WishListCartPage wishListCartPage=mainPage.homepage.WishListCartPage1();
    @Given("Logged user could add different products to Wishlist cart")
    public void logged_user_could_add_different_products_to_wishlist_cart() {

    }
    @When("user add First products to Wishlist cart")
    public void userAddFristProductsToWishlistCart() {

        wishListCartPage.addFristproducte();
    }
    @When("user add Second products to Wishlist cart")
    public void userAddSecondProductToWishlist_cart() {

        wishListCartPage.addSecondproducte();
    }
    @Then("Wishlist cart have two product")
    public void wishlist_cart_have_two_product() {
        Assert.assertEquals(wishListCartPage.getresultsuccessaddtowishlist(),"The product has been added to your wishlist");
        System.out.println("sara---------------Two product ----"+wishListCartPage.getresultsuccessaddtowishlist());
    }

}
