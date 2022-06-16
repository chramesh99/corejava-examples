package corejava.constructor;

public class ConOverLoading {
	int empNum;
	String name;
	int age;
	
	ConOverLoading(int num , String name1){
		empNum = num;
		name = name1;
		//age = 18;
	}
	
	ConOverLoading(int num , String name1 , int age1){
		empNum = num;
		name = name1;
		age = age1;
	}
	
	void display() {
		System.out.println(empNum + " " + name + " " + age);
	}
	
	public static void main(String[] args) {
		ConOverLoading obj = new ConOverLoading(12,"asdf",1);
		ConOverLoading obj1 = new ConOverLoading(12,"qwer");
		obj.display();
		obj1.display();
	}
	
}
