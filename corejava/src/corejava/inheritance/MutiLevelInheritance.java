package corejava.inheritance;

class Animal1{
	void eat() {
		System.out.println("Eating");
	}
}

class Dog1 extends Animal1{
	void bark() {
		System.out.println("barking");
	}
}

class Cat extends Dog1 {
	void bread() {
		System.out.println("lab");
	}
}

public class MutiLevelInheritance {
	public static void main(String[] args) {
		Cat obj = new Cat();
		obj.eat();
		obj.bread();
		obj.bark();
	}
}
