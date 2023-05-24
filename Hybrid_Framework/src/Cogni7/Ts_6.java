package Cogni7;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Cogni.Base_class;

public class Ts_6 extends Base_class {
	@Test
	 public void Task5()
	 {
		 driver.findElement(By.xpath("//button[@type='button']")).click();
		 driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']")).sendKeys("Automation Tester");
		 driver.findElement(By.xpath("//textarea[@placeholder='Type description here']")).sendKeys("I Have Completed Software Testing Course in Qspiders Rajajinagar, Bangalore");
		 driver.findElement(By.xpath("//div[.='Browse']")).sendKeys("C:\\Users\\Nikhil Durve\\Desktop\\Updated_Resume\\NikhilDurve_BTech_CSE_Resume_Up.pdf");
		 driver.findElement(By.xpath("//textarea[@placeholder='Add note']")).sendKeys("i have Knowledge of MT,AT,java,SQL");
		 driver.findElement(By.xpath("//button[.=' Save ']")).click();
	 }
	
	

}
