package corejava.exception;

public class MultipleCatch1 {
	public static void main(String[] args) {
		try {
			int b[] = new int [4];
			b[5] = 30/0;
		}
		catch(ArrayIndexOutOfBoundsException ie) {
			System.out.println("The array size is 4");
		}
		catch(ArithmeticException ie) {
			System.out.println("we cannot divisible the number by 0");
		}
		System.out.println(1 + 2);
	}
}
