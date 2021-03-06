package Ex4_3;
/*
 * Author: Pham Thi Kim Hien
 * Date: 12/09/2016
 * Version: 1.0
 */
public class Student {
	protected String name;
	protected int age;
	protected double mark1;
	protected double mark2;
	public Student(String name, int age, double mark1, double mark2) {
		super();
		this.name = name;
		this.age = age;
		this.mark1 = mark1;
		this.mark2 = mark2;
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

	public double getMark1() {
		return mark1;
	}

	public void setMark1(double mark1) {
		this.mark1 = mark1;
	}

	public double getMark2() {
		return mark2;
	}

	public void setMark2(double mark2) {
		this.mark2 = mark2;
	}

	public double calAverage() {
		return (mark1 + mark2)/2;
	}
	
	@Override
	public String toString() {
		return "\t" + name + "\tAge: " + age + "\tMark 1: " + mark1 
				+ "\tMark 2: " + mark2 + "\tAve: " + calAverage();
	}
	
}
