package Ex1_15;

/*
 * Author: Pham Thi Kim Hien
 * Date: 23/08/2016
 * Version: 1.0
 * Use to manage information of Stringed Instrument
 */

public class StringedInstrument extends Instrument {

	private double number;

	public StringedInstrument(String name, String proUnit, double number) {
		super(name, proUnit);
		this.number = number;
	}

	public double getNumber() {
		return number;
	}

	public void setNumber(double number) {
		this.number = number;
	}

	@Override
	public void play() {
		System.out.println("\tPlay: " + getName() + " " + getNumber());
	}

}
