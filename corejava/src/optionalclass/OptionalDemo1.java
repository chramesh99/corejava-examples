package optionalclass;

import java.util.Optional;

public class OptionalDemo1 {
	public static void main(String[] args) {
		String [] str = new String[10];
		//String lowerCaseString = str[5].toLowerCase();
		//System.out.println(lowerCaseString);
		str[5] = "this is STRING";
		Optional<String> check = Optional.ofNullable(str[5]);
//		if(check.isPresent()) {
//			String lowerCaseString = str[5].toLowerCase();
//			System.out.println(lowerCaseString);
//		}
//		else {
//			System.out.println("The String is not present");
//		}
		
		System.out.println("the value is:" + check.filter(s->s.equals("this")));
		System.out.println("the value is:" + check.filter(s->s.equals("this is STRING")));
		
		
	}
}
