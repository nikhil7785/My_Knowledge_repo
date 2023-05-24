package Java_Task;

public class Stat_Triangle {
	public static void main(String[] args) {
		int star=7,space=0;
	
		for(int k=1;k<=4;k++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			
			}
			for(int i=1;i<=star;i++)
			{
				System.out.print("*");
				
			}
			
			star=star-2;
			space++;
			System.out.println();
		
		}
		
	}

}
