package multithreading.joiningthread;

public class TestJoinMethod1 extends Thread {
	{
		System.out.println(" // Running // : "
				+ Thread.currentThread().getName());
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(" --- Running--- : "
					+ Thread.currentThread().getName());
			if ("Ben".equals(Thread.currentThread().getName())) {
				try {
					Thread.sleep(77000);
				} catch (InterruptedException e) {
				}
			} else if ("Rish".equals(Thread.currentThread().getName())) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
				}
			}
		}

	}

	public static void main(String[] args) throws Exception {
		System.out.println(" Running1 : " + Thread.currentThread().getName());
		TestJoinMethod1 t1 = new TestJoinMethod1();
		System.out.println(" Running2 : " + Thread.currentThread().getName());
		TestJoinMethod1 t2 = new TestJoinMethod1();
		System.out.println(" Running3 : " + Thread.currentThread().getName());
		TestJoinMethod1 t3 = new TestJoinMethod1();
		System.out.println(" Running3 : " + Thread.currentThread().getName());
		t1.setName("Ben1");
		System.out.println(" Running4 : " + Thread.currentThread().getName());
		t2.setName("Rish2");
		System.out.println(" Running5 : " + Thread.currentThread().getName());
		t3.setName("Mom3");
		System.out.println(" Running6 : " + Thread.currentThread().getName());
		t1.start();
		System.out.println(" Running7 : " + Thread.currentThread().getName());
		t2.start();
		try {
			t2.join();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(" Running8 : " + Thread.currentThread().getName());
		t3.start();
		System.out.println(" Running9 : " + Thread.currentThread().getName());
		Thread.sleep(100); // make the main thread to sleep for a sec
		System.out.println(" Running10 : " + Thread.currentThread().getName());
		// time to interrupt t1 !!!!
		//t1.interrupt(); // throws Interrupted exception in the run method of
						// Thread t1
	}
}
