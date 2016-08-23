package Ex1_8;
/*
 * Author: Pham Thi Kim Hien
 * Date: 08/22/2016
 * Version: 1.0
 * 
 * Use To manage information of Infantryman
 */
public class Infantryman extends Soldier {

	public Infantryman(String name, int power, String weapon) {
		super(name, power, weapon);
	}
	// Build fight() method
	public void fight() {
		if (getPower() - 2 > 0)
			setPower(getPower() - 2);
		else
			setPower(0);
	}

}