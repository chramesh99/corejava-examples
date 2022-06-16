package corejava.exception;

class Throws{
	public static int divNumber(int a , int b) throws ArithmeticException {
		int div = a / b;
		return div;
	}
}

public class ThrowsExample2 {
	public static void main(String[] args) {
		Throws th = new Throws();
		try {
			System.out.println(th.divNumber(1, 0));
		}
		catch(Exception dn) {
			System.out.println("The number is not divisuble by zero");
		}
	}
}
