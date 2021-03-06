package Ex1_12.source;

/*
 * Author: Pham Thi Kim Hien
 * Date: 22/08/2016
 * Version: 1.0
 * 
 * Use to manage information of Reference Book
 */

public class ReferenceBook extends Book {

	private int tax;

	public ReferenceBook(String id, String name, String days, double price,
			int number, String pubHouse, int tax) {
		super(id, name, days, price, number, pubHouse);
		this.tax = tax;
	}
	
	public ReferenceBook(double price, int number, int tax) {
		super(price, number);
		this.tax = tax;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	/*
	 * function: calculate money 
	 * input is fields include: number, price, tax
	 * output is result of the calculation
	 */
	public double calcMoney() {
		return (getNumber() * getPrice()) + (getNumber() * getPrice() * getTax() / 100);
	}

	@Override
	public String toString() {
		return super.toString() + "\tTax: " + getTax();
	}
}
