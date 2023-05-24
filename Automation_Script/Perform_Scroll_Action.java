package Automation_Script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.firefox.FirefoxDriver;

@SuppressWarnings("unused")
public class Perform_Scroll_Action {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "F:\\Eclips_java\\Selenium1\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.Amazon.com");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for(int i=0;i<=5;i++)
		{
		js.executeScript("Window().ScrollBy(0,500)");
		}
		for(int i=0;i<=5;i++)
		{
		js.executeScript("Window().ScrollBy(0,-500)");
		}
		
		

	}

}
