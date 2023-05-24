package Automation_Script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sending_Mail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "F:\\Eclips_java\\Selenium1\\Drivers\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://login.yahoo.com/?.intl=in&intl=in&.lang=en-IN&src=ym&specId=yidregsimplified&activity=header-signup&pspid=1197806870&done=https%3A%2F%2Fin.mail.yahoo.com%2Fd%3F.intl%3Din%26.lang%3Den-IN%26pspid%3D958631386%26activity%3Dheader-mail&prompt=login");
	driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("nikhil_durve77");
	driver.findElement(By.xpath("//input[@id='login-signin']")).click();
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Raje@7785");
	driver.findElement(By.xpath("//button[@id='login-signin']")).click();
	driver.findElement(By.xpath("//a[.='Compose']")).click();
	driver.findElement(By.xpath("//input[@id='message-to-field']")).sendKeys("durve_nikhil85@yahoo.com");
	driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys("Hi i am nikhil Durve from MH");
	driver.findElement(By.xpath("//button[@title='Send this email']")).click();
	driver.findElement(By.xpath("//img[@src='https://s.yimg.com/ag/images/default_user_profile_pic_32sq.jpg']")).click();
	driver.findElement(By.xpath("//span[.='Sign out']")).click();
	driver.findElement(By.xpath("(//div[.='Sign In'])[2]")).click();
	driver.findElement(By.xpath("//a[.='Use another account']")).click();
	driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("durve_nikhil85");
	driver.findElement(By.xpath("//input[@id='login-signin']")).click();
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Raje@7785");
	driver.findElement(By.xpath("//button[@id='login-signin']")).click();
	driver.findElement(By.xpath("//div[@title='Mail']")).click();

	
	
	}

}
