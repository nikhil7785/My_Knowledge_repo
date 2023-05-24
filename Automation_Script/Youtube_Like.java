package Automation_Script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Youtube_Like 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "F:\\Eclips_java\\Selenium1\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.youtube.com");
		driver.findElement(By.name("search_query")).sendKeys(" Chandra Lavani");
		driver.findElement(By.xpath("(//button[@aria-label='Search'])[1]")).click();
		driver.findElement(By.xpath("//a[@href='/watch?v=r6tU3GvJ5so' and @class='yt-simple-endpoint style-scope ytd-video-renderer']")).click();
		driver.findElement(By.xpath("//span[.='Share']/../../../../../ytd-segmented-like-dislike-button-renderer/div[1]")).click();
		
		
	}
}



