package Java_Task;

public class Fetch_largest_Smaller_no {

	public static void main(String[] args) {
		int []arr= {100,20,6,-89,45};
		
		int fl=0,sl=0,tl=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>fl)
			{
				tl=sl;
				sl=fl;
				fl=arr[i];
			}
			else if(arr[i]>sl)
			{
				tl=sl;
				sl=arr[i];
			}
			else
			{
				tl=arr[i];
			}
		}
		System.out.println("1st largest:- "+fl);
		System.out.println("2nd largest:- "+sl);
		System.out.println("3rd largest:- "+tl);

	}

}
