package Ex1_19.source;
/**
 * @author Pham Thi Kim Hien
 * @version 1.0
 * @created 29-Aug-2016 8:22:27 AM
 */
public enum Item {
	SUGAR(10000), MILK(5000), RICE(60000), CANDY(12000),
	CAKE(20000), BREAK(8000), APPLE(68000), WINE(60000), WATER(60000);
	
	private double price;

	public double getPrice() {
		return price;
	}

	private Item (double price){
		this.price = price;
	}
	
	
}
