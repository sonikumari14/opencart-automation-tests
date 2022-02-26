package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingRegistrationPage{
		WebDriver driver;
		public LandingRegistrationPage(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/a")
		WebElement myAccountDropdown;
		
		@FindBy(linkText = "Register")
		WebElement registrationOption;
		
		public WebElement myAccountDropdown()
		{
			return myAccountDropdown;
		}
		public WebElement registrationOption()
		{
			return registrationOption;
		}
		
}	
