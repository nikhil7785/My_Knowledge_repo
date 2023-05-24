package Java_Task;

import java.util.Scanner;

public class check_String_palindrom 
{

	public static void main(String[] args)
	{
		//String s="madam",rev="";
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string :- ");
		String s=sc.nextLine() , rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev))
		{
		System.out.println("String is palindrom");
		}
		else
		{
		System.out.println("String is not palindrom");
		}
	
	}

}
