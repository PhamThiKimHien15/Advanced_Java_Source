package Ex1_11.source;

/*
 * Author: Pham Thi Kim Hien
 * Date: 22/08/2016
 * Version: 1.0
 * 
 * Use to manage information of Gold Transaction
 */
public class GoldTransaction extends Transaction {

	private final double GOLD24K = 3514900;
	private final double GOLDSJC = 3590000;
	private String typeOfGold;

	public GoldTransaction(String id, String days, double number, String typeOfGold) {
		super(id, days, number);
		this.typeOfGold = typeOfGold;
	}
	
	public GoldTransaction(double number, String typeOfGold) {
		super(number);
		this.typeOfGold = typeOfGold;
	}

	public String getTypeOfGold() {
		return typeOfGold;
	}

	public void setTypeOfGold(String typeOfGold) {
		this.typeOfGold = typeOfGold;
	}

	public double getGOLD24K() {
		return GOLD24K;
	}

	public double getGOLDSJC() {
		return GOLDSJC;
	}
	/*
	 * function: calculate of the transaction
	 * input is fields include: number, typeOfGold
	 * output is result of the calculation
	 */
	public double calcTotalMoney() {
		if(this.typeOfGold.equalsIgnoreCase("24k"))
			return  getNumber() * GOLD24K;
		else
			return getNumber() * GOLDSJC;
	}
	@Override
	public String toString() {
		return "ID: " + getId() + "\tDate: " + getDays();
	}
}



















