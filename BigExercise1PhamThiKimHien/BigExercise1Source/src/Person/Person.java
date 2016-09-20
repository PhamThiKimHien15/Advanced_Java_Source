package Person;

/*
 * author: Pham Thi Kim Hien
 * date: 06/09/2016
 * version: 1.0
 * Description: use to provide general information for Student class and Teacher class
 */
public class Person {
	private String name;
	private String email;
	private String phone;

	public Person(String name, String email, String phone) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	
	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "\tName: " + this.name + "\tPhone: " + this.phone + "\tEmail: " + this.email;
	}
}
