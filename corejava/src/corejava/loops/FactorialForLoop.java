//Factorial of a given number
package corejava.loops;
import java.util.*;
public class FactorialForLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int fact = 1;
		for(int i = 1 ; i <= num ; i++) { //if the codn is true then only the for loop executed
			fact = fact * i;
		}
		System.out.println("the factorial of " + num + " is : " + fact);
		
	}
}
