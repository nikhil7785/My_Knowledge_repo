package Automation_Script;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FetchSelectedOption {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "F:\\Eclips_java\\Selenium1\\Drivers\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Nikhil%20Durve/Desktop/Dropdown.html");
		WebElement drop = driver.findElement(By.xpath("//select[@id='random name']"));
		Select sel=new Select(drop);
		if(sel.isMultiple())
		{
			System.out.println("Its Multi selected");
			sel.selectByIndex(1);
			sel.selectByValue("5");
			sel.selectByVisibleText("Nikhil");
			List<WebElement> options = sel.getAllSelectedOptions();
			for(WebElement option:options)
			{
				String text = option.getText();
				System.out.println(text);
			}
			
		}
		else
		{
			System.out.println("Its Singale selected");
			sel.selectByIndex(3);
			sel.getFirstSelectedOption();
		}
		
		
			

	}

}
