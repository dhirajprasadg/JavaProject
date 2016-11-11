package corejava.javasynchronization;

class Customer {
	int amount = 100;

	public synchronized void withdraw(int am) {
		System.out.println("going to withdraw...");
		if (this.amount < am) {
			System.out.println(" cant withdraw as money is less ");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.amount -= am;
			System.out.println("withdraw completed...");
		} 
	}

	public synchronized void deposite(int amo) {
		System.out.println("going to deposit...");
		this.amount += amo;
		System.out.println("deposit completed... ");
		notify();
	}

}

public class WaitandNotify {

	public static void main(String[] args) {
		final Customer cm = new Customer();

		new Thread() {
			public void run() {
				cm.withdraw(500);
			}
		}.start();

		new Thread() {
			public void run() {
				cm.deposite(800);
			}
		}.start();

	}

}
