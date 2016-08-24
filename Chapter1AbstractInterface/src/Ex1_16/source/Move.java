package Ex1_16.source;

/*
 * Author: Pham Thi Kim Hien
 * Date: 23/08/2016
 * Version: 1.0
 * Use to manage information of Move
 */
public class Move {
	protected double distance;
	protected double time;
	protected double liters;

	public Move(double distance, double time, double liters) {
		super();
		this.distance = distance;
		this.time = time;
		this.liters = liters;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}

	public double getLiters() {
		return liters;
	}

	public void setLiters(double liters) {
		this.liters = liters;
	}

}
