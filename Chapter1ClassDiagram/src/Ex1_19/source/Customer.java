package Ex1_19.source;


/**
 * @author Pham Thi Kim Hien
 * @version 1.0
 * @created 29-Aug-2016 8:22:24 AM
 */
public class Customer extends Information {

	private String customerID;
	public Order[] m_Order;

	public Customer(String customerID, Order[] m_Order) {
		super();
		this.customerID = customerID;
		this.m_Order = m_Order;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

}