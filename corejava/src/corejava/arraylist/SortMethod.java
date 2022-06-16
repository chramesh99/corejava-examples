package corejava.arraylist;
import java.util.*;

public class SortMethod {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("goa");
		list.add("vijayawada11");
		list.add("vijayawada9");

		list.add("guntur");
		list.add("delhi9");
		
		System.out.println("Before the sorting the list:");
		for(String city:list) {
			System.out.println(city);
		}
		
		System.out.println("After sorting the list:");
		Collections.sort(list);
		for(String city:list) {
			System.out.println(city);
		}
		
		
		
	}
}
