package Compair_Price_on_two_Ecommerce_Site;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Product_rate_compair {
	@Test
	public void Task()
	{
		System.setProperty("webdriver.gecko.driver", "F:\\Eclips_java\\Selenium_TNG\\Drivers1\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Reporter.log("Interact with Browser",true);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Reporter.log("Open the Flipkart appplication",true);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone 14");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String filp_amt = driver.findElement(By.xpath("//div[.='APPLE iPhone 14 (Blue, 128 GB)']/../../div[2]/div[1]/div[1]/div[1]")).getText();
		System.out.println("Filpkart :- "+filp_amt);
		int f=Integer.parseInt(filp_amt.substring(1,7).replace(",",""));
		System.out.println("In Flipkart product price is:- "+f);
		
		driver.get("https://www.amazon.in/");
		Reporter.log("Open the Amazon application ",true);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 14");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		String amz_amt = driver.findElement(By.xpath("//span[.='Apple iPhone 14 Plus (128 GB) - Blue']/../../../../div[3]/div[1]/div[1]/div[1]/div[1]")).getText();
		System.out.println("Amazon :- "+amz_amt);
		int a=Integer.parseInt(amz_amt.substring(1,7).replace(",",""));
		System.out.println("In Amazon product price is:- "+a);
		
		if(f<a)
		{
			System.out.println("In Flipkart is Less cost");
		}
		else
		{
			System.out.println("In Amazon is Less cost");
		}
	}

}
