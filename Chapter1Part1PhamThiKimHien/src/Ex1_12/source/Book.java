package Ex1_12.source;

import java.text.SimpleDateFormat;
/*
 * Author: Pham Thi Kim Hien
 * Date: 22/08/2016
 * Version: 1.0
 * 
 * Use to manage information of Book
 */

public class Book {

	private String id;
	private String name;
	private String days;
	private double price;
	private int number;
	private String pubHouse;

	public Book(String id, String name, String days,
			double price, int number, String pubHouse) {
		super();
		this.id = id;
		this.name = name;
		this.days = days;
		this.price = price;
		this.number = number;
		this.pubHouse = pubHouse;
	}
	
	public Book(double price, int number) {
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDays() {
		return days;
	}

	public void setDays(String days) {
		this.days = days;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getPubHouse() {
		return pubHouse;
	}

	public void setPubHouse(String pubHouse) {
		this.pubHouse = pubHouse;
	}
	@Override
	public String toString() {
		return "\tID " + id + "\tName " + name + "\tDate: " + getDays() + "\tPrice: " + price + "\tNumber: " + number + "\tPublishing House: " + pubHouse;
	
	}
}
