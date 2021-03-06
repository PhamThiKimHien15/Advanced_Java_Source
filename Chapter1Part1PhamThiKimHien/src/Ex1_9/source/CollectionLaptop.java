package Ex1_9.source;

import java.util.ArrayList;

/*
 * Author: Pham Thi Kim Hien
 * Date: 22/08/2016
 * Version: 1.0
 * 
 * create list to manage information of Laptop
 */
public class CollectionLaptop {

	ArrayList<Laptop> list;

	public CollectionLaptop() {
		this.list = new ArrayList<Laptop>();
	}

	public void addLap(Laptop lap) {
		list.add(lap);
	}

	// function: show information of Laptop
	public void showInfo() {
		double totalMoney = 0;
		for (int i = 0; i < list.size(); i++) {
			totalMoney += list.get(i).calcMoney();
			System.out.println(list.get(i).toString() + "\tWeight: "
					+ list.get(i).getWeight() + "\tTime PIN: "
					+ list.get(i).getTimePin() + "\tScreen size: "
					+ list.get(i).getScrSize());
		}
		System.out.println("Total Money: " + totalMoney);
	}
}
