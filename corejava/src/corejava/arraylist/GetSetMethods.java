package corejava.arraylist;

import java.util.ArrayList;

public class GetSetMethods {
	public static void main(String[] args) {
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("goa");
		list2.add("vijayawada");
		list2.add("guntur");
		list2.add("delhi");
		
		System.out.println("Before setting the value " + list2.get(3));//before setting the value
		list2.set(3, "Delhi");
		for(String city : list2) {
			System.out.println(city);//after setting the value
		}
	}
}
