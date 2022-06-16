package corejava.arraylist;

import java.util.ArrayList;

public class DuplicatesRemove {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(24);
		list.add(27);
		list.add(1);
		list.add(24);
		list.add(27);
		System.out.println(list);
		ArrayList<Integer> list2 = new ArrayList<>();
		for(Integer i : list) {
			if(!list2.contains(i)) {
				list2.add(i);
			}
		}
		System.out.println(list2);
	}
}
