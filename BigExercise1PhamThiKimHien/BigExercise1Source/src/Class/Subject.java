package Class;

import Person.Teacher;
/*
 * author: Pham Thi Kim Hien
 * date: 06/09/2016
 * version: 1.0
 * 
 */
public class Subject extends Information {
	private Teacher teacher;
	
	public Subject(String name, String startDate, String endDate,
			int numberTraining) {
		super(name, startDate, endDate, numberTraining);
		this.teacher = teacher;
	}
	
	public Subject(String name) {
		super(name);
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	@Override
	public String toString() {
		return super.toString() + "\tTeacher: " + this.teacher;
	}
}
