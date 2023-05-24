package Automation_Script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_Map {
	public static void main(String[] args){
		System.setProperty("webdriver.gecko.driver", "F:\\Eclips_java\\Selenium1\\Drivers\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.google.com/maps/@12.9967741,77.5553067,16z");
	driver.findElement(By.xpath("//button[@id='hArJGc']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']")).sendKeys("Rajajinagar, Bengaluru, Karnataka");
	driver.findElement(By.xpath("//input[@placeholder='Choose destination, or click on the map...']")).sendKeys("Srirampura, Bengaluru, Karnataka");
	driver.findElement(By.xpath("//input[@placeholder='Choose destination, or click on the map...']/../../following-sibling::button")).click();
	driver.findElement(By.xpath("//span[.='Details']")).click();
	
	}

}
