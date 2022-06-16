package corejava.arraylist;
import java.util.*;

public class AddingItems {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("10");
		list.add("147");
		list.add("7895");
		list.add("14578");
		list.add("10");
		System.out.println("The list is " + list);
		
//		list.add(0, "1");
//		
//		
////		System.out.println("the 14577 is present or not " + list.contains("14577"));
////		
////		System.out.println("The 14577 is present or not using index " + list.indexOf("14577"));
//		
//		Iterator<String> itr = list.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		System.out.println(list.size());
	}
}
