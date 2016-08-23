package Ex1_15;

/*
 * Author: Pham Thi Kim Hien
 * Date: 23/08/2016
 * Version: 1.0
 * Use to manage information of Non Stringed Instrument
 */
public class NonStringedInstrument extends Instrument {

	private String use;

	public NonStringedInstrument(String name, String proUnit, String use) {
		super(name, proUnit);
		this.use = use;
	}

	public String getUse() {
		return use;
	}

	public void setUse(String use) {
		this.use = use;
	}

	@Override
	public void play() {
		System.out.println("\tPlay: " + getUse());
	}

}
