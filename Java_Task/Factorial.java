package Java_Task;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		//int no=5;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no:- ");
		int no=sc.nextInt();
		int fact=1;
		for (int i=no;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
