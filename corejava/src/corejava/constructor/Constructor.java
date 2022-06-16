package corejava.constructor;

public class Constructor {
	int a = 10;
	int b = 50;
	Constructor(){ // ConstructorConstructor(){ // Co
		System.out.println("This is Constructor block.");
		int result = a + b;
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		Constructor obj = new Constructor();
		System.out.println("This is main block");
	}
}


// when the object is created the constructed called automatically