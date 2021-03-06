package Ex1_11.source;

/*
 * Author: Pham Thi Kim Hien
 * Date: 22/08/2016
 * Version: 1.0
 * 
 * Use to manage information of Currency Transaction
 */
public class CurrencyTransaction extends Transaction {

	private String typeOfCurrency;
	private final double USDBUY = 22335;
	private final double EURBUY = 25050;
	private final double AUDBUY = 17226;
	private final double USDSELL = 22250;
	private final double EURSELL = 24457;
	private final double AUDSELL = 16530;

	public CurrencyTransaction(String id, String days, double number, String typeOfCurrency) {
		super(id, days, number);
		this.typeOfCurrency = typeOfCurrency;
	}
	
	public CurrencyTransaction(double number, String typeOfCurrency) {
		super(number);
		this.typeOfCurrency = typeOfCurrency;
	}

	public String getTypeOfCurrency() {
		return typeOfCurrency;
	}

	public void setTypeOfCurrency(String typeOfCurrency) {
		this.typeOfCurrency = typeOfCurrency;
	}
	
	/*
	 * function: calculate buy transaction
	 * input is fields include number, typeOfCurrency
	 * output is result of the calculation
	 */
	public double calcBuy() {
		if (this.typeOfCurrency.equalsIgnoreCase("USD"))
			return getNumber() * this.USDBUY;
		else if (this.typeOfCurrency.equalsIgnoreCase("EUR"))
			return getNumber() * this.EURBUY;
		else
			return getNumber() * this.AUDBUY;
	}
	/*
	 * function: calculate sell transaction
	 * input is fields include number, typeOfCurrency
	 * output is result of the calculation
	 */
	public double calcSell() {
		if (this.typeOfCurrency.equalsIgnoreCase("USD"))
			return getNumber() * this.USDSELL + getNumber() * this.USDSELL * 0.1;
		else if (this.typeOfCurrency.equalsIgnoreCase("EUR"))
			return getNumber() * this.EURSELL + getNumber() * this.EURSELL * 0.1;
		else
			return getNumber() * this.AUDSELL + getNumber() * this.AUDSELL * 0.1;
	}
	@Override
	public String toString() {
		return "ID: " + getId() + "\tDate: " + getDays();
	}
}
