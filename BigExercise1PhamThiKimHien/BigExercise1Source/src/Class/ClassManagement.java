package Class;

import java.util.ArrayList;

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
