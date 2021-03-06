package phamThiKimHien.source;

import java.util.ArrayList;
/*
 * Author: Pham Thi Kim Hien
 * Date : 8/19/2016
 * Vesion: 1.0
 * 
 * Include functions: addCD() method, calcTotalMoneyOfAllCDs() method, and outList() method
 */
public class CollectionCDs {
	private ArrayList<CD> list;

	public CollectionCDs() {
		super();
		this.list = new ArrayList<CD>();
	}
	// function: add CD object into ArrayList
	// input is object depend on CD class
	// output is add CD object into ArrayList
	public void addCD(CD cd) {
		list.add(cd);
	}
	// function: calculate the total money of all the CD
	// input is price field of all CDs
	// output is the total money of all the CD
	public double calcTotalMoneyOfAllCDs() {
		double totalMoney = 0;
		for (int i = 0; i < list.size(); i++) {
			totalMoney += list.get(i).price;
		}
		return totalMoney;
	}
	// function: output the CD arrayList
	public void outList() {
		for(int i=0; i< list.size(); i++){
			System.out.println("CD code: " +list.get(i).id + "\tName of CD: " + list.get(i).name + "\tName of singer: " + list.get(i).singer + "\tNumber of Songs: " + list.get(i).numOfSongs + "\tPrice: " + list.get(i).price);
		}
		System.out.print("\tTotal Money: " + calcTotalMoneyOfAllCDs());
		
	}
	
}
