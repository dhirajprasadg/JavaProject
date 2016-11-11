package corejava.javasynchronization;

//Program of synchronized method by using annonymous class  
class TableCC {
	synchronized void printTableCC(int n) {// synchronized method
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
}

public class TestSynchronization3 {
	public static void main(String args[]) {
		final TableCC obj = new TableCC();// only one object

		Thread t1 = new Thread() {
			public void run() {
				obj.printTableCC(5);
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				obj.printTableCC(100);
			}
		};

		t1.start();
		t2.start();
	}
}