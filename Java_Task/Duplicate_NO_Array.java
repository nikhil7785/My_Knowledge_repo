package Java_Task;

public class Duplicate_NO_Array {

	public static void main(String[] args) {
		int []arr= {1,2,3,5,1,2};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Dupliate Numbers are:- "+arr[i]);
				}
			}
		}

	}

}
