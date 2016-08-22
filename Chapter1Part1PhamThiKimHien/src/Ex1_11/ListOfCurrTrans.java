package Ex1_11;

import java.util.ArrayList;

public class ListOfCurrTrans {
	ArrayList<CurrencyTransaction> list;

	public ListOfCurrTrans() {
		this.list = new ArrayList<CurrencyTransaction>();
	}

	public void addCurrTrans(CurrencyTransaction cur) {
		list.add(cur);
	}

	public double calcAverAmountBuy() {
		double averAmountBuy = 0;
		for (int i = 0; i < list.size(); i++) {
			averAmountBuy += list.get(i).calcBuy();
		}
		return averAmountBuy / list.size();
	}
	
	public double calcAverAmountSell() {
		double averAmountSell = 0;
		for (int i = 0; i < list.size(); i++) {
			averAmountSell += list.get(i).calcSell();
		}
		return averAmountSell / list.size();
	}

	public void showInfo() {
		double totalNumber = 0;
		for (int i = 0; i < list.size(); i++) {
			totalNumber += list.get(i).getNumber();
			System.out.println(list.get(i).toString());
		}
		System.out.println("\tTotal number: " + totalNumber + "\tAverage amount buy: " + calcAverAmountBuy() + "\tAverage amount sell: " + calcAverAmountSell());
	}
}
