package Ex7_2;
/*
 * author: Pham Thi Kim Hien
 * Date: 15/9/2016
 * Version: 1.0
*/
public class Department {
	private int id;
	private String name;
	public Department(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Department() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.id + "\t" + this.name;
	}
}
