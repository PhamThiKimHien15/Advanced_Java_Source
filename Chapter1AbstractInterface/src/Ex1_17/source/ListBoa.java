package Ex1_17.source;

import java.util.ArrayList;

/*
 * Author: Pham Thi Kim Hien
 * Date: 23/08/2016
 * Version: 1.0
 * create list to manage information of Boa
 */
public class ListBoa {

	ArrayList<Boa> list;

	public ListBoa() {
		this.list = new ArrayList<Boa>();
	}

	public void add(Boa boa) {
		list.add(boa);
	}

	// function: show information of Boa
	public void showInfo() {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).toString() + "\tStatus include: ");
			list.get(i).swim();
			System.out.print(", ");
			list.get(i).molt();
			System.out.print(", ");
			list.get(i).toBurrow();
		}
	}
}
