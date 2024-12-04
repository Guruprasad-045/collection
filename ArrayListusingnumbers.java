package arraylist1;
import java.util.ArrayList;


public class ArrayListusingnumbers {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		System.out.println(al);
		al.add(2,15);
		System.out.println(al);
		al.set(3, 23);
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		
	}
	}