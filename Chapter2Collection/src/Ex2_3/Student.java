package Ex2_3;
/*
 * Author: Pham Thi Kim Hien
 * Date: 07/09/2016
 * Version: 1.0
 */
public class Student {
	private String name;
	private int age;
	private String placeOfBirth;
	public Student(String name, int age, String placeOfBirth) {
		super();
		this.name = name;
		this.age = age;
		this.placeOfBirth = placeOfBirth;
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
	public String getPlaceOfBirth() {
		return placeOfBirth;
	}
	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}
	@Override
	public String toString() {
		return "\t\tName: " + this.name + "\tAge: " + this.age 
				+ "\t\tPlace of birth: " + this.placeOfBirth;
	}
}
