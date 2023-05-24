package Java_Task;

import java.util.Scanner;

public class Odd_Even {
	public static void main(String[] args) {
		//int no=10;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no:- ");
		int no=sc.nextInt();
				
		if(no%2==0)
		{
			System.out.println("No is even");
		}
		else
		{
			System.out.println("No is odd");
		}
	}

}
