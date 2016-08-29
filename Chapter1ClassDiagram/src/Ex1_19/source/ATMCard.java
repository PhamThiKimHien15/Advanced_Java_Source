package Ex1_19.source;

import java.util.Date;

/**
 * @author Pham Thi Kim Hien
 * @version 1.0
 * @created 29-Aug-2016 8:22:32 AM
 */
public class ATMCard extends Card implements IAuthMethod {

	private double balance;

	public ATMCard() {

	}

	public ATMCard(String cardID, Date dateCreated, Order m_Order,
			double balance) {
		super(cardID, dateCreated, m_Order);
		this.balance = balance;
	}
	
	public ATMCard(String cardID, double balance) {
		super(cardID);
		this.balance = balance;
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAuthMethod() {
		return "has authenticated";
	}
	public void showInfo() {
		System.out.println(super.toString() + "\tBalance: " + getBalance() + "\t" + getAuthMethod());
	}
	
}