package corejava.javaserialiszation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ChildClassStudent extends ParentClassPerson {
// Since Paraent Class is serialized so no need to implement serialize to child class , it will automaticlly inherit the serialize implementaion object
	String course;
	int fee;
	Address adr; // Has a relation so Address must be serialized to serialize the childClassStudent object serialized
	static String college ="SSS IT Pvt Ltd";//Static variable can't be serialized.
	transient String password; // transient datamember will not be serialized so it cant be saved in file or shard over network .
	// this is the reason password variable are genrally made as transient.
	
	public ChildClassStudent(String course, int fee, int id, String name,Address ad,String pa) {
		super(id, name);
		this.course = course;
		this.fee = fee;
		this.adr=ad;
		this.password=pa;

	}

	public static void main(String[] args) throws Exception {
		Address ad1 = new Address("Ananthnagar","Bangalore","560100");
		ChildClassStudent ccl = new ChildClassStudent("MBA", 500, 1, "Puneet" ,ad1,"mypassword");

		FileOutputStream fo = new FileOutputStream(
				"E:/eclipse/workspace/filechildclass.txt");
		ObjectOutputStream out = new ObjectOutputStream(fo);
		out.writeObject(ccl);
		out.flush();

		FileInputStream fi = new FileInputStream(
				"E:/eclipse/workspace/filechildclass.txt");
		ObjectInputStream oin = new ObjectInputStream(fi);
		ChildClassStudent cls = (ChildClassStudent) oin.readObject();

		System.out.println("Person Id:  " + cls.getId() + " Student Cource : "
				+ cls.course);

		System.out.println("Address  " + cls.adr.addressline );
		System.out.println("Lets check password is serialized and deserialize ? : " + cls.password );
	}

}
