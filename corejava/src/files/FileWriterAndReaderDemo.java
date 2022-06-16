package files;

import java.io.FileWriter;

public class FileWriterAndReaderDemo {
	public static void main(String[] args) throws Exception{
		FileWriter fw = new FileWriter("File.txt");
		fw.write("AAAA");
		fw.write("BBBB");
		fw.write("CCCC");
		fw.write("DDDD");
		fw.flush();
		fw.close();
	}
}
