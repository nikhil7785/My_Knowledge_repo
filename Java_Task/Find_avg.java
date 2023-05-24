package Java_Task;

public class Find_avg {
	public static void main(String[] args) {
		int [] arr= {1,10,2,20,3,30};
		int sum=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			sum=sum+arr[i];
			
		}
		System.out.println("sum is:- "+sum);
		
		float avg=sum/arr.length;
		System.out.println("Avarage is:- "+avg);
	}

}
