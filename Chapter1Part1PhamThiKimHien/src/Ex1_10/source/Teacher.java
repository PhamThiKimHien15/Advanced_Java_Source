package Ex1_10.source;

/*
 * Author: Pham Thi Kim Hien
 * Date: 22/08/2016
 * Version: 1.0
 * 
 * Use to manage information of Teacher
 */
public class Teacher extends Human {

	private String homeroomClass;
	private float ceoSalary;
	private double allowance;
	private final double BASICSALARY = 1260000;

	public Teacher(String name, String days, String address, String phone,
			String homeroomClass, float ceoSalary, double allowance) {
		super(name, days, address, phone);
		this.homeroomClass = homeroomClass;
		this.ceoSalary = ceoSalary;
		this.allowance = allowance;
	}

	public Teacher(float ceoSalary, double allowance) {
		super();
		this.ceoSalary = ceoSalary;
		this.allowance = allowance;
	}

	public String getHomeroomClass() {
		return homeroomClass;
	}

	public void setHomeroomClass(String homeroomClass) {
		this.homeroomClass = homeroomClass;
	}

	public float getCeoSalary() {
		return ceoSalary;
	}

	public void setCeoSalary(float ceoSalary) {
		this.ceoSalary = ceoSalary;
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	/*
	 * function: calculate salary 
	 * input is fields include ceoSalary, allowance
	 * output is result of calculation
	 */
	public double calcSalary() {
		return this.ceoSalary * BASICSALARY + this.allowance;
	}

}
