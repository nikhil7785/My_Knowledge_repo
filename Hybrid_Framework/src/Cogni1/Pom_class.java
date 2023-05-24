package Cogni1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_class {
	@FindBy(name="username")
	 private WebElement us;
	
	@FindBy(name="password")
	private WebElement pass;
	
	@FindBy(//button[.=' Login'])
	private	WebElement	btn;
	
	
	public void Pom_class(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void uname(String data)
	{
		us.sendKeys(data);
	}
	public void password(String id)
	{
		pass.sendKeys(id);
	}
	public void button()
	{
		btn.click();
	}
	

}
