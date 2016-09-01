package Ex1_29;


/**
 * @author Pham Thi Kim Hien
 * @version 1.0
 * @created 01-Sep-2016 10:43:48 AM
 */
public class Teacher {

	private static Teacher instance;

	public Teacher() {
		super();
	}

	public static Teacher getInstance(){
		if(instance == null)
			instance = new Teacher();
		return instance;
	}

	public String shareDocument(){
		return "Chapter 1 Task 1.19 creational";
	}

}