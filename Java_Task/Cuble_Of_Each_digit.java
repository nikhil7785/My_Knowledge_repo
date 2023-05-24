package Java_Task;

import java.util.Scanner;

public class Cuble_Of_Each_digit {

	public static void main(String[] args) {
		//int no=153,copy=no, sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no:- ");
		int no=sc.nextInt(),copy=no,sum=0;
		
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+(rem*rem*rem);
			no=no/10;
		}
		if(sum==copy)
		{
			System.out.println("Armstrong No");
		}
		else
		{
			System.out.println("Not a Armstrong No");
		}

	}

}
