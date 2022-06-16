package corejava.set;

import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<>();
		t.add(10);
		t.add(1);
		t.add(98);
		t.add(50);
		t.add(100);
		System.out.println(t);
		System.out.println(t.descendingSet());
		
		TreeSet<String> a = new TreeSet<>();
		a.add("one");
		a.add("nine");
		a.add("three");
		a.add("four");
		a.add("six");
		a.add("eight");
		System.out.println(a);
		System.out.println(a.descendingSet());
	}
}



