package corejava.arraylist;

import java.util.ArrayList;

public class RetainMethod {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		System.out.println(list.isEmpty());
		list.add("goa");
		list.add("vijayawada");
		list.add("guntur");
		list.add("delhi");
		System.out.println(list.isEmpty());
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("delhi");
		list2.add("guva");
		System.out.println(list2);
		list.retainAll(list2);
		System.out.println(list);
		System.out.println(list);
	}
}
