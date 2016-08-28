package Ex1_8.source;

/*
 * Author: Pham Thi Kim Hien
 * Date: 08/22/2016
 * Version: 2.0
 * 
 * Use To manage information of Trooper
 */
public class Trooper extends Soldier {

	public Trooper(String name, int power, String weapon) {
		super(name, power, weapon);
	}

	/*
	 * @see Ex1_8.source.Soldier#fight() 
	 * function: Build fight() method 
	 * input is power fields of Soldier class 
	 * no output
	 */
	public void fight() {
		if (getPower() - 3 > 0)
			setPower(getPower() - 3);
		else
			setPower(0);
	}
}
