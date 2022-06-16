package corejava.exception;

class Test{
	void div() throws ArithmeticException {
		int q , w , e;
		q = 10;
		w = 0;
		try {
			e = q / w;
			System.out.println("The Exception is" + e);
		}
		catch(ArithmeticException ae) {
			System.out.println(ae + " Block 1");
		}
		
	}
}

public class ThrowsExample1 {
	public static void main(String[] args) throws ArithmeticException{
		Test t = new Test();
		t.div();
		System.out.println("completed.");
	}
}
