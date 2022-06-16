package corejava.conditionalstatement;
import java.util.*;
public class ConditionalStatement {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		
		if((num % 3 == 0) && (num % 5 == 0)) {//if the codn is true it will executed
			System.out.println("fizzbuzz");
		}
		else if(num % 3 == 0) {//if statement is false the else if is executed
			System.out.println("fizz");
		}
		else if(num % 5 == 0) {// else if is also false the this else if is executed
			System.out.println("buzz");
		}
		else {//if all the above statements are false then else statement will executed
			System.out.println(num);
		}
		
	}

}
