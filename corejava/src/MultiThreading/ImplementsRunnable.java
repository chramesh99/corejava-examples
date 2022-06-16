package MultiThreading;

class RunnableInterface implements Runnable{
	public void run() {
		for(int i = 0 ; i<10 ; i++) {
			System.out.println("This is child thread");
		}
	}
}

public class ImplementsRunnable {
	public static void main(String[] args) {
		RunnableInterface t = new RunnableInterface();
		Thread t1 = new Thread(t);
		t1.start();
		for(int i = 0 ; i<10 ; i++) {
			System.out.println("This is main thread");
		}
		System.out.println(t1.getName());
	}
}
