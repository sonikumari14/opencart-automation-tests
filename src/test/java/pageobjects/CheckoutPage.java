package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage {
	WebDriver driver;
	public CheckoutPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "input-payment-firstname")
	WebElement paymentFirstname;
	
	@FindBy(id = "input-payment-lastname")
	WebElement paymentLastname;
	
	@FindBy(id = "input-payment-address-1")
	WebElement paymentAddress1;
	
	@FindBy(id = "input-payment-city")
	WebElement paymentCity;
	
	@FindBy(id = "input-payment-country")
	WebElement country;
	
	@FindBy(id = "input-payment-zone")
	WebElement region;
	
	@FindBy(id = "button-shipping-address")
	WebElement buttonShippingAddress;
	
	@FindBy(id = "button-shipping-method")
	WebElement buttonShippingMethod;
	
	@FindBy(name = "agree")
	WebElement buttonAgree;
	
	@FindBy(id = "button-payment-method")
	WebElement buttonPaymentMethod;

	@FindBy(id = "button-confirm")
	WebElement buttonConfirm;
	
	@FindBy(xpath = "//ul[@class='breadcrum']//a[text()='Success']")
	WebElement successMsg;
	
	@FindBy(xpath = "//*[@id='content']/h1[text()='Your order has been placed!']")
	WebElement orderPlacedMsg;
	
	public WebElement paymentFirstname()
	{
		return paymentFirstname;
	}
	
	public WebElement paymentLastname()
	{
		return paymentLastname;
	}
	public WebElement paymentAddress1()
	{
		return paymentAddress1;
	}
	
	public WebElement paymentCity()
	{
		return paymentCity;
	}
	
	public void selectCounty()
	{
		Select select = new Select(country);
		select.selectByVisibleText("United States");
	}
	public void selectRegion()
	{
		Select select = new Select(region);
		select.selectByVisibleText("New York");
	}
	public WebElement buttonShippingAddress()
	{
		return buttonShippingAddress;
	}
	public WebElement buttonShippingMethod()
	{
		return buttonShippingMethod;
	}
	public WebElement buttonAgree()
	{
		return buttonAgree;
	}
	public WebElement buttonPaymentMethod()
	{
		return buttonPaymentMethod;
	}
	public WebElement buttonConfirm()
	{
		return buttonConfirm;
	}
	public void successMsg()
	{
		System.out.println(successMsg.isDisplayed());
	}
	public void orderPlacedMsg()
	{
		System.out.println(orderPlacedMsg.isDisplayed());
	}
		
}
