package FunctionalInterface;

@FunctionalInterface //Optional annotation 
interface interf{
	void add(int a, int b);
}

public class FunctionalInterfaceDemo {
	public static void main(String[] args) {
		interf i = (a,b) -> System.out.println("The sum is:" + (a+b));
		i.add(10,20);
	}
}
