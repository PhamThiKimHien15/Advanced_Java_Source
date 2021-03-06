package Ex1_12.source;

/*
 * Author: Pham Thi Kim Hien
 * Date: 22/08/2016
 * Version: 1.0
 * 
 * Use to manage information of Text Book
 */

public class TextBook extends Book {

	private String status;

	public TextBook(String id, String name, String days, double price,
			int number, String pubHouse, String status) {
		super(id, name, days, price, number, pubHouse);
		this.status = status;
	}
	
	public TextBook(double price, int number, String status) {
		super(price, number);
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	/*
	 * function: calculate money 
	 * input is fields include: number, price, status
	 * output is result of the calculation
	 */
	public double calcMoney() {
		if (this.status.equalsIgnoreCase("new"))
			return getNumber() * getPrice();
		else
			return getNumber() * getPrice() * 0.5;
	}

	@Override
	public String toString() {
		return super.toString() + "\tStatus: " + getStatus();
	}
}
