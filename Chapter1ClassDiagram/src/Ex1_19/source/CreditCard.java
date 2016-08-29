package Ex1_19.source;

import java.util.Date;

/**
 * @author Pham Thi Kim Hien
 * @version 1.0
 * @created 29-Aug-2016 8:22:31 AM
 */
public class CreditCard extends Card implements IAuthMethod {

	private String expirationDate;
	private double maxDebt;
	private String type;

	public CreditCard() {

	}

	public CreditCard(String cardID, Date dateCreated, Order m_Order,
			String expirationDate, double maxDebt, String type) {
		super(cardID, dateCreated, m_Order);
		this.expirationDate = expirationDate;
		this.maxDebt = maxDebt;
		this.type = type;
	}
	
	public CreditCard(String cardID, String expirationDate, double maxDebt) {
		super(cardID);
		this.expirationDate = expirationDate;
		this.maxDebt = maxDebt;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public double getMaxDebt() {
		return maxDebt;
	}

	public void setMaxDebt(double maxDebt) {
		this.maxDebt = maxDebt;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAuthMethod() {
		return "has authenticated";
	}
	public void showInfo() {
		System.out.println(super.toString() + "\tExpiration date: " 
				+ getExpirationDate() + "\tMax debt: " + getMaxDebt() + "\t" + getAuthMethod());
	}
	
}