package MultiThreading;

class MyThread extends Thread{
	public void start() {
		super.start();
		System.out.println("This is start method");
	}
	public void run() {
		System.out.println("This is run method");
	}
}

public class ExtendingThreadClass {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		System.out.println("This is main method");
		t.start();
	}
}
