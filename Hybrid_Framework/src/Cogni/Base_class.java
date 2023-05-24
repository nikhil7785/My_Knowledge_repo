package Cogni;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_class {
	public static WebDriver driver;
	@BeforeMethod
	public static void openapp()
	{
		System.setProperty("webdriver.gecko.driver","F:\\Eclips_java\\Selenium_TNG\\Drivers1\\geckodriver.exe");
		driver=new FirefoxDriver();
		Reporter.log("Open the Browsor",true);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Reporter.log("Launch the URL",true);
	}
	@AfterMethod
	public static void closeapp()
	{
		driver.close();
		Reporter.log("Application close successfully",true);
	}

}
