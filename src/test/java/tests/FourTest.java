package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import resources.Base;

public class FourTest extends Base{
	public WebDriver driver;
	@Test
	public void testFour() throws IOException
	{
		System.out.println("Test Four");
		driver = initializeDriver();
		driver.get("https://demo.opencart.com/");
		Assert.assertTrue(false);
		
		driver.close();
	}
}
