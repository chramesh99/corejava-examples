package corejava.polymorphism;

class Add{
	int add(int a , int b) {
		return a + b;
	}
	
	int add(int a , int b , int c) {
		return a + b + c;
	}
}

public class CompileTimePolymorphism {
	public static void main(String[] args) {
		Add obj = new Add();
		System.out.println(obj.add(1, 5));
		System.out.println(obj.add(99, 78, 54));
	}
}
