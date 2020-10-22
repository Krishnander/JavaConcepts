package basics;

public class Threads {

	public static void main(String[] args) throws InterruptedException {

		Runnable r = () -> {
			/* throw new RuntimeException("Internal Exception") */;

			System.out.println("The lambda thread");
			System.out.println("We're now in thread " + Thread.currentThread().getName() + " whose priority is "
					+ Thread.currentThread().getPriority());

		};
		Thread t = new Thread(r);
		t.setName("Practice Thread");
		t.setPriority(Thread.MAX_PRIORITY);

		/*
		 * t.setUncaughtExceptionHandler((p,g)->{ System.out.println("The thread "+
		 * Thread.currentThread().getName()+" has an exception "+g.getMessage()); });
		 */

		System.out.println("We are in thread" + Thread.currentThread().getName() + " before new thread");
		t.start();
		System.out.println("We are in thread" + Thread.currentThread().getName() + " after new thread");

		new Thread(() -> System.out.println("Sample thread")).start();

		// t.start();
	}
}
