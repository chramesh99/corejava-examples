package corejava.exception;

public class FinalException {
	
	public static void main(String[] args) {
		try {
			int z = 10 / 0;
			System.out.println(z);
		}
		catch(Exception fe) {
			System.out.println(fe + " this is catch block");
		}
		finally {
			System.out.println("This is the finally block ");
		}
//		catch(Exception fe) {
//			System.out.println("This is main exception " + fe);
//		}
	}
}
