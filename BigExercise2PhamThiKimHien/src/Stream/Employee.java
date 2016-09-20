package Stream;

/*
 * 	Author: Pham Thi Kim Hien
 *	Date: 19/09/2016
 *	Version: 1.0
 *  Description: use to manage information of Employee
 */
public class Employee {
	protected String name;
	protected int age;
	protected double salary;

	public Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "\t"	+ String.format("%-20s%8s%15.2f", this.name, this.age, this.salary);
	}
}
