package Class;

import java.util.ArrayList;

/*
 * 	Author: Pham Thi Kim Hien
 *	Date: 06/09/2016
 *	Version: 1.0
 *  Description: create list to manage information of class
 */
public class ClassManagement {
	private ArrayList<Class> list;
	
	public ClassManagement(){
		this.list = new ArrayList<Class>();
	}
	public void addclass(Class cls) {
		this.list.add(cls);
	}
	public void showClass() {
		System.out.println("Class list: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i+1) + ". " + list.get(i).toString());
		}
	}
	public void showNameClass() {
		System.out.println("Class list: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i+1) + ". " + list.get(i).getName());
		}
	}
}
