package corejava.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Reverse {
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(1);
		ll.add(10);
		ll.add(15);
		ll.add(20);
		ll.add(25);
		System.out.println(ll);
		
		System.out.println("this normal list");
		Iterator<Integer> il = ll.iterator();
		while(il.hasNext()) {
			//System.out.println("this normal list");
			System.out.println(il.next());
		}
		
		System.out.println("This is reverse list");
		Iterator<Integer> itr = ll.descendingIterator();
		while(itr.hasNext()) {
			//System.out.println("This is reverse list");
			System.out.println(itr.next());
		}
		
		
	}
}
