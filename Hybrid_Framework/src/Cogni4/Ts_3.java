package Cogni4;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Cogni.Base_class;



public class Ts_3 extends Base_class{
	 @Test
	 public void Task3()
	 {
		 driver.findElement(By.xpath("//span[.='Admin']")).click();
		 
	 }
}