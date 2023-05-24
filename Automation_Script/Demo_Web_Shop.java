package Automation_Script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo_Web_Shop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "F:\\Eclips_java\\Selenium1\\Drivers\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://demowebshop.tricentis.com/books");
	driver.findElement(By.xpath("//a[.='Computing and Internet']/../following-sibling::div[3]/div[2]/input")).click();
	driver.findElement(By.xpath("//a[.='Fiction']/../following-sibling::div[3]/div[2]/input")).click();
	driver.findElement(By.xpath("//a[.='Health Book']/../following-sibling::div[3]/div[2]/input")).click();
	driver.findElement(By.xpath("//span[.='Shopping cart']")).click();
	
	
	}

}
