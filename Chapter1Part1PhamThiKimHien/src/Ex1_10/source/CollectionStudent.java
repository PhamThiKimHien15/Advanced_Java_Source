package Ex1_10.source;

import java.util.ArrayList;

/*
 * Author: Pham Thi Kim Hien
 * Date: 22/08/2016
 * Version: 1.0
 * 
 * create list to manage information of Student
 */
public class CollectionStudent {

	ArrayList<Student> list;

	public CollectionStudent() {
		this.list = new ArrayList<Student>();
	}

	public void addStudent(Student st) {
		list.add(st);
	}

	// function: show information of Student
	public void showInfo() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString() + "\tClass: "
					+ list.get(i).getStuclass() + "\tPoint HK1: "
					+ list.get(i).gethH1() + "\tPoint HK2: "
					+ list.get(i).gethK2() + "\tAverage: "
					+ list.get(i).calcAverage());
		}
	}
}
