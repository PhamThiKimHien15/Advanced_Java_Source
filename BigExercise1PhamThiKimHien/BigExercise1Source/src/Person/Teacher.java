package Person;

/*
 * author: Pham Thi Kim Hien
 * date: 06/09/2016
 * version: 1.0
 * description: use to create information of Teacher
 */
public class Teacher extends Person {
	private String teachAbility;

	public Teacher(String name, String email, String phone, String teachAbility) {
		super(name, email, phone);
		this.teachAbility = teachAbility;
	}

	public String getTeachAbility() {
		return teachAbility;
	}

	public void setTeachAbility(String teachAbility) {
		this.teachAbility = teachAbility;
	}

}
