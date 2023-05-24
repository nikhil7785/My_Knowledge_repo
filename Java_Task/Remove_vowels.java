package Java_Task;

public class Remove_vowels {
	public static void main(String[] args) {
		String s="Tekdi Technologies";
		String ans="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				ans=ans+ch;
			}
		
		}
		System.out.println(ans);
	}

}
