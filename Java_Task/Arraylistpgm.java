package Java_Task;


import java.util.ArrayList;

public class Arraylistpgm {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(50);
		a.add(60);
		a.add(70);
		a.add(80);
		System.out.println("a:-  "+a);
		System.out.println("______________________________________");
		ArrayList b=new ArrayList();
		b.add(80);
		b.add(60);
		b.add(30);
		b.add(40);
		System.out.println("b:-   "+b);
		System.out.println("______________________________________");
		System.out.println(a.get(1));
		System.out.println("______________________________________");
		a.addAll(b);
		System.out.println(a);
		System.out.println("____________________________________________");
		a.addAll(1, b);
		System.out.println(a);
		System.out.println("_____________________________________________");
		System.out.println(a+"  Before removing value");
		System.out.println("______________________________________");
		a.remove(2);
		System.out.println(a+"  After removing value");
		System.out.println("______________________________________________");
		a.removeAll(b);
		System.out.println(a);
		System.out.println("______________________________________");
		a.retainAll(b);
		System.out.println(a);
		System.out.println("___________________________________________");
		System.out.println(a.contains(20));
		System.out.println("_________________________________________________");
		
	
		
		
	}

}
