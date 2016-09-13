package Ex5_1;
/*
 * Author: Pham Thi Kim Hien
 * Date: 13/09/2016
 * Version: 1.0
 */
public class MainThread {
	public static void main(String[] args) {
		ThreadDemo t1 = new ThreadDemo("Google");
		t1.start();
		
		ThreadDemo t2 = new ThreadDemo("Yahoo");
		t2.start();
		
		ThreadDemo t3 = new ThreadDemo("Facebook");
		t3.start();
	}
}
