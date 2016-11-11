package threadsexample;

public class Extendthread extends Thread {

	@Override
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			System.out.println(" Thread is running "
					+ Thread.currentThread().getName());
			System.out.println(" Integer value: " + i);
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

	public static void main(String[] args) {
		System.out.println(" Thread in main class : "
				+ Thread.currentThread().getClass());
		Extendthread eth = new Extendthread();
		eth.setName(" Mohan");
		eth.start();
		Extendthread eth1 = new Extendthread();
		eth1.setName(" Sohan");
		eth1.start();
		
		
	}

}
