package multithreading.threadpool;

import java.io.IOException;

public class ThreadGroupDemo implements Runnable {

	@Override
	public void run() {
		
		System.out.println("// " + Thread.currentThread().getName() + " is Running ");
	}

	
	public static void main(String[] args) throws Exception {

		ThreadGroup tg1 = new ThreadGroup(" Parent Thread Group ");
		
		Thread t1 = new Thread(tg1, new ThreadGroupDemo() ," Thread 1" );
		t1.start();
		Thread t2 = new Thread(tg1, new ThreadGroupDemo() ," Thread 2" );
		t2.start();
		Thread t3 = new Thread(tg1, new ThreadGroupDemo() ," Thread 3" );
		t3.start();
		
		System.out.println(" Thread Group Name : " + tg1.getName());
	  
		  tg1.list();
		  
		  Runtime r = Runtime.getRuntime();
		  System.out.println(Runtime.getRuntime().availableProcessors());  
		  
		  //Runtime.getRuntime().exec("notepad");//will open a new notepad  
		  
		  System.out.println("Total Memory: "+r.totalMemory());  
		  System.out.println("Free Memory: "+r.freeMemory());  
		    
		  for(int i=0;i<10000;i++){  
		   new ThreadGroupDemo();  
		  }  
		  System.out.println("After creating 10000 instance, Free Memory: "+r.freeMemory());  
		  System.gc();  
		  System.out.println("After gc(), Free Memory: "+r.freeMemory());
		  
		  
		
	}

	
}
