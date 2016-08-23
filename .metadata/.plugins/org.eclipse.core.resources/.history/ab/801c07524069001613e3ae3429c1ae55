package Ex1_11;

import java.util.ArrayList;

public class ListOfGoldTransaction {

	ArrayList<GoldTransactions> list;
	public ListOfGoldTransaction(){
		this.list = new ArrayList<GoldTransactions>();
	}
	
	public void addGoldTrans(GoldTransactions gol) {
		list.add(gol);
	}
	public double calcAverAmount() {
		double averAmount = 0;
		for (int i = 0; i < list.size(); i++) {
			averAmount += list.get(i).calcTotalMoney();
		}
		return  averAmount/list.size();
	}
	public void showInfo() {
		double totalNumber = 0;
		for (int i = 0; i < list.size(); i++) {
			totalNumber += list.get(i).getNumber();
			System.out.println(list.get(i).toString());
		}
		System.out.println("\tTotal number: " + totalNumber + "\tAverage amount: " + calcAverAmount());
	}
	
}
