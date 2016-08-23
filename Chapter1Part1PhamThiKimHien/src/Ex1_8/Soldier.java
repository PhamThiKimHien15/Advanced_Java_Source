package Ex1_8;

/*
 * Author: Pham Thi Kim Hien
 * Date: 08/22/2016
 * Version: 1.0
 * 
 * Use To manage information of Trooper
 */
public class Soldier {
	private String name;
	private int power;
	private String weapon;

	public Soldier() {
		super();
	}

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
	// Build fight() method
	public void fight() {
		if (this.power >= 0)
			setPower(getPower() - 1);
		else
			setPower(-1);
	}

}