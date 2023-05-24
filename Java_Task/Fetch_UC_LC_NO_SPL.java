package Java_Task;

public class Fetch_UC_LC_NO_SPL {

	public static void main(String[] args) {
		String s="NikHIL77@!&7750";
		String uc=" ";
		String lc=" ";
		String no=" ";
		String spl=" ";
		char ch=' ';	
		for (int i=0;i<s.length();i++)
		{
		 ch=s.charAt(i);
		if(Character.isUpperCase(ch))
		{
			uc=uc+ch;
		}
		else if(Character.isLowerCase(ch))
		{
			lc=lc+ch;
		}
		else if(Character.isDigit(ch))
		{
			no=no+ch;
		}
		else
		{
			spl=spl+ch;
		}
		}
		System.out.println(uc);
		System.out.println(lc);
		System.out.println(no);
		System.out.println(spl);
		
	
	}

}
