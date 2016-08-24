package Ex1_16.source;

/*
 * Author: Pham Thi Kim Hien
 * Date: 23/08/2016
 * Version: 1.0
 * Use to manage information of Vehicle
 */
public abstract class Vehicle extends Move {

	private String id;
	private String owner;
	private String color;
	private String manufac;

	public Vehicle(double distance, double time, double liters, String id,
			String owner, String color, String manufac) {
		super(distance, time, liters);
		this.id = id;
		this.owner = owner;
		this.color = color;
		this.manufac = manufac;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getManufac() {
		return manufac;
	}

	public void setManufac(String manufac) {
		this.manufac = manufac;
	}

	@Override
	public String toString() {
		return "\tID: " + getId() + "\tOwner: " + getOwner() + "\tColor: "
				+ getColor() + "\tmanufacturer: " + getManufac();
	}
}
