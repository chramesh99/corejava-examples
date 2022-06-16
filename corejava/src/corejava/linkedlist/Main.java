package corejava.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		BooksExample obj = new BooksExample(1, "python", "vgs", "xyz", 10);
		BooksExample obj1 = new BooksExample(1, "python", "vs", "xyz", 15);
		BooksExample obj2 = new BooksExample(1, "python", "vg", "xyz", 0);
		
		List<BooksExample> list = new LinkedList<>();
		list.add(obj);
		list.add(obj1);
		list.add(obj2);
		
//		for(BooksExample books:list) {
//			System.out.println(books.id + " " + books.bookName + " " + " " + books.publisher + " " + books.author + " " + books.quantity);
//		}
		//System.out.println(obj.getId());
		System.out.println(obj.toString());
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
	}
}
