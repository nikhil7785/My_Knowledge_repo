package Cogni3;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Cogni.Base_class;

public class Ts_2 extends Base_class {
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