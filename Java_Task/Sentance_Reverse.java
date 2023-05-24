package Java_Task;

import java.util.Scanner;

public class Sentance_Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentanse");
		String s=sc.nextLine();
		
		//String s="Hi i am nikhil";
		String[] rev=s.split(" ");
		for(int i=rev.length-1;i>=0;i--)
		{
			System.out.print(rev[i]+" ");
		}
		
		

	}

}
