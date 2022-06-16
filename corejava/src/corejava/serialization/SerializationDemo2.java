package corejava.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable{
	Cat c = new Cat();
	private void writeObject(ObjectOutputStream os) throws Exception {
		os.defaultWriteObject();
	}
}

class Cat implements Serializable{
	Rat r = new Rat();
}

class Rat implements Serializable{
	int i = 20;
}

public class SerializationDemo2 {
	public static void main(String[] args) throws Exception {
		Dog d1 = new Dog();
		FileOutputStream fos = new FileOutputStream("dat.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		FileInputStream fis = new FileInputStream("dat.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog) ois.readObject();
		System.out.println(d2.c.r.i);
	}
}
