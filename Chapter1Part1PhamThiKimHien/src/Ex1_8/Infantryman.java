package Ex1_8;
/*
 * Author: Pham Thi Kim Hien
 * Date: 08/22/2016
 * Version: 1.0
 * 
 * Extends Soldier and construction fight() method
 */
public class Infantryman extends Soldier {

	public Infantryman(String name, int power, String weapon) {
		super(name, power, weapon);
	}

	public void fight() {
		if (getPower() - 2 > 0)
			setPower(getPower() - 2);
		else
			setPower(0);
	}

}
