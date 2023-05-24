package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_pomclass {
	@FindBy(id="email")
    private WebElement	email_text;
	
	@FindBy(id="pass")
	private WebElement pwd_text;
	
	@FindBy(name="login")
	private WebElement  lgn_btn;
	
	public Fb_pomclass (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void email(String data)
	{
		email_text.sendKeys(data);
	}
	public void pass(String data)
	{
		pwd_text.sendKeys(data);
	}
	public void button()
	{
		lgn_btn.click();
	}
	

}
