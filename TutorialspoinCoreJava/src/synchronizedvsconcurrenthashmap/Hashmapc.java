package synchronizedvsconcurrenthashmap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Hashmapc {

	public final static int THREAD_POOL_SIZE = 5;

	public static Map<String, Integer> normalht = null;
	public static Map<String, Integer> normalhm = null;
	public static Map<String, Integer> synchhm = null;
	public static Map<String, Integer> concurhm = null;

	public static void main(String[] args) throws InterruptedException {

		normalht = new Hashtable<String, Integer>();

		performTest(normalht);

	}

	public static void performTest(final Map<String, Integer> pt) throws InterruptedException {
		System.out.println("Test started for: " + pt.getClass());
		long averageTime = 0;

		for (int i = 0; i < 5; i++) {
			long startTime = System.nanoTime();
			System.out.println(" start time : " + startTime);

			ExecutorService ets = Executors.newFixedThreadPool(2);
			ets.execute(new Runnable() {

				@Override
				public void run() {
					Integer randomnumber = (int) Math.ceil(Math.random());
					System.out.println(" it is running ");
					// Retrieve value. We are not using it anywhere
					Integer crunchifyValue = pt.get(String
							.valueOf(randomnumber));

					// Put value
					pt.put(String.valueOf(randomnumber), randomnumber);

				}

			});

			// Make sure executor stops
			ets.shutdown();

			// Blocks until all tasks have completed execution after a shutdown
			// request
			ets.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);

			long entTime = System.nanoTime();
			long totalTime = (entTime - startTime) / 1000000L;
			averageTime += totalTime;
			System.out.println("2500K entried added/retrieved in " + totalTime
					+ " ms");
		}
		System.out.println("For " + pt.getClass() + " the average time is "
				+ averageTime / 5 + " ms\n");

	}

}
