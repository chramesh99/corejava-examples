package corejava.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class DescendingOrder {
	
	public static void main(String[] args) {
		ArrayList <Integer> list = new ArrayList<>();
		list.add(0);
		list.add(100);
		list.add(1000);
		list.add(10000);
		list.add(154);
		Collections.sort(list);
		System.out.println("Unsorted list " + list);
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("Sorted list " + list);
	}
}
