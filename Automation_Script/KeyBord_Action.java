package Automation_Script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeyBord_Action {
	public static void main(String[]args) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "F:\\Eclips_java\\Selenium1\\Drivers\\geckodriver.exe");
		WebDriver	driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
		text.sendKeys("Nikhil");
		text.sendKeys(Keys.CONTROL+"a");
		text.sendKeys(Keys.CONTROL+"X");
		text.sendKeys(Keys.TAB);
		text.sendKeys(Keys.CONTROL+"v");

	}

}
