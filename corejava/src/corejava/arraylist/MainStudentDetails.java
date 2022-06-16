package corejava.arraylist;
import java.util.*;
public class MainStudentDetails {
	public static void main(String[] args) {
		StudentDetails s1 = new StudentDetails(121 , "dundi" , 11);
		StudentDetails s2 = new StudentDetails(125 , "ramesh" , 15);
		StudentDetails s3 = new StudentDetails(154 , "venkata" , 14);
		StudentDetails s4 = new StudentDetails(155 , "venky" , 16);
		ArrayList<StudentDetails> details = new ArrayList<>();
		details.add(s1);
		details.add(s2);
		details.add(s3);
		details.add(s4);
		
		
		for(StudentDetails d:details) {
			System.out.println(d.stdNumber + " " + d.stdName + " " + d.stdage);
		}
	}
}
