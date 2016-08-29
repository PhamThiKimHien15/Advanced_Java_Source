package Ex1_19.source;


/**
 * @author Pham Thi Kim Hien
 * @version 1.0
 * @created 29-Aug-2016 8:22:35 AM
 */
public class OrderDetail {

	private int quantity;
	public Product m_Product;

	public OrderDetail() {

	}

	public OrderDetail(int quantity, Product m_Product) {
		super();
		this.quantity = quantity;
		this.m_Product = m_Product;
	}
	
	public Product getM_Product() {
		return m_Product;
	}

	public void setM_Product(Product m_Product) {
		this.m_Product = m_Product;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double calLineTotal() {
		return this.quantity * m_Product.getPrice();
	}
	@Override
	public String toString() {
		return "\tName: " + m_Product.getName() + "\tPrice: " + m_Product.getPrice()
				+ "\tQuantity: " + getQuantity();
	}
}