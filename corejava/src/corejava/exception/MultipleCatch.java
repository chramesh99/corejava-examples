package corejava.exception;

public class MultipleCatch {
	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			System.out.println(a[10]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("the array size is 5" + e);
		}
		catch(Exception e) {
			System.out.println("Exception is used to handle all the exceptions" + e);
		}
	}
	
}
