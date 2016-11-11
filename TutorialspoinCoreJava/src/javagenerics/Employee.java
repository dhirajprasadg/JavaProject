package javagenerics;

public class Employee {

	public int id ;
	public String name;
	
	Employee(int id , String name){
		this.id = id;
		this.name = name;
	}
	

	public void printName(){
		System.out.println( " Name of Employee: " + this.name + " \\ Id of Employee: " + this.id);
	}
}
