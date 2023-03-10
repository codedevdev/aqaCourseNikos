package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


import static org.hamcrest.CoreMatchers.is;

public class LoginPage extends BasePage{


    public LoginPage(WebDriver driver) {
        super(driver);
    }


    protected By findApplePC = By.linkText("Apple Cinema 30\"");
    protected By radioButton1 = By.id("input-option-value-6");
    protected By checkBox = By.id("input-option-value-9");
    protected By inputTextField = By.id("input-option-208");
    protected By selectDropDown = By.xpath("//label[text()='Select']/following-sibling::select");
    protected By inputFieldDesc = By.id("input-option-209");
    protected By datePicker = By.id("input-option-219");
    protected By addToCart = By.id("button-cart");
    protected By cartButton = By.xpath("//button[contains(@class,'btn btn-inverse')]");
    protected By checkOutBut = By.xpath("//strong[text()='Checkout']");
    protected By firstNameField = By.id("input-firstname");
    protected By lastNameField = By.id("input-lastname");
    protected By emailField = By.id("input-email");
    protected By companyName = By.id("input-shipping-company");
    protected By addressField = By.id("input-shipping-address-1");
    protected By cityField = By.id("input-shipping-city");
    protected By postCode = By.id("input-shipping-postcode");
    protected By countrySelect = By.id("input-shipping-country");
    protected By regionSelector = By.id("input-shipping-zone");
    protected By passwordField = By.id("input-password");
    protected By registerAgree = By.id("input-register-agree");
    protected By continueButton = By.id("button-register");
    protected By shipingMethod = By.id("input-shipping-method");
    protected By paymentMethod = By.id("input-payment-method");
    protected By confirmButton = By.id("button-confirm");
    protected By continueButton2 = By.linkText("Continue");


    public LoginPage buyProduct(){
        driver.findElement(findApplePC).click();
      //  assertThat(driver.findElement(By.tagName("h1")).getText(), is("Apple Cinema 30\""));
        System.out.println(driver.getTitle());
        driver.findElement(radioButton1).click();
        driver.findElement(checkBox).click();
        driver.findElement(inputTextField).sendKeys("Lorem Ipsum Bla bla");
        Select selectType = new Select(driver.findElement(selectDropDown));
        selectType.selectByVisibleText("Blue (+$5.60)");
        driver.findElement(inputFieldDesc).sendKeys("LORA LORA LORA WITH IT MY FRIENDS");
        driver.findElement(addToCart).click();
        return this;
    }


}
