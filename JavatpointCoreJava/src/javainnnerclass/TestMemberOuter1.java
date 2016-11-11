package javainnnerclass;

// Member Inner class Example
public class TestMemberOuter1 {
	private int data = 50;

	class Inner{
		void msg(){
			System.out.println(" I am Member inner Class ");
		}
	}
	
	public static void main(String[] args) {
	
		TestMemberOuter1 obj = new TestMemberOuter1();
		TestMemberOuter1.Inner in = obj.new Inner();
	
		in.msg();
		
		obj.new Inner().msg();
		
	}

}
