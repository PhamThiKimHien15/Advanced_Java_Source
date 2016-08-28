package Ex1_11.source;

import java.util.ArrayList;
/*
 * Author: Pham Thi Kim Hien
 * Date: 22/08/2016
 * Version: 1.0
 * 
 * create list to manage information of Gold Transaction
 */
public class ListOfGoldTransaction {

	ArrayList<GoldTransaction> list;
	public ListOfGoldTransaction(){
		this.list = new ArrayList<GoldTransaction>();
	}
	
	public void addGoldTrans(GoldTransaction gol) {
		list.add(gol);
	}
	//function: calculate average the amount of the transaction
	public double calcAverAmount() {
		double averAmount = 0;
		for (int i = 0; i < list.size(); i++) {
			averAmount += list.get(i).calcTotalMoney();
		}
		return  averAmount/list.size();
	}
	// function: show information of Currency Transaction
	public void showInfo() {
		double totalNumber = 0;
		for (int i = 0; i < list.size(); i++) {
			totalNumber += list.get(i).getNumber();
			System.out.println(list.get(i).toString());
		}
		System.out.println("\tTotal number: " + totalNumber + "\tAverage amount: " + calcAverAmount());
	}
	
}
