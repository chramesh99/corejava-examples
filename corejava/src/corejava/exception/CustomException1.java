package corejava.exception;

class UserDefineExceptions extends Exception{
	UserDefineExceptions(String str) {
		super(str);
	}
}

public class CustomException1 {
	public static void main(String[] args) {
		try {
			throw new UserDefineExceptions("the ude is the exception"); 
		}
		catch(UserDefineExceptions ude) {
			System.out.println("This is catch block");
			//System.out.println(ude.getMessage());
		}
	}
}
