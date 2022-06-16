package corejava.inheritance;

class Animal2{
	void eat() {
		System.out.println("Eating");
	}
}

class Dog2 extends Animal2{
	void bark() {
		System.out.println("Barking");
	}
}

class Cat2 extends Animal2{
	void bread() {
		System.out.println("lab");
	}
} 

public class HierarchicalInheritance {
	public static void main(String[] args) {
		Cat2 obj = new Cat2();
		obj.bread();
		obj.eat();
		//obj.bark();
	}
}
