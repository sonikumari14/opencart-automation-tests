package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjects.CheckoutPage;
import pageobjects.LandingPage;
import pageobjects.LoginPage;
import pageobjects.SearchProductPage;
import pageobjects.ShoppingCartPage;
import resources.Base;

public class SearchProductTest extends Base{
	WebDriver driver;
	
	@BeforeMethod
	public void openApplication() throws IOException
	{
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}
		
	@Test
	public void searchProduct()
	{
		LandingPage landingPage = new LandingPage(driver);
		landingPage.myAccountDropdown().click();
		landingPage.loginOption().click();
		
		System.out.println(prop.getProperty("email"));
		LoginPage loginPage = new LoginPage(driver);
		loginPage.emailAddressField().sendKeys(prop.getProperty("email"));
		loginPage.passwordField().sendKeys(prop.getProperty("password"));
		loginPage.loginButton().click();
		
		SearchProductPage searchProductPage = new SearchProductPage(driver);
		searchProductPage.searchProduct().sendKeys("iphone");
		searchProductPage.clickInputBtn().click();
		searchProductPage.iphone().click();	
		
		ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
		shoppingCartPage.checkoutBtn().click();
		
		CheckoutPage checkoutPage = new CheckoutPage(driver);
		checkoutPage.paymentFirstname().sendKeys("soni");
		checkoutPage.paymentLastname().sendKeys("kushwaha");
		checkoutPage.paymentAddress1().sendKeys("Bihar, siwan");
		checkoutPage.paymentCity().sendKeys("New York");
		checkoutPage.selectCounty();
		checkoutPage.selectRegion();
		checkoutPage.buttonShippingAddress().click();
		checkoutPage.buttonShippingMethod().click();
		checkoutPage.buttonAgree().click();
		checkoutPage.buttonPaymentMethod().click();
		checkoutPage.buttonConfirm().click();
		checkoutPage.successMsg();
		checkoutPage.orderPlacedMsg();
		
	}
	@AfterMethod
	public void closure()
	{
		driver.close();
	}
}
