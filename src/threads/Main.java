package threads;
import java.util.concurrent.Semaphore;

public class Main {
	public static void main(String[] args) {
		Semaphore sem = new Semaphore(1);
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				try {
					sem.acquire();
					try {
						while(true) {
							System.out.println("Foo");
							Thread.sleep(1000);
						}
					}
					catch(InterruptedException e) {
						System.out.println("Thread 1 stopped");
					}
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
				finally {
					sem.release();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				try {
					while(true) {
						System.out.println("Bar");
						Thread.sleep(5000);
					}
				}
				catch(InterruptedException e) {
					System.out.println("Thread 2 stopped");
				}
			}
		});
		
		t1.start();
		t2.start();
	}
}




