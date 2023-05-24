package Java_Task;

public class Mearge_String_Arrays {

	public static void main(String[] args) {
		String[]arr= {"Aishu","Kavya","Rani","Kajal"};
		String[]brr= {"Nikhil","Suraj","Kumar","Akash"};
		int size=arr.length+brr.length;
		String[] res=new String[size];
		int posion=0;
		for(String a:arr)
		{
			res[posion]=a;
			posion++;
		}
		for(String b:brr)
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
