package Java_Task;

public class Mearge_Two_Array {

	public static void main(String[] args) {
		int []arr= {10,20,30};
		int []brr= {1,2,3};
	    
		int size=arr.length+brr.length;
		int [] res=new int[size];
		int posion=0;
		for(int a:arr)
		{
			res[posion]=a;
			posion++;
		}
		for(int b:brr)
		{
			res[posion]=b;
			posion++;
		}
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}

	}

}
