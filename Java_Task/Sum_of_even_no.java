package Java_Task;

public class Sum_of_even_no {

	public static void main(String[] args) {
		int []arr= {1,2,3,4,6,5,8};
		int sum=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]%2==0 )
			{
				sum=sum+arr[i];
			}
			
		}
		System.out.println("Sum is:- "+sum);
		double avg=sum/arr.length;
		System.out.println("Avarage is :- "+avg);


	}

}
