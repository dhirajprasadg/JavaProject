package corejava.javaserialiszation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Persist {

	public static void main(String[] args) throws Exception {
		
		Student st1 = new Student(1, "Dhiraj");
		Student st2 = new Student(2, "Iti");		
		System.out.println(" Student Name : " + st1.getName());
		System.out.println(" Student object Created ");
		// Serialize the Student object .. ie convert the state of student object into  byte
		
		FileOutputStream os1 = new FileOutputStream("E:/eclipse/workspace/file.txt") ;
		ObjectOutputStream oos = new ObjectOutputStream(os1);	
		oos.writeObject(st1);
		oos.flush();
		System.out.println(" Object is stored ");

	FileInputStream fis = new FileInputStream("E:/eclipse/workspace/file.txt");
	ObjectInputStream ois = new ObjectInputStream(fis);
	
	Student sto = (Student) ois.readObject();
	System.out.println("Reading for serialized object stored : " + sto.getName() );
	
	ois.close();
	}

}
