package Ex6_3;
/*
 * author: Pham Thi Kim Hien
 * date: 14/09/2016
 * Version: 1.0
 */
public class Student {
	private String name;
	private int grade;
	private double semaster1;
	private double semaster2;
	private double avg;
	public Student(String name, int grade, double semaster1, double semster2,
			double avg) {
		super();
		this.name = name;
		this.grade = grade;
		this.semaster1 = semaster1;
		this.semaster2 = semster2;
		this.avg = avg;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public double getSemaster1() {
		return semaster1;
	}
	public void setSemaster1(double semaster1) {
		this.semaster1 = semaster1;
	}
	public double getSemaster2() {
		return semaster2;
	}
	public void setSemaster2(double semster2) {
		this.semaster2 = semster2;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	@Override
	public String toString() {
		return "\tGrade: " + this.grade + "\t" + this.name + "\tSemaster 1: " + this.semaster1
				+ "\tSemaster 2: " + this.semaster2 + "\tAverage: " + this.avg;
	}
}