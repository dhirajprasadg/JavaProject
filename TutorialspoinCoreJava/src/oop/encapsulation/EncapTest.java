package oop.encapsulation;

/* File name : EncapTest.java */
public class EncapTest {

	private String name;
	private String idNum;
	private int age;

	// private - the variables of a class will be hidden from other classes,
	// and can be accessed only through the methods of their current class.

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getIdNum() {
		return idNum;
	}

	public void setAge(int newAge) {
		age = newAge;
	}

	public void setName(String newName) {
		name = newName;
	}

	public void setIdNum(String newId) {
		idNum = newId;
	}
}