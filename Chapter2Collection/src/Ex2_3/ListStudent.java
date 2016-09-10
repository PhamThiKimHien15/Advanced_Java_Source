package Ex2_3;

import java.util.Map;
import java.util.TreeMap;
/*
 * Author: Pham Thi Kim Hien
 * Date: 07/09/2016
 * Version: 1.0
 */
public class ListStudent {
	private Map<String, Student> list;
	
	public ListStudent(){
		this.list = new TreeMap<String, Student>();
	}
	// add student, key into list
	public void addStudent(String key, Student stu) {
		this.list.put(key, stu);
	}
	
	// search student by key
	public Student searchStudent(String id) {
		for (String key : list.keySet()) {
			if(id.equals(key))
				return list.get(key);
		}
		return null;
	}
	
	// delete student by key
	public boolean deleteStudent(String id) {
		for (String key : list.keySet()) {
			if (id.equals(key)){
				list.remove(key);
				return true;
			}				
		}
		return false;
	}
	
	// show information of all student
	public void showInfo() {
		for (String key : list.keySet()) {
			System.out.println("\tID: " + key + list.get(key).toString());
		}
	}
}
