package corejava.oops.finalkeyword;

// Cant extend the final Class .. extending final class means when we creat object of child class we invoke the child class constructor and super class consturctor is invoked
//public class Honda2 extends ClassFinal {

public class Honda2 {

	final void finalmethod() {
		System.out.println(" Final method cant be overwriten");
	}

}
