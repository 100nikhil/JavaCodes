package threadsinjava;
import java.util.concurrent.TimeUnit;
/*
 * Volatile variable guarantees memory visibility.
 * It is useful only when one thread writes and another thread reads.
 * As in Ex: one thread write "stop" and another reads "stop"
 * 
 * whenever first thread writes the "stop" value. Another thread will get latest updated value.
 * 
 * Synchronized ensure both memory visibility and atomicity.
 *
*/


public class VolatileVariableExample {

	private static volatile boolean stop;

	public static void main(String[] args) throws InterruptedException {
		new Thread(new Runnable() {
			public void run() {
				while (!stop) {
					System.out.println("In while ...");
				}
				System.out.println("Out of while ........ ");
			}
		}).start();

		TimeUnit.SECONDS.sleep(1);
		stop = true;
	}
}
