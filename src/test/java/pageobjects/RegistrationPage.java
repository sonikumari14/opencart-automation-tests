package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage{
	WebDriver driver;
	
	public RegistrationPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "input-firstname")
	WebElement firstnameField;
	
	@FindBy(id = "input-lastname")
	WebElement lastnameField;
	
	@FindBy(id = "input-email")
	WebElement emailAddressField;
	
	@FindBy(id = "input-telephone")
	WebElement telephoneNumberField;
	
	@FindBy(id = "input-password")
	WebElement passwordField;
	
	@FindBy(id = "input-confirm")
	WebElement confirmPasswordField;
	
	@FindBy(name = "agree")
	WebElement privacyPolicyCheckbox;
	
	@FindBy(css = "input[value='Continue']")
	WebElement continueButton;
	
	public WebElement firstnameField()
	{
		return firstnameField;
	}
	public WebElement lastnameField() {
		return lastnameField;
	}
	public WebElement emailAddressField()
	{
		return emailAddressField;
	}
	public WebElement telephoneNumberField()
	{
		return telephoneNumberField;
	}
	public WebElement passwordField()
	{
		return passwordField;
	}
	public WebElement confirmPasswordField()
	{
		return confirmPasswordField;
	}
	public WebElement privacyPolicyCheckbox()
	{
		return privacyPolicyCheckbox;
	}
	public WebElement continueButton()
	{
		return continueButton;
	}
}
