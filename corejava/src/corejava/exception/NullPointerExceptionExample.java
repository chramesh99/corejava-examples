package corejava.exception;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		try {
			String name = null;
			System.out.println(name.length());
		}
		catch(ArrayIndexOutOfBoundsException as) {
			System.out.println("the array size is 5" + as);
		}
		catch(Exception as) {
			System.out.println("here the name is null" + as);
		}
	}
}

// here in this example we write the ArrayIndexOutBoundsException and Exception and in try we null the string
//so it will taken the Exception out ArrayIndexOutBoundsException.