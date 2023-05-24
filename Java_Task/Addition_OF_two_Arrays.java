package Java_Task;

public class Addition_OF_two_Arrays {

	public static void main(String[] args) {
		int[]arr1= {1,2,3,4,5,0};
		int[]arr2= {6,5,9,3,2,7};
		int[] sum=new int[arr1.length];
		for(int i=0;i<arr1.length;i++)
		{
			sum[i]=arr1[i]+arr2[i];
		}
		for(int i=0;i<sum.length;i++)
		{
			System.out.print(sum[i]+" ");
		}
	}

}
