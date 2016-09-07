package Person;

/*
 * author: Pham Thi Kim Hien
 * date: 06/09/2016
 * version: 1.0
 * 
 */
public class Student extends Person {
	private String birthday;

	public Student(String name, String email, String phone, String birthday) {
		super(name, email, phone);
		this.birthday = birthday;
	}
	
	public Student(String name) {
		super(name);
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return super.toString() + "\tBirthday: " + this.birthday;
	}
}
