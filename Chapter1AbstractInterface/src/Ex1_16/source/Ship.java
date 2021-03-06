package Ex1_16.source;

/*
 * Author: Pham Thi Kim Hien
 * Date: 23/08/2016
 * Version: 1.0
 * Use to manage information of Ship
 */
public class Ship extends Vehicle implements ISpeed, IFuelConsumption {

	private double weight;
	private double capacity;
	private double downSpeed;
	private double upSpeed;
	private double startupFuelCons;
	private String fuelType;

	public Ship(double distance, double time, double liters, String id,
			String owner, String color, String manufac, double weight,
			double capacity, double downSpeed, double upSpeed,
			double startupFuelCons, String fuelType) {
		super(distance, time, liters, id, owner, color, manufac);
		this.weight = weight;
		this.capacity = capacity;
		this.downSpeed = downSpeed;
		this.upSpeed = upSpeed;
		this.startupFuelCons = startupFuelCons;
		this.fuelType = fuelType;
	}

	public Ship(double distance, double time, double liters,
			double startupFuelCons) {
		super(distance, time, liters);
		this.startupFuelCons = startupFuelCons;
	}

	public Ship(double distance, double time, double liters, double downSpeed,
			double upSpeed) {
		super(distance, time, liters);
		this.downSpeed = downSpeed;
		this.upSpeed = upSpeed;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public double getDownSpeed() {
		return downSpeed;
	}

	public void setDownSpeed(double downSpeed) {
		this.downSpeed = downSpeed;
	}

	public double getUpSpeed() {
		return upSpeed;
	}

	public void setUpSpeed(double upSpeed) {
		this.upSpeed = upSpeed;
	}

	public double getStartupFuelCons() {
		return startupFuelCons;
	}

	public void setStartupFuelCons(double startupFuelCons) {
		this.startupFuelCons = startupFuelCons;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	/*
	 * @see Ex1_16.source.IFuelConsumption#calcFuelCons() 
	 * function: use to calculate the fuel consumption 
	 * input is fields include distance, liters of Vehicle class and startupFuelCons of this class 
	 * output is result of the calculation
	 */
	@Override
	public double calcFuelCons() {
		return getDistance() / (getLiters() - startupFuelCons);
	}

	/*
	 * @see Ex1_16.source.ISpeed#calcSpeed() 
	 * function: use to calculate the Speed 
	 * input is fields include distance, time of Vehicle class and downSpeed, upSpeed of this class 
	 * output is result of the calculation
	 */
	@Override
	public double calcSpeed() {
		return getDistance() / getTime() + getDownSpeed() - getUpSpeed();
	}

	@Override
	public String toString() {
		return super.toString() + "\tSpeed: "
				+ String.format("%.2f", calcSpeed()) + "\tFuel Consumption: "
				+ String.format("%.2f", calcFuelCons());
	}

}
