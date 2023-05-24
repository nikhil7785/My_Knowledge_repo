package Automation_Script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Registration_Form{
	public static void main(String[] args){
		System.setProperty("webdriver.gecko.driver", "F:\\Eclips_java\\Selenium1\\Drivers\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/webtables");
	driver.findElement(By.id("addNewRecordButton")).click();
	driver.findElement(By.id("firstName")).sendKeys("Nikhil");
	driver.findElement(By.id("lastName")).sendKeys("Durve");
	driver.findElement(By.id("userEmail")).sendKeys("niks13d@gmail.com");
	driver.findElement(By.id("age")).sendKeys("24");
	driver.findElement(By.id("salary")).sendKeys("500000");
	driver.findElement(By.id("department")).sendKeys("CSE");
	driver.findElement(By.id("submit")).click();
	}

}
