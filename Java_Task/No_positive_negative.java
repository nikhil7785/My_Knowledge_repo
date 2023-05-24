package Java_Task;

import java.util.Scanner;

public class No_positive_negative {
	public static void main(String[] args) {
		//int no=5;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no:- ");
		int no=sc.nextInt();
		
		if(no>=1)
		{
			System.out.println("No is positive");
		}
		else
		{
			System.out.println("no is negative");
		}
		
	}

}
