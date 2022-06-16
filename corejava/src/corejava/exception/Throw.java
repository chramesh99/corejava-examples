package corejava.exception;

public class Throw {
	public static void display(int age) {
		if(age > 18) {
			throw new ArithmeticException("is not eligible");
			//System.out.println("is not eligible");
		}
		else {
			//System.out.println("is eligible");
			throw new ArrayIndexOutOfBoundsException("is eligible");
		}
	}
	public static void main(String[] args) {
		display(19);
		System.out.println("This main block");
	}
}
