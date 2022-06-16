package corejava.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Demo implements Serializable{
	transient int i = 10;
	static int j = 20;
}

public class SerializationDemo {
	public static void main(String[] args) throws Exception {
		Demo d1 = new Demo();
		
		//this is serializable statements
		FileOutputStream fos = new FileOutputStream("abc.sai");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		//end of the serializable statements
		
		
		//start of deSerializable statements
		FileInputStream fis = new FileInputStream("abc.asd");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Demo d2 = (Demo)ois.readObject();
		//end of the deSerializable statements
		
		
		System.out.println(d2.i + " ----- " + d2.j);
	}
}
