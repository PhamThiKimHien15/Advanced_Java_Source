package Ex1_10.source;

import java.util.ArrayList;

/*
 * Author: Pham Thi Kim Hien
 * Date: 22/08/2016
 * Version: 1.0
 * 
 * create list to manage information of Teacher
 */
public class CollectionTeacher {

	ArrayList<Teacher> list;

	public CollectionTeacher() {
		this.list = new ArrayList<Teacher>();
	}

	public void addTeacher(Teacher te) {
		list.add(te);
	}

	// function: show information of Teacher
	public void showInfo() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString() + "\tHomeroom class: "
					+ list.get(i).getHomeroomClass()
					+ "\tCoefficients salary: " + list.get(i).getCeoSalary()
					+ "\tAllowance: " + list.get(i).getAllowance()
					+ "\tSalary: " + list.get(i).calcSalary());
		}
	}
}
