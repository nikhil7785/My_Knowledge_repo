package Cogni6;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Cogni.Base_class;


public class Ts_5 extends Base_class{
	 @Test
	 public void Task5()
	 {
		 driver.findElement(By.xpath("//a[.=' Job Titles']")).click();
	 }
}
