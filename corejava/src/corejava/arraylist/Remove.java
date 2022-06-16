package corejava.arraylist;
import java.util.*;
public class Remove {
	public static void main(String[] args) {
		ArrayList<Integer> remove = new ArrayList<>();
		remove.add(1);
		remove.add(2);
		remove.add(3);
		remove.add(4);
		remove.add(5);
		System.out.println(remove);
		remove.remove(0);
		System.out.println(remove);
		remove.remove(2);
		System.out.println(remove);
	}
}
