package Automation_Script;

import org.testng.annotations.Test;

public class Gives_priority_to_Module {
	@Test(priority = 1,invocationCount=5)
	public void Signup()
	{
		System.out.println("Please signup...");
	}
	@Test(priority = 2,invocationCount=4)
	public void Login()
	{
		System.out.println("please login....");
	}
	@Test(priority = 4,invocationCount=3)
	public void Wishlist()
	{
		System.out.println("Add to wishlist....");
	}
	@Test(priority = 3,invocationCount=5)
	public void Cart()
	{
		System.out.println("Add to cart....");
	}
	@Test(priority = 5,enabled=false)
	public void Logout()
	{
		System.out.println("Please logout....");
	}

}
