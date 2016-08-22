package Ex1_9;

import java.util.ArrayList;

public class CollectionLaptop {

	ArrayList<Laptop> list;

	public CollectionLaptop() {
		this.list = new ArrayList<Laptop>();
	}
	
	public void addLap(Laptop lap) {
		list.add(lap);
	}
	public void showInfo() {
		double totalMoney = 0;
		for (int i = 0; i < list.size(); i++) {
			totalMoney += list.get(i).getNumber()*list.get(i).getPrice();
			System.out.println(list.get(i).toString() + "\tWeight: " + list.get(i).getWeight() + "\tTime PIN: " + list.get(i).getTimePin() + "\tScreen size: " + list.get(i).getScrSize());
		}
		System.out.println("Total Money: " + totalMoney);
	}
}
