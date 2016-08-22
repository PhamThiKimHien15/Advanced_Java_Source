package Ex1_10;

import java.util.ArrayList;

public class CollectionTeacher {

	ArrayList<Teacher> list;

	public CollectionTeacher() {
		this.list = new ArrayList<Teacher>();
	}
	public void addTeacher(Teacher te) {
		list.add(te);
	}
	
	public void showInfo() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString() + "\tHomeroom class: " + list.get(i).getHomeroomClass() + "\tCoefficients salary: " + list.get(i).getCeoSalary() + "\tAllowance: " + list.get(i).getAllowance() + "\tSalary: " + list.get(i).calcSalary());
		}
	}
}
