package corejava.constructor;

public class ParameterizedConstructor1 {
	int empId;
	String name;
	ParameterizedConstructor1(int id , String ename){
		//id = empId;
		//ename = name;
		empId = id;
		name = ename;
	}
	
	void display() {
		System.out.println("the emp id is " + empId + " the emp name is " + name);
	}
	
	public static void main(String[] args) {
		ParameterizedConstructor1 obj = new ParameterizedConstructor1(12,"techouts");
		obj.display();
	}
}