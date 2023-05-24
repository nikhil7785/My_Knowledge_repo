package Java_Task;

public class BoobleShort {

	public static void main(String[] args) {
		int arr[]= {10,50,60,30,2,8};
		for(int j=0;j<=arr.length;j++)
		{
			for(int i=0;i<arr.length-1;i++)
			{
				if(arr[i]>arr[i+1])
				{
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
				
			}
		}
		for(int k=0;k<arr.length;k++)
		{
			System.out.print(" "+arr[k]);
		}

	}

}
