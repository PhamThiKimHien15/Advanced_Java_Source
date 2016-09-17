package Ex7_1;
/*
 * author: Pham Thi Kim Hien
 * Date: 15/9/2016
 * Version: 1.0
*/
public class Contact {
	private String name;
	private String phone;
	public Contact(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	
	public Contact() {
		super();
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	// use to check name, number phone and It is used in ListContact class
	@Override
	public boolean equals(Object obj) {
		Contact co = (Contact) obj;
		if (this.name.equals(co.name) || this.phone.equals(co.phone))
			return true;
		return false;
	}
	@Override
	public String toString() {
		return "\t" + this.name + "\tPhone: " + this.phone;
	}	
}
