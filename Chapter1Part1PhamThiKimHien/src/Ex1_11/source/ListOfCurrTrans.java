package Ex1_11.source;

import java.util.ArrayList;

/*
 * Author: Pham Thi Kim Hien
 * Date: 22/08/2016
 * Version: 1.0
 * 
 * create list to manage information of Currency Transaction
 */
public class ListOfCurrTrans {
	ArrayList<CurrencyTransaction> list;

	public ListOfCurrTrans() {
		this.list = new ArrayList<CurrencyTransaction>();
	}

	public void addCurrTrans(CurrencyTransaction cur) {
		list.add(cur);
	}

	// function: calculate average the amount of buy transaction
	public double calcAverAmountBuy() {
		double averAmountBuy = 0;
		for (int i = 0; i < list.size(); i++) {
			averAmountBuy += list.get(i).calcBuy();
		}
		return averAmountBuy / list.size();
	}

	// function: calculate average the amount of sell transaction
	public double calcAverAmountSell() {
		double averAmountSell = 0;
		for (int i = 0; i < list.size(); i++) {
			averAmountSell += list.get(i).calcSell();
		}
		return averAmountSell / list.size();
	}

	// function: show information of Currency Transaction
	public void showInfo() {
		double totalNumber = 0;
		for (int i = 0; i < list.size(); i++) {
			totalNumber += list.get(i).getNumber();
			System.out.println(list.get(i).toString());
		}
		System.out.println("\tTotal number: " + totalNumber
				+ "\tAverage amount buy: " + calcAverAmountBuy()
				+ "\tAverage amount sell: " + calcAverAmountSell());
	}
}
