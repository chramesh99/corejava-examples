package files;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) throws Exception {
		File file = new File("abc");
		System.out.println(file.exists());
		
		file.mkdir();
		System.out.println(file.exists());
		
	}
}
