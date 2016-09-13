package Ex5_4;

public class Counter extends Thread {
	private int count;
	private Thread t;
	public Counter(int count) {
		super();
		this.count = count;
	}	
	@Override
	public void run() {
		try {
			for (int i = 0; i <= 10; i++) {
				this.count = i;
                System.out.println(this.count);
			}
			Thread.sleep(1000);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
}
