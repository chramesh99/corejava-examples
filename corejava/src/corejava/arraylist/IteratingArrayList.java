package corejava.arraylist;
import java.util.*;
public class IteratingArrayList {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Mango");
		list1.add("Apple");
		list1.add("Mango");
		list1.add("Grapes");
		
//		for(String fruits : list1) {
//			System.out.println(fruits);
//		}
		
		Iterator<String> itr1 = list1.iterator();
		int i = 0;
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}
}
