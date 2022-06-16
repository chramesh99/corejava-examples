package methodreference;

public class ConstructorReferenceDemo {
	public static void main(String[] args) {
		interf i = Student::new;
		i.set("asd", 0, 0, 0);
		i.set("asdf", 0, 0, 0);
		i.set("qwwerrtt", 0, 0, 0);
	}
}

class Student{
	String name;
	int rollNo;
	int marks;
	int age;
	public Student() {
		
	}
	public Student(String name, int rollNo, int marks, int age) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
		this.age = age;
	}
}

interface interf{
	public Student set(String name, int rollNo, int marks, int age);
}

