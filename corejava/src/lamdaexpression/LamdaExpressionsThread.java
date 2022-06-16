package lamdaexpression;

public class LamdaExpressionsThread {
	public static void main(String[] args) {
		Runnable mr = () -> {
			for(int i = 0 ; i < 10 ; i++) {
				System.out.println("This is child Thread");
			}
		};
		Thread t = new Thread(mr);
		t.start();
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println("This is main Thread");
		}
	}
}
