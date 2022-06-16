package corejava.inheritance;

class Animal{// Animal is the main class which extends the Dog class
	void eat() {
		System.out.println("Eating");
	}
}

class Dog extends Animal{//Dog is the child class of the Animal
	void bark() {
		System.out.println("Barking");
	}
}

public class SingleInheritance { // SingleInheritance is the main class which has the main method
	public static void main(String[] args) {
		Dog obj = new Dog();//object creation
		obj.eat();//calling the methods 
		obj.bark();
	}
}
