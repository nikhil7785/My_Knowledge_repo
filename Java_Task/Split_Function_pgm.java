package Java_Task;

public class Split_Function_pgm {

	public static void main(String[] args) {
		String s="My name is Nikhil Durve";
		String []arr=s.split("");
		for(int i=arr.length-1;i>=0;i--)
		{
			if(i==arr.length/2)
			{
				String a=arr[i],  rev="";
				for(int j=a.length()-1;j>=0;j--)
				{
					rev=rev+a.charAt(j);
				}
				System.out.println(rev);
				
			}
			else
			{
			System.out.print(arr[i]);
			}
			
		}
		
		

	}

}
