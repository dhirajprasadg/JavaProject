package javainnnerclass;

abstract class Person {
	abstract void eat();
}

interface Eatable{
	void eat();
}

class TestAnonymousInner {

	public static void main(String args[]) {

		Person p = new Person() {
			void eat() {
				System.out.println(" I am annonymus Class generated from abstract class");
			}
		};
		p.eat();
		
		Eatable e = new Eatable(){
			public void eat(){
				System.out.println(" I am annonymus Class generated from Interface class ");
			}
		};
		e.eat();
		
	}
}
