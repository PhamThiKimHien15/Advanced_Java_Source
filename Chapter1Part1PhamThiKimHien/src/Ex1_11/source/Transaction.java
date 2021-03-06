package Ex1_11.source;
/*
 * Author: Pham Thi Kim Hien
 * Date: 22/08/2016
 * Version: 1.0
 * 
 * Use to manage information of Transaction
 */
public class Transaction {

	private String id;
	private String days;
	private double number;
	public Transaction(String id, String days, double number) {
		super();
		this.id = id;
		this.days = days;
		this.number = number;
	}
	
	public Transaction(double number) {
		super();
		this.number = number;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDays() {
		return days;
	}
	public void setDays(String days) {
		this.days = days;
	}
	public double getNumber() {
		return number;
	}
	public void setNumber(double number) {
		this.number = number;
	}
	
}
