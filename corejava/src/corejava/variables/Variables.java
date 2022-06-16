package corejava.variables;

public class Variables {
	
	int age = 10;//global variable
	long phoneNumber = 1234567890l;
	double salary = 1.04;
	
	public static void main(String[] args) {
		int age = 15;//local variable
		System.out.println(age);
	}
}
