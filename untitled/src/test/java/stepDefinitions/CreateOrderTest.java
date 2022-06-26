package stepDefinitions;

import Pages.Checkout;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CreateOrderTest {
    Checkout checkOutPage= mainPage.homepage.CheckOutPage1();
    @Given("User Go to Shopping cart")
    public void user_got_to_shopping_cart() {
        checkOutPage.GoToCart();
    }
    @When("user Complete Data to create order")
    public void user_complete_data_to_create_order() throws InterruptedException {
        checkOutPage.CheckoutProduct("Joe", "Jack", "Egypt", "7ooda@email.com", "le2bal", "12345", "5487459655", "Edmonton");

    }
    @Then("assert user created order successful")
    public void assert_user_created_order_successful() throws InterruptedException {
        checkOutPage.confirmOrder();
        Assert.assertTrue(checkOutPage.ThankYoulabel.isDisplayed());
        checkOutPage.viewOrderDetails();
        System.out.println(checkOutPage.getOrderInfo());
        Assert.assertEquals(checkOutPage.getOrderInfo(),"Order information","order not compete");
        Assert.assertTrue(mainPage.driver.getCurrentUrl().contains("orderdetails"));

    }

}
