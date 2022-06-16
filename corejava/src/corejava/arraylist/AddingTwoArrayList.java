package corejava.arraylist;
import java.util.*;
public class AddingTwoArrayList {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Mango");
		list1.add("Banana");
		System.out.println("Before adding the list" + list1);
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("Apple");
		list2.add("guva");
		System.out.println("List2 is:");
		System.out.println(list2);
		
		list1.addAll(list2);
		
		System.out.println("After adding the list1 " + list1);
		
	}
}
