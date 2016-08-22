package Ex1_11;

public class GoldTransactions extends Transaction {

	private final double GOLD24K = 3514900;
	private final double GOLDSJC = 3590000;
	private String typeOfGold;

	public GoldTransactions(String id, String days, int number, String typeOfGold) {
		super(id, days, number);
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



















