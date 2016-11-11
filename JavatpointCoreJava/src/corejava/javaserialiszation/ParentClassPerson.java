package corejava.javaserialiszation;

import java.io.Serializable;

public class ParentClassPerson implements Serializable {

	private int id;
	private String name;

	

	public ParentClassPerson(int id, String na) {
		this.id = id;
		this.name = na;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
