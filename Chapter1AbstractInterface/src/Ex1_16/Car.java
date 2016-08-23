package Ex1_16;
/*
 * Author: Pham Thi Kim Hien
 * Date: 22/08/2016
 * Version: 1.0
 * Use to manage information of car
 */
public class Car extends Vehicle implements ISpeed, IFuelConsumption{

	private String gearbox;
	private String carType;
	
	public Car(double distance, double time, double liters, String id, String owner, String color, String manufac,
			String gearbox, String carType) {
		super(distance, time, liters, id, owner, color, manufac);
		this.gearbox = gearbox;
		this.carType = carType;
	}
	public String getGearbox() {
		return gearbox;
	}
	public void setGearbox(String gearbox) {
		this.gearbox = gearbox;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	@Override
	public double calcFuelCons() {
		return getDistance()/getLiters();
	}
	@Override
	public double calcSpeed() {
		return getDistance()/getTime();
	}
	@Override
	public String toString() {
		return super.toString() + "\tSpeed: " + String.format("%.2f", calcSpeed()) + 
				"\tFuel Consumption: " + String.format("%.2f", calcFuelCons());
	}
	
}
