package Ex5_1;
/*
 * Author: Pham Thi Kim Hien
 * Date: 13/09/2016
 * Version: 1.0
 */
public class ThreadDemo extends Thread {
	private Thread t;
	private String threadName;
	
	public ThreadDemo(String threadName) {
		super();
		this.threadName = threadName;
		System.out.println("Creating: " + this.threadName);
	}
	@Override
	public void run() {
		System.out.println("===============================");
		System.out.println("Running: " + threadName);
		try {
			for (int i =3; i > 0; i--) {
				System.out.println("Thread: " + threadName + ", " + i);
				
				// let the thread sleep for a while
				Thread.sleep(5000);
			}
		} catch (InterruptedException e) {
			System.err.println("Thread " + threadName + "interrupted.");
		}
		System.out.println("Thread: " + threadName + " exiting.");		
	}
	
	@Override
	public void start() {
		System.out.println("Starting: " + threadName);
		if(t == null){
			t = new Thread(this, threadName);
			t.start();
		}
	}
}
















