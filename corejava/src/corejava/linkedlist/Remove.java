package corejava.linkedlist;

import java.util.LinkedList;

public class Remove {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("dundi");
		list.add("venkat");
		list.add("naga");
		list.add("kalayan");
		list.add("ramesh");
		System.out.println("This is list" + list);
		
		list.remove("ramesh");
		System.out.println("After deleting the item" + list);
		
		list.remove(0);
		System.out.println("After deleting the item through index " + list);
		
		LinkedList<String> list1 = new LinkedList<>();
		list1.add("dundi");
		list1.add("ramesh");
		
		list1.addAll(list);
		System.out.println(list1);
		
		list1.removeAll(list);
		System.out.println("After the remove" + list1);
		
		list1.clear();
		System.out.println("After clearing the list1 " + list1);
	}
}
