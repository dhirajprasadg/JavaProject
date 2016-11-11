package threadsexample;

public class Runnablethread implements Runnable {

	@Override
	public void run() {
		System.out.println(" Running Thread Name  " + Thread.currentThread().getName());
		for (int i = 0; i < 5; i++) {
			System.out.println(" inside for loop of run method  " + i);
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnablethread());
		t1.setName("Impement 1 Runnable Thread ");
		t1.start();
		Thread t2 = new Thread(new Runnablethread());
		t1.setName("Impement 2 Runnable Thread ");
		t2.start();


		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println(" Thread T3 running  " + i);
					try {
						Thread.sleep(700);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}

		});
		t3.setName("Anonymus Inner Thread ");
		t3.start();

		Thread t4 = new Thread(){
			@Override
			public void run() {
			
				for (int i = 0; i < 5; i++) {
					System.out.println(" Thread T4 running  " + i);
					try {
						Thread.sleep(700);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		
		t4.start();
	}
}
