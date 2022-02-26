package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import resources.Base;

public class TwoTest extends Base{
	public WebDriver driver;
	@Test
	public void testTwo() throws IOException
	{
		System.out.println("Test two");
		driver = initializeDriver();
		driver.get("https://demo.opencart.com/");
		
		driver.close();
	}
}
