package corejava.inheritance;

class Calculation{
	int z;
	void addition(int x , int y) {
		z = x + y;
		System.out.println("The addition of two numbers : " + z);
	}
}

class Sub extends Calculation{
	void addition(int x , int y) {
		super.addition(1, 8);
		z = x - y;
		System.out.println("The Sub of two numbers : " + z);
	}
}

class Mul extends Sub{
	void mul(int x , int y) {
		z = x * y;
		System.out.println("The mul of two numbers: " + z);
	}
}

public class Example {
	public static void main(String[] args) {
		Mul obj = new Mul();
		//obj.addition(1, 8);
		obj.addition(5, 9);
		obj.mul(8, 9);
	}
}
