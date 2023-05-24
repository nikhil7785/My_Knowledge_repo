package Automation_Script;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Check_Link_count_Print {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","F:\\Eclips_java\\Selenium1\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.Amazon.com");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int count = links.size();
		System.out.println("Links Count is:- "+count);
		
		for(WebElement link:links)
		{
			System.out.println(link.getAttribute("href"));
		}
		
	}

}
