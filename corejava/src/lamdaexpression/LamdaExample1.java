package lamdaexpression;

interface Interf1{
	public void squareIt(int n);
}

public class LamdaExample1 {
	public static void main(String[] args) {
		Interf1 i = n -> System.out.println(n*n);
		i.squareIt(4);
	}
}
