package Cogni2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Cogni.Base_class;
import Cogni1.Pom_class;

 class Ts_1 extends Base_class {
	@Test
	public  void Task1()
	{
		Pom_class p=new Pom_class();
		p.uname("Admin");
		p.password("admin123");
		p.button();
				
	}

}
 class Ts_2 extends Ts_1 {
	@Test
	public void Task2()
	{
		String url = driver.getCurrentUrl();
		
		SoftAssert s=new SoftAssert();
		s.assertEquals(url,"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		System.out.println("Test case_2 Pass ");
		s.assertAll();
	}

}
 
 class Ts_3 extends Ts_2{
	 @Test
	 public void Task3()
	 {
		 driver.findElement(By.xpath("//span[.='Admin']")).click();
		 
	 }
 }

 class Ts_4 extends Ts_3{
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
 
 class Ts_5 extends Ts_4{
	 @Test
	 public void Task5()
	 {
		 driver.findElement(By.xpath("//a[.=' Job Titles']")).click();
	 }
 }
 
 
 
 

