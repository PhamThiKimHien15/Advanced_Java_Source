package Ex5_4;

public class MainCounter {
	public static void main(String[] args) throws InterruptedException {
		//create and start numThreads
		int count = 0;
		Counter[] st = new Counter[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread " + i);
			st[i] = new Counter(count);			
			st[i].start();	
			st[i].join();
            count = st[i].getCount();			
		}		
		System.out.println("Count: " + count);
	}
	
}
