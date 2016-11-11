package corejava.javasynchronization;

class Table {

	void printTable(int n) {// method not synchronized
		for (int i = 1; i <= 5; i++) {
			System.out.println(" printTable method of Tabel Class n * i Value:   " + n * i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
}

class ClassA extends Thread {
	Table t;

	ClassA(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}

}

class ClassB extends Thread {
	Table t;

	ClassB(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
}

class TestSynchronization1 {
	public static void main(String args[]) {
		Table obj = new Table();// only one object
		ClassA t1 = new ClassA(obj);
		ClassB t2 = new ClassB(obj);
		t1.start();
		t2.start();
	}
}