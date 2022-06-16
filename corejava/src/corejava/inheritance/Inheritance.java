package corejava.inheritance;

class Inheritance1{
	int salary = 10000;
}

public class Inheritance extends Inheritance1 {
	
	int bonus = 1000;
	
	public static void main(String[] args) {
		Inheritance obj = new Inheritance();
		System.out.println("The salary is: " + obj.salary);
		System.out.println("The bonus is: " + obj.bonus);
	}
}
