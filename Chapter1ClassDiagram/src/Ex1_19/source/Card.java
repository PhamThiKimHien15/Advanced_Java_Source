package Ex1_19.source;

import java.util.Date;

/**
 * @author Pham Thi Kim Hien
 * @version 1.0
 * @created 29-Aug-2016 8:22:33 AM
 */
public class Card extends Information {

	protected String cardID;
	protected Date dateCreated;
	public Order m_Order;

	public Card(String cardID, Date dateCreated, Order m_Order) {
		super();
		this.cardID = cardID;
		this.dateCreated = dateCreated;
		this.m_Order = m_Order;
	}
	
	public Card(String cardID) {
		super();
		this.cardID = cardID;
	}

	public Card() {
		super();
	}

	public String getCardID() {
		return cardID;
	}

	public void setCardID(String cardID) {
		this.cardID = cardID;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	public Order getM_Order() {
		return m_Order;
	}

	public void setM_Order(Order m_Order) {
		this.m_Order = m_Order;
	}

	@Override
	public String toString() {
		return "\tCard ID: " + getCardID();
	}
}