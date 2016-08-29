package Ex1_19.source;

import java.util.Date;

/**
 * @author Pham Thi Kim Hien
 * @version 1.0
 * @created 29-Aug-2016 8:22:27 AM
 */
public class Order {

	private Date orderDate;
	private boolean printOrder;
	private String status;
	public OrderDetail[] m_OrderDetail;

	public Order() {

	}

	public Order(Date orderDate, boolean printOrder, String status,
			OrderDetail[] m_OrderDetail) {
		super();
		this.orderDate = orderDate;
		this.printOrder = printOrder;
		this.status = status;
		this.m_OrderDetail = m_OrderDetail;
	}
	
	public Order(OrderDetail[] m_OrderDetail) {
		super();
		this.m_OrderDetail = m_OrderDetail;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public boolean isPrintOrder() {
		return printOrder;
	}

	public void setPrintOrder(boolean printOrder) {
		this.printOrder = printOrder;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double calSubTotal() {
		double result = 0;
		for (int i = 0; i < m_OrderDetail.length; i++) {
			result += m_OrderDetail[i].calLineTotal();
		}
		return result;
	}
	
	public double calTax() {
		if(this.printOrder == true)
			return 0.1 * calSubTotal();
		else 
			return 0;
	}

	public double calTotalAmount() {
		return calSubTotal() + calTax();
	}
	public void showInfo() {
		System.out.println("\t----SHOW INFORMATION----");
		for (int i = 0; i < m_OrderDetail.length; i++) {
			System.out.println(m_OrderDetail[i].toString());
		}
		System.out.println("\n\tTax: " + calTax() + "\tTotal Amount: " + calTotalAmount());
	}
}