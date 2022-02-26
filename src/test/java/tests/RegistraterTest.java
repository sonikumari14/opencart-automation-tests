package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjects.LandingRegistrationPage;
import pageobjects.RegistrationPage;
import resources.Base;

public class RegistraterTest  extends Base{
	WebDriver driver;
	@BeforeMethod
	public void openApplication() throws IOException
	{
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	@Test
	public void registrater() throws InterruptedException
	{
		
		LandingRegistrationPage landingRegistrationPage = new LandingRegistrationPage(driver);
		landingRegistrationPage.myAccountDropdown().click();
		landingRegistrationPage.registrationOption().click();
		
		RegistrationPage registrationPage = new RegistrationPage(driver);
		registrationPage.firstnameField().sendKeys(prop.getProperty("firstname"));
		registrationPage.lastnameField().sendKeys(prop.getProperty("lastname"));
		registrationPage.emailAddressField().sendKeys(prop.getProperty("email"));
		registrationPage.telephoneNumberField().sendKeys(prop.getProperty("phonenumber"));
		registrationPage.passwordField().sendKeys(prop.getProperty("password"));
		registrationPage.confirmPasswordField().sendKeys(prop.getProperty("conformpass"));
		registrationPage.privacyPolicyCheckbox().click();
		registrationPage.continueButton().click();
		
	}
	@AfterMethod
	public void closure()
	{
		driver.close();
	}
}
