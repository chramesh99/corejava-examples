package corejava.constructor;

import java.util.Scanner;

public class ParameterizedConstructor {
	int a;//gobal variables
	int b;
	int result;
	ParameterizedConstructor(int c , int d){
		System.out.println("This is Parameterized Constructor.");
		result = c + d;
		System.out.println("The addition of two numbers are: " + result);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the parameters");
		ParameterizedConstructor obj = new ParameterizedConstructor(scanner.nextInt(), scanner.nextInt());
	}
}
