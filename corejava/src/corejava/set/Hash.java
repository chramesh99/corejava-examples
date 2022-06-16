package corejava.set;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class Hash {
	public static void main(String[] args) {
		Set<Integer> hashSet = new LinkedHashSet<Integer>();
		hashSet.add(1);
		hashSet.add(4);
		hashSet.add(80);
		hashSet.add(785);
		hashSet.add(80);
		System.out.println(hashSet);
		
		LinkedList<Integer> list = new LinkedList<>();
		list.add(104);
		list.add(457);
		list.add(10);
		System.out.println(list);
	}
}
