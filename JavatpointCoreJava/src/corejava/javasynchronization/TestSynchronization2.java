package corejava.javasynchronization;

 class TableA {

	synchronized void printTable(int n) {// method not synchronized
		for (int i = 1; i <= 5; i++) {
			System.out
					.println(" printTable method of Tabel Class n * i Value:   "
							+ n * i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
}

class ClassC extends Thread {
	TableA t;

	ClassC(TableA t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}

}

class ClassD extends Thread {
	TableA t;

	ClassD(TableA t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
}

class TestSynchronization2 {
	public static void main(String args[]) {
		TableA obja = new TableA();// only one object
		ClassC t3 = new ClassC(obja);
		ClassD t4 = new ClassD(obja);
		t3.start();
		t4.start();
	}
}