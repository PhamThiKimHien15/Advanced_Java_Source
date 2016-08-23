package Ex1_15;

/*
 * Author: Pham Thi Kim Hien
 * Date: 23/08/2016
 * Version: 1.0
 * 
 * use to create play() method and general fields.
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

	public abstract void play();
}
