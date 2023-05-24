package Automation_Script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Without_Used_get_method_perform_Action {
	public static void main(String[] args){
		System.setProperty("webdriver.gecko.driver", "F:\\Eclips_java\\Selenium1\\Drivers\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.navigate().to("https://www.amazon.com");
	driver.navigate().to("https://www.youtube.com");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	
	

	}


}
