package Java_Task;

import java.util.Scanner;

public class Swap_Without {
	public static void main(String[] args) {
		//int a=10;
		//int b=20;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st value:- ");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd value");
		int b=sc.nextInt();
		
		System.out.println("Before swapping "+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping "+a+" "+b);
		System.out.println("________________________________________");
		System.out.println("Before swapping "+a+" "+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After swapping "+a+" "+b);
		System.out.println("________________________________________");
		System.out.println("Before swapping "+a+" "+b);
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("After swapping "+a+" "+b);
		
		
		
		
	}

}
