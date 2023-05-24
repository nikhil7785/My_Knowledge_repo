package Releval2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class Pom_class {
	@FindBy(id="//input[@id='outstanding_principal']")
	private WebElement loan;
	
	@FindBy(id="//input[@id='months']")
	private WebElement ten;
	
    @FindBy(id="//input[@id='interest-or-emi']")
    private WebElement rate;
    
    @FindBy(xpath="//label[text()='Monthly']")
    private WebElement pay;
    
    @FindBy(id="//input[@id='outstanding_principal1']")
    private WebElement amt;
    
    @FindBy(id="//input[@id='months2']")
    private WebElement start;
    
    @FindBy(id="//select[@id='freq']")
    private WebElement method;
    
    @FindBy(id="button")
    private WebElement btm;
    
    public Pom_class(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }
    
    public void Lamt(int a)
    {
    	loan.sendKeys("a");
    }
    public void tenure(int b)
    {
    	ten.sendKeys("b");
    }
    public void Intrest(float c)
    {
    	rate.sendKeys("c");
    }
    public void payment()
    {
    	pay.click();
    }
    public void Amount(int e)
    {
    	amt.sendKeys("e");
    }
    public void Date(int f)
    {
    	start.sendKeys("f");
    }
    public void last()
    {
    	Select s=new Select(method);
    	s.selectByValue("1");
    	Reporter.log("Selected 1st Option", true);
    	
    }
    public void button()
    {
    	btm.click();
    	Reporter.log("Perform Click action", true);
    }
}
