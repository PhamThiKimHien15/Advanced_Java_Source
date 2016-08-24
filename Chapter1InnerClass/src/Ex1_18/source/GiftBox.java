package Ex1_18.source;
/*
 * Author: Pham Thi Kim Hien
 * Date: 24/08/2016
 * Version: 1.0
 *                                
 * Use to manage information of Gift
 */
public class GiftBox {

	public String shape;
	public String color;
	final int PRICE = 10000;
	public GiftBox(String shape, String color) {
		super();
		this.shape = shape;
		this.color = color;
	}
	
	public GiftBox() {
		super();
	}

	public class Gift{
		public String name;
		public double weight;
		final int FEE = 200;
		public Gift(String name, double weight) {
			super();
			this.name = name;
			this.weight = weight;
		}
		public Gift(double weight) {
			super();
			this.weight = weight;
		}

		/*
		 * function: use to calculate fee moves gift
		 * input is weight fields
		 * output is result of the calculation
		 */
		public double calFee() {
			return weight * FEE + GiftBox.this.PRICE;
		}
	}
	
}
