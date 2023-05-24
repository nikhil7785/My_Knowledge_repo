package Java_Task;

import java.util.Scanner;

public class Factorial_of_each_no {

	public static void main(String[] args) {
		//int no=145,copy=no,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no:- ");
		int no=sc.nextInt(),copy=no,sum=0;
		
		while(no!=0)
		{
			int rem=no%10;
			int fact=1;
			for(int i=rem;i>=1;i--)
			{
				fact=fact*i;
			}
			sum=fact+sum;
			no=no/10;
		}
		if(sum==copy)
		{
			System.out.println("Strong no");
		}
		else
		{
			System.out.println("Not a Strong no");
		}

	}

}
