package Ex1_16;

import java.util.ArrayList;

/*
 * Author: Pham Thi Kim Hien
 * Date: 23/08/2016
 * Version: 1.0
 * create list to manage information of Ship
 */
public class ListShip {

	ArrayList<IFuelConsumption> list;

	public ListShip() {
		this.list = new ArrayList<IFuelConsumption>();
	}

	public void add(IFuelConsumption fuel) {
		list.add(fuel);
	}

	// function: show information of Ship
	public void showInfo() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}
}
