package corejava.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable{
	String userName = "ramesh";
	transient String password = "buddy";
	transient int pin = 4578;
	
	private void writeObject(ObjectOutputStream os) throws Exception{
		os.defaultWriteObject();
		String epwd = "123" + password;
		int epin = 4444 + pin;
		os.writeObject(epwd);
		os.writeObject(epin);
	}
	
	private void readObject(ObjectInputStream is) throws Exception{
		is.defaultReadObject();
		String epwd = (String) is.readObject();
		password = epwd.substring(3);
		int epin = is.readInt();
		pin = epin - 4444;
	}
}

public class SerializationDemo3 {
	public static void main(String[] args) throws Exception {
		Account a1 = new Account();
		System.out.println(a1.userName + " ---- " + a1.password + " ---- " + a1.pin);
		
		FileOutputStream fos = new FileOutputStream("text.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a1);
		
		FileInputStream fis = new FileInputStream("text.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account a2 = (Account)ois.readObject();
		
		System.out.println(a2.userName + " --- " + a2.password + " --- " + a2.pin);
	}
}
