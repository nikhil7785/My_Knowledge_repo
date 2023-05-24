package Automation_Script;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Check_image_count {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","F:\\Eclips_java\\Selenium1\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		List<WebElement> images = driver.findElements(By.xpath("//img"));
		System.out.println(images.size());
		
		for(WebElement imgg:images)
		{
			System.out.println(imgg.getAttribute("img"));
		}
	}

}
