package Ex1_33;

public class RealImage implements Image{
	private String fileName;
	public RealImage(String fileName) {
		this.fileName = fileName;
		loadFromDisk(fileName);
	}
	@Override
	public void display() {
		System.out.println("Display " + fileName);
	}
	public void loadFromDisk(String fileName) {
		System.out.println("Loading " + fileName);
	}
}
