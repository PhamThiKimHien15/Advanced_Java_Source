package Ex1_17.source;

import java.util.ArrayList;

/*
 * Author: Pham Thi Kim Hien
 * Date: 23/08/2016
 * Version: 1.0
 * create list to manage information of Tiger
 */
public class ListTiger {

	ArrayList<Tiger> list;

	public ListTiger() {
		this.list = new ArrayList<Tiger>();
	}

	public void add(Tiger tiger) {
		list.add(tiger);
	}

	// function: show information of Tiger
	public void showInfo() {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).toString() + "\tStatus include: ");
			list.get(i).swim();
			System.out.print(", ");
			list.get(i).run();
			System.out.print(", ");
			list.get(i).grownNormal();
			System.out.print(", ");
			list.get(i).toBurrow();
		}
	}
}
