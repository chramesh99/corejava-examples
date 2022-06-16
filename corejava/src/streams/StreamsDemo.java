package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(50);
		list.add(15);
		list.add(10);
		list.add(20);
		System.out.println(list);
		List<Integer> list2 = list.stream().map(i -> i+5).collect(Collectors.toList());
		System.out.println(list2);
		
		List<Integer> list3 = list.stream().sorted().collect(Collectors.toList());
		System.out.println(list3);
		
		list.stream().forEach(System.out::println);
		
		long number = list.stream().filter(i -> i>0).count();
		System.out.println(number);
		
		int list4 = list2.stream().min((i1,i2) -> i1.compareTo(i2)).get();
		System.out.println(list4);		
	}
}
