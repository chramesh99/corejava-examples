package corejava.exception;

class Example{
	void method() throws ArithmeticException {
		throw new ArithmeticException("This is the example of Throws");
	}
}

public class ThowsExample {
	public static void main(String[] args) {
		try {
			Example e = new Example();
			e.method();
		}
		catch(ArithmeticException ae) {
			System.out.println("Exception Handled");
		}
		System.out.println("This is the throws example");
	}
}
