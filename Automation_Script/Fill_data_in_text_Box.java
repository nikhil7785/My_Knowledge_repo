package Automation_Script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fill_data_in_text_Box {
	public static void main(String[] args){
		System.setProperty("webdriver.gecko.driver", "F:\\Eclips_java\\Selenium1\\Drivers\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/text-box");
	driver.findElement(By.id("userName")).sendKeys("NIKHIL");
	driver.findElement(By.id("userEmail")).sendKeys("niks13d@gmail.com");
	driver.findElement(By.id("currentAddress")).sendKeys("AP/Umadi Tal:-Jath,Dist:-Sangli");
	driver.findElement(By.id("permanentAddress")).sendKeys("AP/Umadi Tal:-Jath,Dist:-Sangli");
	driver.findElement(By.id("submit")).click();
	
	}

}
