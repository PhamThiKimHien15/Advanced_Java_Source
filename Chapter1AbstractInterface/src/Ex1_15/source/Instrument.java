package Ex1_15.source;

/*
 * Author: Pham Thi Kim Hien
 * Date: 23/08/2016
 * Version: 1.0
 * 
 * use to manage information of Instrument
 */
public abstract class Instrument {

	private String name;
	private String proUnit;

	public Instrument(String name, String proUnit) {
		super();
		this.name = name;
		this.proUnit = proUnit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProUnit() {
		return proUnit;
	}

	public void setProUnit(String proUnit) {
		this.proUnit = proUnit;
	}
	// function: use to create instructions on how to play musical instruments
	public abstract void play();
}
