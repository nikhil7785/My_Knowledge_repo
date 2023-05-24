package Java_Task;

public class No_Table {
	
	public static void table(int no)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(" " +no*i);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		table(2);
		table(3);
	}

}
