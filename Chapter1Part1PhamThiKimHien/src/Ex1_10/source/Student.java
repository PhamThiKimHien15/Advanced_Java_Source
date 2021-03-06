package Ex1_10.source;

/*
 * Author: Pham Thi Kim Hien
 * Date: 22/08/2016
 * Version: 1.0
 * 
 * Use to manage information of Student
 */
public class Student extends Human {

	private String stuclass;
	private double hH1;
	private double hK2;

	public Student(String name, String days, String address, String phone,
			String stuclass, double hH1, double hK2) {
		super(name, days, address, phone);
		this.stuclass = stuclass;
		this.hH1 = hH1;
		this.hK2 = hK2;
	}

	public Student(double hH1, double hK2) {
		this.hH1 = hH1;
		this.hK2 = hK2;
	}

	public String getStuclass() {
		return stuclass;
	}

	public void setStuclass(String stuclass) {
		this.stuclass = stuclass;
	}

	public double gethH1() {
		return hH1;
	}

	public void sethH1(double hH1) {
		this.hH1 = hH1;
	}

	public double gethK2() {
		return hK2;
	}

	public void sethK2(double hK2) {
		this.hK2 = hK2;
	}

	/*
	 * function: calculate Average scores 
	 * input is fields include hH1, hK2
	 * output is result of calculation
	 */
	public double calcAverage() {
		return (this.hH1 + this.hK2) / 2;
	}
}
