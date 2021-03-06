package Ex9_2;
/*
 * Author: Pham Thi Kim Hien
 * Date: 14/09/2016
 * Version: 1.0
 */
public class CD implements Comparable<CD> {
	 private String id;
	 private String name;
	 private String singer;
	 private int numOfSongs;
	 private double price;
	public CD(String id, String name, String singer, int numOfSongs,
			double price) {
		super();
		this.id = id;
		this.name = name;
		this.singer = singer;
		this.numOfSongs = numOfSongs;
		this.price = price;
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
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public int getNumOfSongs() {
		return numOfSongs;
	}
	public void setNumOfSongs(int numOfSongs) {
		this.numOfSongs = numOfSongs;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	// use to sort by name
	public int compareTo(CD cd) {
		return this.name.compareToIgnoreCase(cd.name);
	}
	public void showInfo(){
		 System.out.println("\tID: " + this.id + "\tName: " + this.name
				 + "\tSinger: " + this.singer + "\tNumber of songs: " + this.numOfSongs
				 + "\tPrice: " + this.price);		 
	 }
	
}
