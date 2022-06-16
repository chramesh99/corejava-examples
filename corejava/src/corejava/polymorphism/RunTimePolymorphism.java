package corejava.polymorphism;

class Shape{
	int age = 1054;
	void draw() {
		System.out.println("This draw method is used for shape.");
	}
}

class Circle extends Shape{
	void draw() {
		System.out.println("Circle is drawn");
	}
}

class Triangle extends Shape{
	void draw() {
		super.draw();
		System.out.println("Triangle is drawn" + super.age);
	}
}

public class RunTimePolymorphism {
	public static void main(String[] args) {
//		Shape s;
//		s = new Shape();
//		s.draw();
//		s = new Circle();
//		s.draw();
//		s = new Triangle();
//		s.draw();
//		
		Triangle obj = new Triangle();
		obj.draw();
		
	}
}
