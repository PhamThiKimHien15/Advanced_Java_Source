package Ex2_5;

import java.util.Comparator;

import Ex2_3.Student;

/*
 * Author: Pham Thi Kim Hien
 * Date: 08/09/2016
 * Version: 1.0
 */
public class Employee {
	private String name;
	private int age;
	private double salary;
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
		return "\tName: " + this.name + "\tAge: " + this.age + "\tSalary: " + this.salary;
	}
	public int compareTo(Employee o) {
		if (this.getSalary() < o.getSalary())
			return 0;
		return -1;
	}	
	
}
