package multithreading.joiningthread;

public class TestJoinMethod2 extends Thread {

	public void run(){
		System.out.println(" Run method executed means Thread in execution state ");
		
		for(int i=0; i < 5 ;i++){
			System.out.println(" Processing " + " : " + Thread.currentThread().getName() + " : "+ i + " times");
			try {
				Thread.sleep(1600);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Thread running at just after main method : " + Thread.currentThread().getName());
		TestJoinMethod2 t1 = new TestJoinMethod2();
		System.out.println(" Thread Name : " + t1.getName());
		System.out.println(" t1.getId() \\ " + t1.getId());
		System.out.println(" t1.getPriority() \\ " + t1.getPriority());
		System.out.println(" t1.activeCount() \\ " + t1.activeCount());
		System.out.println(" t1.getContextClassLoader() \\ " + t1.getContextClassLoader());
		System.out.println(" t1.holdsLock(t1) \\ " + t1.holdsLock(t1));
		System.out.println("Thread running before starting the t1 : " + Thread.currentThread().getName());
		t1.setName("Threadt1");
		t1.start();
		//t1.join();
		
		System.out.println("Thread running  after starting the t1 : " + Thread.currentThread().getName());
		TestJoinMethod2 t2 = new TestJoinMethod2();
		t2.setName("Threadt2");
		t2.start();
		
	t2.join();
		TestJoinMethod2 t3 = new TestJoinMethod2();
		t3.setName("Threadt3");
		t3.start();
		t3.setName("Threadt3");
		
	}
	

}
