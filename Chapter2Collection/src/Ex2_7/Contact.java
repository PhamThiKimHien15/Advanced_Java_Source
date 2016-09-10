package Ex2_7;
/*
 * Author: Pham Thi Kim Hien
 * Date: 10/9/2016
 * Version: 1.0
 */
public class Contact {
	private String name;
	private String numPhone;
	public Contact(String name, String numPhone) {
		super();
		this.name = name;
		this.numPhone = numPhone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumPhone() {
		return numPhone;
	}
	public void setNumPhone(String numPhone) {
		this.numPhone = numPhone;
	}
	// use to check name, number phone and It is used in ContactManagement class
	@Override
	public boolean equals(Object obj) {
		Contact co = (Contact) obj;
		if (this.name.equals(co.name) || this.numPhone.equals(co.numPhone))
			return true;
		return false;
	}
	
	@Override
	public String toString() {
		return "\tName: " + this.name + "\t Number phone: " + this.numPhone;
	}
	
	
}
