package corejava.exception;

public class NestedTry {
	public static void main(String[] args) {
		int l , m , n;
		l = 45;
		m = 0;
		try {
			n = l / m;
		}
		catch(ArithmeticException ew) {
			System.out.println("number is not divisible by zero " + ew);
		}
		try {
			int z[] = new int[5];
			z[5] = 10;
		}
		catch(ArrayIndexOutOfBoundsException ew) {
			System.out.println("The array size is 5" + ew);
		}
		
		System.out.println("remain.");
	}
}
