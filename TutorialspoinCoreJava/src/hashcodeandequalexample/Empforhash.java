package hashcodeandequalexample;

public class Empforhash {

	private int age;
	private String name;

	public Empforhash(int age, String name) {

		super();

		this.age = age;
		this.name = name;

	}

	public int hashCode() {
		return age;
	}

	public boolean equals(Object obj) {
		boolean flag = false;
		Empforhash emp = (Empforhash) obj;
		if (emp.age == age && emp.name == name)
			flag = true;
		return flag;
	}

}
