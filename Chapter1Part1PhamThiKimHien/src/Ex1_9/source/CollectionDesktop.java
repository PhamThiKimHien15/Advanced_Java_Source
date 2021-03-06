package Ex1_9.source;

import java.util.ArrayList;

/*
 * Author: Pham Thi Kim Hien
 * Date: 22/08/2016
 * Version: 1.0
 * 
 * create list to manage information of Desktop
 */
public class CollectionDesktop {
	ArrayList<Desktop> list;

	public CollectionDesktop() {
		this.list = new ArrayList<Desktop>();
	}

	public void addDesk(Desktop des) {
		list.add(des);
	}

	// function: show information of Desktop
	public void showInfo() {
		double totalMoney = 0;
		for (int i = 0; i < list.size(); i++) {
			totalMoney += list.get(i).calcMoney();
			System.out.println(list.get(i).toString() + "\tCPU: "
					+ list.get(i).getcPU() + "\tRAM: " + list.get(i).getRam());
		}
		System.out.println("Total money: " + totalMoney);
	}
}
