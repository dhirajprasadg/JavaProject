package multithreading.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WorkerThread implements Runnable {
	private String message;

	WorkerThread(String st) {
		this.message = st;
	}

	@Override
	public void run() {
		System.out.println(" Work Started from Thread // "
				+ Thread.currentThread().getName());
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(message + " done From Thread : "
				+ Thread.currentThread().getName());
	}

	public static void main(String[] args) {

		// Thread t1 = new Thread(new WorkerThread());
		// t1.start();
		// No need to create Thread mannualy and start .. Executor class will
		// create 5 thread for you as below

		ExecutorService ex = Executors.newFixedThreadPool(5);

		for (int i = 0; i < 10; i++) {

			WorkerThread wo = new WorkerThread("Work " + i);
			ex.execute(wo);
		}

		ex.shutdown();
		while (!ex.isTerminated()) {

		}
		System.out.println(" All Task Completed ");
	}

}
