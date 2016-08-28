package Ex1_17;

import java.util.ArrayList;

/*
 * Author: Pham Thi Kim Hien
 * Date: 23/08/2016
 * Version: 1.0
 * create list to manage information of Fish
 */
public class ListFish {

	ArrayList<Fish> list;

	public ListFish() {
		this.list = new ArrayList<Fish>();
	}

	public void add(Fish fish) {
		list.add(fish);
	}

	// function: show information of Fish
	public void showInfo() {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).toString() + "\tStatus include: ");
			list.get(i).swim();
			System.out.print(", ");
			list.get(i).liveUnderWater();
			System.out.print(", ");
			list.get(i).grownNormal();
		}
	}
}
