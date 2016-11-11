package corejava.javasynchronization;

class BankAccount {
	synchronized static void saveMoney(int n, String st) {
		System.out
				.println("saveMoney method of BankAccount is currently used by  :  "
						+ Thread.currentThread().getName() + " : " + st);

		for (int i = 1; i < 5; i++) {
			System.out.println(" Deposite Money : " + i * n + "  by " + st);

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}

abstract class Person extends Thread {

	abstract public void run();

}

class Mohan extends Person {

	public void run() {
		System.out.println("Current Thread Mohan :  "
				+ Thread.currentThread().getName());
		BankAccount.saveMoney(1, "Mohan");
	}

}

class Sohan extends Person {

	public void run() {
		System.out.println("Current Thread Sohan :  "
				+ Thread.currentThread().getName());
		BankAccount.saveMoney(10, "Sohan");
	}

}

class Tohan extends Person {

	public void run() {
		System.out.println("Current Thread Tohan :  "
				+ Thread.currentThread().getName());
		BankAccount.saveMoney(100, "Tohan");
	}

}

class Lohan extends Person {

	public void run() {
		System.out.println("Current Thread Lohan :  "
				+ Thread.currentThread().getName());
		BankAccount.saveMoney(1000, "Lohan");
	}

}

public class TestSynchronization4 {

	public static void main(String[] args) {

		System.out.println("Current Thread:  "
				+ Thread.currentThread().getName());

		Person p1 = new Mohan();
		Person p2 = new Sohan();
		Person p3 = new Tohan();
		Person p4 = new Lohan();
		p1.start();
		p2.start();
		p3.start();
		p4.start();

	}

}
