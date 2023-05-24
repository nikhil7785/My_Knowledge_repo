package Java_Task;

import java.io.InputStream;
import java.util.Scanner;

public class Revers_String {
	public static void main(String[] args) {
		//String s="Nikhil";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:- ");
		String s=sc.next();
		
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);
	}

}

	