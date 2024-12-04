package linkedlist1;

import java.util.LinkedList;
public class linkedlistexample {
	public static void main(String[] args) {
		LinkedList li=new LinkedList();
		li.add("apple");
		li.add("banana");
		li.add("orange");
		li.add("cherry");
		System.out.println(li);
	    li.addFirst(10);
	    li.addLast(90);
	    System.out.println(li);
	    li.removeFirst();
	    System.out.println(li);
		
		
	}

}
