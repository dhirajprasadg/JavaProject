package com.javatpoint.pojoorentityclass;

public class Student {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println(" Setter method is called to set name : " + name);
	}

	public void displayInfo() {
		System.out.println("Hello: " + name);
	}
}