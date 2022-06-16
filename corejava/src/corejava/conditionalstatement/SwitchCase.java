package corejava.conditionalstatement;
import java.util.Scanner;
public class SwitchCase {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the value:");
			int value = sc.nextInt();
			
			switch(value) { // the value is given by the user
			case 1:{ // the given value is equal to case value then this case will executed
				System.out.println("Mn");
				break;
			}
			case 2:{
				System.out.println("Tu");
				break;
			}
			case 3:{
				System.out.println("wd");
				break;
			}
			case 4:{
				System.out.println("th");
				break;
			}
			case 5:{
				System.out.println("fr");
				break;
			}
			case 6:{
				System.out.println("sat");
				break;
			}
			case 7:{
				System.out.println("sun");
				break;
			}
			default:{
				System.out.println("Invaild input");
			}
			}
	}
}
