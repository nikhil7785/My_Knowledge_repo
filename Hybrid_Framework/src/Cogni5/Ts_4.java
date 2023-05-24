package Cogni5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Cogni.Base_class;



public class Ts_4 extends Base_class{
	 @Test
	 public void Task4()
	 {
		 driver.findElement(By.xpath("//span[.='Job ']")).click();
		 
		 WebElement title = driver.findElement(By.xpath("//a[.=' Job Titles']"));
		 
		 SoftAssert s1=new SoftAssert();
		 s1.assertEquals(title,"Job Titles");
		 System.out.println("Test case_4 Pass ");
		 s1.assertAll();
		 
	 }
}