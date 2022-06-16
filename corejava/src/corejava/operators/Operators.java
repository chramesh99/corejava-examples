package corejava.operators;

public class Operators {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		//Arithmatic operators
		int result1 = num1 + num2;//binary operator
		int result2 = num1 - num2;
		System.out.println(result1 + " " + result2);
		
		//Comparision operators
		System.out.println(num2 == num3);
		System.out.println(num2 > num3);
		System.out.println(num2 < num3);
		System.out.println(num2 >= num3);
		System.out.println(num2 <= num3);
		System.out.println(num2 != num3);
		
		//Assignment operator
		System.out.println(num2 += 10);
		System.out.println(num2 /= num3);
		System.out.println(num2 *= num3);
		
		//unary operator
		System.out.println(num2++);//unary operator
		System.out.println(num2--);
		
		//ternary operator
		int min = (num1 > num2) ? num1 : num2;
		System.out.println(min);
		
		//Logical operator
		System.out.println(num2 < num3 && num1 < num2);
		System.out.println(num2 < num3 || num1 < num2);
		
	}
}
