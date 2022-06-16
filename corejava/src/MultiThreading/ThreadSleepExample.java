package MultiThreading;

class MyThread2 extends Thread{
	public void run() {
		for(int i = 0 ; i < 5 ; i++) {
			try {
				Thread.sleep(5000);
			}
			catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
}

public class ThreadSleepExample {
	public static void main(String[] args) {
		MyThread2 t = new MyThread2();
		MyThread2 t1 = new MyThread2();
		t.start();
		t1.start();
	}
}
