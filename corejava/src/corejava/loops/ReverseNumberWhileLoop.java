//Reverse number using while loop
package corejava.loops;
import java.util.*;
public class ReverseNumberWhileLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int rem , rev=0;
		while(num > 0) { // if the codn is true then only we will entry into the loop
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		System.out.println(rev);
	}
}
