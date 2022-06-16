package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.w3c.dom.ls.LSOutput;

class Product{
	int id;
	String name;
	double price;
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
}

public class StreamsDemo1 {
	public static void main(String[] args) {
		ArrayList<Product> productList = new ArrayList<>();
		productList.add(new Product(101, "asd4", 1025));
		productList.add(new Product(102, "asd4", 4125));
		productList.add(new Product(103, "asd4", 7845));
		productList.add(new Product(104, "asd4", 7845));
		
//		Map<String , Double> productlist2 = productList.stream().collect(Collectors.toMap(np->np.name,np->np.price));
//		@SuppressWarnings("rawtypes")
//		Stream<Map> stream = Stream.of(productlist2);
//		stream.forEach(System.out::println);
//		Set<String> set = productList.stream().map(name->name.name).collect(Collectors.toSet());
//		System.out.println(set);
		
//		int count = productList.stream().peek(e -> e.id);
//		System.out.println(count);
		
//		productList.stream().map(x -> x.name).peek(System.out::print);
		
		long count = productList.stream().map(x -> x.id).peek(System.out::print).count();
		System.out.println(count);
		
//		System.out.println(listXList);
		
//		System.out.println(productList.stream().allMatch(name->name.name.length()==5));
	}
}
