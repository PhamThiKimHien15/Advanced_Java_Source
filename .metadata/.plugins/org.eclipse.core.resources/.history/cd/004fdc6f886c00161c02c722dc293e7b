package Ex1_17;

import java.util.ArrayList;

/*
 * Author: Pham Thi Kim Hien
 * Date: 23/08/2016
 * Version: 1.0
 * create list to manage information of Bird
 */
public class ListBird {

	ArrayList<Bird> list;

	public ListBird() {
		this.list = new ArrayList<Bird>();
	}

	public void add(Bird bird) {
		list.add(bird);
	}

	// function: show information of Bird
	public void showInfo() {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).toString() + "\tStatus include: ");
			list.get(i).fly();
			System.out.print(", ");
			list.get(i).grownNormal();
			System.out.print(", ");
			list.get(i).nest();
		}
	}
}
