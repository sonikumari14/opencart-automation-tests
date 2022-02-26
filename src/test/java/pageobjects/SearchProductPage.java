package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProductPage {
	WebDriver driver;
	
	public SearchProductPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "input[name='search']")
	WebElement searchProduct;
	
	@FindBy(css = "span[class='input-group-btn']")
	WebElement clickInputBtn;
	
	@FindBy(linkText = "iPhone")
	WebElement iphone;
	
	public WebElement searchProduct()
	{
		return searchProduct;
	}
	public WebElement clickInputBtn()
	{
		return clickInputBtn;
	}
	public WebElement iphone()
	{
		return iphone;
	}
	
}
