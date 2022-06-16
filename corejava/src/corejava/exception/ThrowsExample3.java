package corejava.exception;

class Test1{
	void div() throws ArithmeticException{
		int q , w , e;
		q = 10;
		w = 0;
		e = q / w;
		System.out.println("The Exception is" + e);
		System.out.println(" Block 1");
	}
}

public class ThrowsExample3 {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		try {
			t1.div();
		}
		catch(ArithmeticException ae) {
			System.out.println("The number Cannot divisible by zero " + ae);
		}
	}
	
}
