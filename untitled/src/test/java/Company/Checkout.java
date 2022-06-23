package Company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Checkout {

    private WebDriver driver;
    Actions actions;
    private By Cartheader=By.id("topcartlink");
    private By Gotocart=By.xpath("//*[@id=\"flyout-cart\"]/div/div[4]/button");
    private By agreeterm=By.id("termsofservice");
    private By checkout =By.id("checkout");
    Select sel;
    @FindBy(css = "input.button-1.checkout-as-guest-button")
    private WebElement guestButton;
    @FindBy(id = "BillingNewAddress_FirstName")
    private WebElement fontText;
    @FindBy(id = "BillingNewAddress_LastName")
    private WebElement lineText;
    @FindBy(id = "BillingNewAddress_Email")
    private WebElement emailText;
    @FindBy(id = "BillingNewAddress_CountryId")
    private WebElement countryList;
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    private WebElement phoneText;
    @FindBy(id = "BillingNewAddress_City")
    private WebElement cityText;
    @FindBy(id = "BillingNewAddress_Address1")
    private WebElement addressText;
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    private WebElement postCodeText;
    @FindBy(xpath = "//*[@id=\"billing-buttons-container\"]/button[4]")
    private WebElement continueButton;
    @FindBy(id = "shippingoption_1")
    private WebElement shippingMethod;
    @FindBy(xpath = "//*[@id=\"shipping-method-buttons-container\"]/button")
    private WebElement continueShippingButton;
    @FindBy(xpath = "//*[@id=\"payment-method-buttons-container\"]/button")
    private WebElement continuePaymentButton;
    @FindBy(xpath = "//*[@id=\"payment-info-buttons-container\"]/button")
    private WebElement continueInfoButton;
    @FindBy(css = "a.product-name")
    public WebElement productName;
    @FindBy(xpath = "//*[@id=\"confirm-order-buttons-container\"]/button")
    private WebElement confirmButton;
    @FindBy(css = "h1")
    public WebElement ThankYoulabel;
    @FindBy(css = "div.title")
    private WebElement orderCompleteMesssege;
    @FindBy(linkText = "Click here for order details.")
    private WebElement orderDetailsLink;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[1]/h1")
    private WebElement orderInformation;

    public Checkout(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        actions = new Actions(driver);
    }
    public void GoToCart(){
        driver.findElement(By.id("topcartlink")).click();
        driver.findElement(agreeterm).click();
        driver.findElement(checkout).click();
    }

    public void CheckoutProduct(String firstName, String lastName, String countryName, String email, String address,
                                String postcode, String phone, String city) throws InterruptedException {

        sel = new Select(countryList);
        sel.selectByVisibleText(countryName);
        setText(cityText, city);
        setText(addressText, address);
        setText(postCodeText, postcode);
        setText(phoneText, phone);
        clickBtn(continueButton);
        clickBtn(shippingMethod);
        clickBtn(continueShippingButton);
        Thread.sleep(2000);
        clickBtn(continuePaymentButton);
        Thread.sleep(2000);
        clickBtn(continueInfoButton);
    }
    public void confirmOrder() throws InterruptedException {
        Thread.sleep(1000);
        clickBtn(confirmButton);
        Thread.sleep(1000);
    }
    public void viewOrderDetails() {
        clickBtn(orderDetailsLink);
    }
    protected static void setText(WebElement textElement, String textValue) {
        textElement.sendKeys(textValue);
    }
    protected static void clickBtn(WebElement btn) {
        btn.click();
    }
    public String getOrderInfo(){
        return orderInformation.getText();
    }

}
