package enumpackage;

enum Month{
	JAN(1),FEB(2),MAR(3),APR(4);
	int value;
	private Month(int value) {
		this.value=value;
	}
	public int getValue() {
		return value;
	}
}

public class Test {
	public static void main(String[] args) {
		Month [] bMonths = Month.values();
		for(Month b1 : bMonths) {
			System.out.println(b1 + " -------|> " + b1.getValue());
		}
	}
}
