package POM;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FB_base_class {
	@Test
	public void fbscript() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "F:\\Eclips_java\\Selenium1\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		
		Fb_pomclass pmc = new Fb_pomclass (driver);
		pmc.email("hello");
		driver.navigate().refresh();
		pmc.email("hi");
		pmc.pass("9860644532");
		driver.navigate().refresh();
		pmc.pass("9284140237");
		pmc.button();
		
		
		
		
		
	}
	

}
