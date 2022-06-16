package corejava.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Example {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(45);
		list.add(78);
		System.out.println("ArrayList is " + list);
		
		LinkedList<Integer> ll = new LinkedList<>(list);
		ll.add(0, 23);
		ll.add(1, 56);
		ll.add(1, 89);
		System.out.println("LinkedList is " + ll);
		
		ArrayList<Integer> list1 = new ArrayList<>(ll);
		System.out.println("ArrayList2 is " + list1);
		ll.removeIf((n) -> n>30);
		System.out.println("ArrayList2 is " + ll);

	}
}
