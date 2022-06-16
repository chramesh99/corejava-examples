package corejava.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class AddingItems {
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(1);
		ll.add(10);
		ll.add(15);
		ll.add(20);
		ll.add(25);
		
		System.out.println(ll);
		
		ll.addFirst(100000);
		ll.addLast(15457458);
		
//		Iterator<Integer> il = ll.iterator();
//		while(il.hasNext()) {
//			System.out.println(il.next());
//		}
		
//		ll.clone();
//		System.out.println(ll);
//		
//		
//		System.out.println(ll.contains(150));
//		
//		System.out.println(ll.element());
//		
//		System.out.println(ll.get(0));
//		System.out.println(ll.getFirst());
//		System.out.println(ll.getLast());
//		System.out.println(ll.offer(147));
//		System.out.println(ll);
//		System.out.println(ll.offerFirst(156));
//		System.out.println(ll);
		
//		System.out.println(ll.peek());//retrives first element in the list
//		System.out.println(ll.peekFirst());
//		System.out.println(ll.peekLast());
//		
//		System.out.println(ll.poll());//as well as pollFirst() and pollLast() it will retrives and delete the item in the list
//		System.out.println(ll);
		
//		System.out.println(ll.pop());
//		System.out.println(ll);
//		ll.push(457);
//		System.out.println(ll);
		
//		ll.pop();
//		System.out.println("After pop operation " + ll);
//		
//		ll.set(0, null);
//		System.out.println("After set " + ll);
		
		System.out.println(ll.size());
		
	}
}
