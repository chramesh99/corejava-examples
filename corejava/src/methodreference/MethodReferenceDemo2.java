package methodreference;

public class MethodReferenceDemo2 {
	
	public void m1() {
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println("Method Reference");
		}
	}
	
	public static void main(String[] args) {
		MethodReferenceDemo2 obj = new MethodReferenceDemo2();
		Runnable mr = obj::m1;
		Thread thread = new Thread(mr);
		thread.start();
		
	}
}
