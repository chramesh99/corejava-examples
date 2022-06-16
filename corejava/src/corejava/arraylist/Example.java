//nearest larger number for 4 is 5
package corejava.arraylist;

import java.util.ArrayList;

public class Example {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(5);
		list.add(7);
		list.add(19);
		list.add(71);
		list.add(80);
		
		int index;
		for(index = 0 ; index < list.size() ; index++) {
			if(list.get(index) < 71) {
				System.out.println(list.get(index));
				break;
			}
		}
	}
}
