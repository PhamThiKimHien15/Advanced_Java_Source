package Ex1_33;

public class MainProxy {
	public static void main(String[] args) {
		Image image = new ProxyImage("hinh-nen-de-thuong-cho-may-tinh-7.jpg");
		
		// image will be loaded form disk
		image.display();
		System.out.println("");
		
		//image will not be loaded form disk
		image.display();
	}
}
