package corejava.exception;

public class NestedTry1 {
	public static void main(String[] args) {
		try {
			
			try {
				int n = 30 / 0;
				System.out.println(n);
			}catch(NullPointerException e) {
				System.out.println("Block one"+e);
			}
			
			try {
				int g[] = new int[10];
				g[10] = 15;
			}
			catch(ArrayIndexOutOfBoundsException nt) {
				System.out.println("the array size is 10");
			}
		}
		catch(NullPointerException nt) {
			System.out.println(nt + "Blockl one's exception");
		}catch(Exception e) {
			System.out.println("last exception");
		}
	}
}
