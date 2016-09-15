package Ex7_1;

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
	@Override
	public String toString() {
		return "\t" + this.name + "\tPhone: " + this.phone;
	}	
}