package Ex1_8.source;

/*
 * Author: Pham Thi Kim Hien
 * Date: 08/22/2016
 * Version: 2.0
 * 
 * Use To manage information of Trooper
 */
public class Soldier {
	private String name;
	private int power;
	private String weapon;

	public Soldier(String name, int power, String weapon) {
		super();
		this.name = name;
		this.power = power;
		this.weapon = weapon;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	/*
	 * function: Build fight() method 
	 * input is power fields of Soldier class 
	 * no output
	 */
	public void fight() {
		if (this.power >= 0)
			setPower(getPower() - 1);
		else
			setPower(-1);
	}

}
