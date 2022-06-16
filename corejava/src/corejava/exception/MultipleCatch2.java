package corejava.exception;

public class MultipleCatch2 {
	public static void main(String[] args) {
		try {
			int c[] = new int[5];
			c[5] = 30/0; 
		}
		catch(Exception ex) {
			System.out.println("This is the Exception block");
		}
	}
}
