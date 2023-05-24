package Java_Task;

import java.util.Scanner;

public class Check_no_palindrom {

	public static void main(String[] args) {
		//int no=121 , copy=no, rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no :- ");
		int no=sc.nextInt(),copy=no, rev=0;
		while(no!=0)
		{
			int rem=+no%10;
			rev=(rev*10)+rem;
			no=no/10;
		}
		if(rev==copy)
		{
			System.out.println("No is Palindrom");
		}
		else
		{
			System.out.println("No is not Palindrom");
		}
	

	}

}
