package corejava.javasynchronization;

// have a look in http://www.journaldev.com/1037/java-thread-wait-notify-and-notifyall-example
// check this also : http://stackoverflow.com/questions/442564/avoid-synchronizedthis-in-java

public class Message {

	public static void main(String[] args) {
		System.out.println(" " + Thread.currentThread().getName());

		Object a = new Object();

		System.out.println(" " + Thread.currentThread().getName());

	}
}
