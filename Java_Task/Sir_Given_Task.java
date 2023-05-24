package Java_Task;

public class Sir_Given_Task {

	public static void main(String[] args) {
		int x=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<=2;j++)
			{
				if(i==j)
				{
					continue;
				}
				else
				{
					x++;
				}
			}
			
		}
		System.out.println(x);
		

	}

}
