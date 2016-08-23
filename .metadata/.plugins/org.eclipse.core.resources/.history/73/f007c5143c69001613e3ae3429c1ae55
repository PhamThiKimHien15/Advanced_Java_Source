package Ex1_9;

import java.util.ArrayList;

public class CollectionDesktop {
	ArrayList<Desktop> list;

	public CollectionDesktop() {
		this.list = new ArrayList<Desktop>();
	}
	
	public void addDesk(Desktop des) {
		list.add(des);
	}
	public void showInfo() {
		double totalMoney=0;
		for (int i = 0; i < list.size(); i++) {
			totalMoney += list.get(i).getNumber()*list.get(i).getPrice();
			System.out.println(list.get(i).toString() + "\tCPU: " + list.get(i).getcPU() + "\tRAM: " + list.get(i).getRam());
		}
		System.out.println("Total money: " + totalMoney);
	}
}
