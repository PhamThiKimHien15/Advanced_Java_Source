package Score;

import Class.Subject;
import Person.Student;

/*
 * author: Pham Thi Kim Hien
 * date: 06/09/2016
 * version: 1.0
 * 
 */
public class Attendance {
	private double scoreAttendance;
	private double scoreExercise;
	private double scorePositive;
	private Subject sub;
	private Student student;
	public Attendance(double scoreAttendance, double scoreExercise,
			double scorePositive, String nameSubject, String nameStudent) {
		super();
		this.scoreAttendance = scoreAttendance;
		this.scoreExercise = scoreExercise;
		this.scorePositive = scorePositive;
		this.sub = new Subject(nameSubject);
		this.student = new Student(nameStudent);
	}
	
	public Attendance(double scoreAttendance, double scoreExercise,
			double scorePositive) {
		super();
		this.scoreAttendance = scoreAttendance;
		this.scoreExercise = scoreExercise;
		this.scorePositive = scorePositive;
	}

	public double getScoreAttendance() {
		return scoreAttendance;
	}
	public void setScoreAttendance(double scoreAttendance) {
		this.scoreAttendance = scoreAttendance;
	}
	public double getScoreExercise() {
		return scoreExercise;
	}
	public void setScoreExercise(double scoreExercise) {
		this.scoreExercise = scoreExercise;
	}
	public double getScorePositive() {
		return scorePositive;
	}
	public void setScorePositive(double scorePositive) {
		this.scorePositive = scorePositive;
	}
	
	public Subject getSub() {
		return sub;
	}
	public void setSub(Subject sub) {
		this.sub = sub;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
//	// function: calculate score attendance of a lesson (score <=5)
//	public double calAverageAttendance() {
//		return scoreAttendance / 2;
//	}
	// function: calculate score total of a lesson
	public double calTotalALesson() {
		return this.scoreAttendance*0.3 + this.scorePositive*0.1 + this.scoreExercise*0.6;
	}
	
}
