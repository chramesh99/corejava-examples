package corejava.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class AddingElementsUsingIterator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter ");
		ArrayList<Integer> li = new ArrayList<>();
		while(true) {
			int i = sc.nextInt();
			if(i != 0) {
				li.add(i);
				System.out.println("press '0' to exit");
			}
			else {
			break;
		}
		}
		System.out.println(li);
		
		//System.out.println(li instanceof );
		
	}
}
