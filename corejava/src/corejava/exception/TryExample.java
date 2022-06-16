package corejava.exception;

public class TryExample {
	public static void main(String[] args) {
		int i , j , k = 0;
		i = 8; // normal statements
		j = 0;
	
		try {
			k = i/j; // critical statements
		}
		catch(ArithmeticException e) { 
			System.out.println("Cannot divide by zero " + e);
		}		
		System.out.println(k);
	}
}

