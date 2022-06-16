package MultiThreading;

class MyThreadPriority extends Thread{
	public void run() {
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println("this is child Thread");
		}
	}
}

public class ThreadPriority {
	public static void main(String[] args) {
		MyThreadPriority t = new MyThreadPriority();
		t.setPriority(15);
		t.start();
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println("This is main Thread");
		}
	}
}
