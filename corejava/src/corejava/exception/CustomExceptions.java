package corejava.exception;

class NotValid extends Exception{
	
	public NotValid(String str) {
		System.out.println("This is NotVaild Exception");
	}
}

public class CustomExceptions {
	public static void main(String[] args) {
		try {
			throw new NotValid("This is user defined exceptions");
		}
		catch(NotValid nv) {
			System.out.println("Caught the exceptions");
			System.out.println(nv.getMessage());
		}
	}
}