package Ex1_10;

public class Teacher extends Human {

	private String homeroomClass;
	private float ceoSalary;
	private double allowance;
	private final double BASICSALARY = 1260000;
	public Teacher(String name, String days, String address, String phone, String homeroomClass, float ceoSalary,
			double allowance) {
		super(name, days, address, phone);
		this.homeroomClass = homeroomClass;
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
	public double calcSalary() {
		return this.ceoSalary*BASICSALARY*this.allowance;
	}
	
}
