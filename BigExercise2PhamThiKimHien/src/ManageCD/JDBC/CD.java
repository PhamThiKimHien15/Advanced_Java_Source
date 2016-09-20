package ManageCD.JDBC;

import java.io.Serializable;

/*
 * 	Author: Pham Thi Kim Hien
 *	Date: 19/09/2016
 *	Version: 1.0
 *  Description: use to manage information of CD
 */
public class CD implements Serializable{
	protected int id;
	protected String name;
	protected String singer;
	protected int numbersongs;
	protected double price;

	public CD(int id, String name, String singer, int numbersongs, double price) {
		super();
		this.id = id;
		this.name = name;
		this.singer = singer;
		this.numbersongs = numbersongs;
		this.price = price;
	}
	
	public CD(String name, String singer, int numbersongs, double price) {
		super();
		this.name = name;
		this.singer = singer;
		this.numbersongs = numbersongs;
		this.price = price;
	}
	
	public CD(int id, int numbersongs, double price) {
		super();
		this.id = id;
		this.numbersongs = numbersongs;
		this.price = price;
	}
	
	public CD() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public int getNumbersongs() {
		return numbersongs;
	}

	public void setNumbersongs(int numbersongs) {
		this.numbersongs = numbersongs;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	/*
	 * used to compare objects, and it is used for UnitTest package
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		CD cd = (CD) obj;
		if(this.id == cd.getId() && this.name.equalsIgnoreCase(cd.getName())
				&& this.singer.equalsIgnoreCase(cd.getSinger()) && this.numbersongs == cd.getNumbersongs()
				&& this.price == cd.getPrice())
			return true;
		return false;
	}
	
	@Override
	public String toString() {
		return "\t" + this.id + ". " + this.name + "\tSinger: " + this.singer
				+ "\tNumber Songs: " + this.numbersongs + "\tPrice: " + this.price;
	}
}
