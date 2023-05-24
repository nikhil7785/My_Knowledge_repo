package Java_Task;

import java.util.PriorityQueue;
//import java.util.Vector;

public class PriorityQueeeee {
	public static void main(String[] args) {
		PriorityQueue v=new PriorityQueue();
		v.add(50);
		v.add(60);
		v.add(70);
		v.add(80);
		System.out.println("a:-  "+v);
		System.out.println("______________________________________");
		PriorityQueue b=new PriorityQueue();
		b.add(80);
		b.add(60);
		b.add(30);
		b.add(40);
		System.out.println("b:-   "+b);
		System.out.println("______________________________________");
		System.out.println("______________________________________");
		v.addAll(b);
		System.out.println(v);
		System.out.println("____________________________________________");
		System.out.println(v);
		System.out.println("_____________________________________________");
		System.out.println(v+"  Before removing value");
		System.out.println("______________________________________");
		v.remove(2);
		System.out.println(v+"  After removing value");
		System.out.println("______________________________________________");
		v.removeAll(b);
		System.out.println(v);
		System.out.println("______________________________________");
		v.retainAll(b);
		System.out.println(v);
		System.out.println("___________________________________________");
		System.out.println(v.contains(20));
		System.out.println("_________________________________________________");
		System.out.println(v.size());
		System.out.println("_________________________________________________");
		
		System.out.println(v.peek());
		v.poll();
		System.out.println(v);
		

		
	}

}
