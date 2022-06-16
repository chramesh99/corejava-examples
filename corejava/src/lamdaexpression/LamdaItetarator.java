package lamdaexpression;

import java.util.ArrayList;

public class LamdaItetarator {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(41);
		list.add(47);
		list.add(55);
		list.add(78);
		
//		list.forEach(n -> System.out.println(n));
//		for (Integer p : list) {
//			System.out.println(p);
//		}
		list.forEach(p->System.out.println(p));
		
	}
}
