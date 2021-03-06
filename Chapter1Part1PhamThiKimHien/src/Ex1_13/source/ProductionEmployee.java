package Ex1_13.source;

import phamThiKimHien.source.Employee;

/*
 * Author: Pham Thi Kim Hien
 * Date: 22/08/2016
 * Version: 1.0
 * 
 * Use to manage information of Production Employee
 */
public class ProductionEmployee extends Employee {
	private int number;
	private final double BONUSESRATE = 0.05;
	private final double PRONORMS = 1000;

	public ProductionEmployee(String name, double ceoSalary, int numOfPeople,
			double subsidize, int number) {
		super(name, ceoSalary, numOfPeople, subsidize);
		this.number = number;
	}
	
	public ProductionEmployee(int number) {
		super();
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	/*
	 *  function: calculate Bonuses
	 *  input is number field
	 *  output is result of the calculation 
	 */
	public double calcBonuses() {
		if (getNumber() - PRONORMS > 0)
			return (getNumber() - PRONORMS) * BONUSESRATE;
		else
			return 0;
	}
}
