package Ex1_12.source;

import java.util.ArrayList;

/*
 * Author: Pham Thi Kim Hien
 * Date: 22/08/2016
 * Version: 1.0
 * 
 * create list to manage information of Text Book
 */
public class ListTextBook {
	ArrayList<TextBook> list;

	public ListTextBook() {
		this.list = new ArrayList<TextBook>();
	}

	public void addTextBook(TextBook tex) {
		list.add(tex);
	}

	// function: calculate total of money
	public double calcTotalMoney() {
		double totalMoney = 0;
		for (int i = 0; i < list.size(); i++) {
			totalMoney += list.get(i).calcMoney();
		}
		return totalMoney;
	}

	// function: show information of Text Book
	public void showInfo() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		System.out.println("\tTotal Money: " + calcTotalMoney());
	}
}
