package Java_Task;

import java.util.HashSet;

public class Hashsettt {
	public static void main(String[] args) {
		HashSet h=new HashSet();
		h.add(10);
		h.add(20);
		h.add(null);
		h.add(20);
		System.out.println(h);
		for(Object x:h)
		{
			System.out.println(x);
		}
		
		
	}

}
