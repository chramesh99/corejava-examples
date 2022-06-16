package corejava.vector;

import java.util.ArrayList;
import java.util.Vector;


public class Methods {
	public static void main(String[] args) {
		Vector<Integer> vec = new Vector<>();
		vec.add(1);
		vec.add(2);
		vec.add(3);
		vec.add(4);
		vec.add(5);
		System.out.println(vec);
		Integer arr[] = new Integer[5];
		vec.copyInto(arr);
		for(Integer d : arr) {
			System.out.println(d);
		}
		
		System.out.println("the hashcode of the vector is : " + vec.hashCode());
		System.out.println("the capacity of the vector is : " + vec.capacity());
		System.out.println("the element at 0 index " + vec.elementAt(0));
		Vector<String> sub = new Vector<>();
		sub.add("as");
		sub.add("df");
		sub.add("sf");
		Vector<Integer> vec1 = new Vector<>();
		vec1.add(1);
		vec1.add(2);
		vec1.add(3);
		vec1.add(4);
		vec1.add(5);
		System.out.println(vec1);
		System.out.println("The vec and vec1 are equal: " + vec.equals(vec1));
		
		System.out.println("The first component is: " + vec.firstElement());
		Vector<Vector> sub1 = new Vector<>();
		
	}
}
