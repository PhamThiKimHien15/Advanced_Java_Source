package Ex1_9.source;

/*
 * Author: Pham Thi Kim Hien
 * Date: 22/08/2016
 * Version: 1.0
 * 
 * Use to manage information of Computer
 */
public class Computer {

	protected String id;
	protected double price;
	protected String manufac;
	protected int number;

	public Computer() {
		super();
	}

	public Computer(String id, double price, String manufac, int number) {
		super();
		this.id = id;
		this.price = price;
		this.manufac = manufac;
		this.number = number;
	}

	public Computer(double price, int number) {
		super();
		this.price = price;
		this.number = number;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getManufac() {
		return manufac;
	}

	public void setManufac(String manufac) {
		this.manufac = manufac;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	/*
	 * Function: calculate money 
	 * input is fields include number, price; 
	 * output is result of calculation
	 */
	public double calcMoney() {
		return this.number * this.price;
	}

	@Override
	public String toString() {
		return "Id: " + this.id + "\tPrice: " + this.price + "\tNumber: "
				+ this.number + "\tManufacturer: " + this.manufac;
	}
}
