package Ex1_12.source;

import java.util.ArrayList;

/*
 * Author: Pham Thi Kim Hien
 * Date: 22/08/2016
 * Version: 1.0
 * 
 * create list to manage information of Reference Book
 */
public class ListReferenceBook {
	ArrayList<ReferenceBook> list;

	public ListReferenceBook() {
		this.list = new ArrayList<ReferenceBook>();
	}

	public void addRefBook(ReferenceBook ref) {
		list.add(ref);
	}

	// function: calculate total of money
	public double calcTotalMoney() {
		double totalMoney = 0;
		for (int i = 0; i < list.size(); i++) {
			totalMoney += list.get(i).calcMoney();
		}
		return totalMoney;
	}

	// function: calculate average of money
	public double calcAverage() {
		return calcTotalMoney() / list.size();
	}

	// function: show information of reference Book
	public void showInfo() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		System.out.println("\tTotal Money: " + calcTotalMoney() + "\tAverage: "
				+ calcAverage());
	}
}
