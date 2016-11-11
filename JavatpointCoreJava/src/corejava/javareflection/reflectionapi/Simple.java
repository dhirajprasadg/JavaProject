package corejava.javareflection.reflectionapi;

public class Simple {
/*	private int num;
	private String name;
	
	private void changeName (String na){
		this.name =na;
	}
	
	private void getName(){
	 System.out.println(" Name is : " + this.name);	
	}
	*/
	private void pritName(){
		System.out.println(" printing private method of Simple Class");
		
	}
	/* cant override the method by changing retrun type 
    public int pritName(){
		System.out.println(" printing private method of Simple Class");
		return 5;
	}
*/
	public void printName(){
		System.out.println(" Public method of Simple Class ");
	}
}
