package Ex1_9;

public class Laptop extends Computer {

	private int weight;
	private int timePin;
	private String scrSize;
	public Laptop(String id, double price, String manufac, int number, int weight, int timePin, String scrSize) {
		super(id, price, manufac, number);
		this.weight = weight;
		this.timePin = timePin;
		this.scrSize = scrSize;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getTimePin() {
		return timePin;
	}
	public void setTimePin(int timePin) {
		this.timePin = timePin;
	}
	public String getScrSize() {
		return scrSize;
	}
	public void setScrSize(String scrSize) {
		this.scrSize = scrSize;
	}
	
}
