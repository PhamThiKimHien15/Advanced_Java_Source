package Score;

import java.util.ArrayList;

import Class.Subject;
import Person.Student;

/*
 * author: Pham Thi Kim Hien
 * date: 06/09/2016
 * version: 1.0
 * 
 */
public class ScoreSubject {
	private double scoreTheory;
	private double scorePractice;
	private ArrayList<Attendance> att;
	private Subject sub;
	private Student student;
	
	public ScoreSubject() {
		this.att = new ArrayList<Attendance>();
	}
	public ScoreSubject(double scoreTheory, double scorePractice, String nameSubject, String nameStudent) {
		super();
		this.scoreTheory = scoreTheory;
		this.scorePractice = scorePractice;
		this.att = new ArrayList<Attendance>();
		this.sub = new Subject(nameSubject);
		this.student = new Student(nameStudent);
	}
	
	public ScoreSubject(double scoreTheory, double scorePractice,
			ArrayList<Attendance> att) {
		super();
		this.scoreTheory = scoreTheory;
		this.scorePractice = scorePractice;
		this.att = att;
	}
	public double getScoreTheory() {
		return scoreTheory;
	}
	public void setScoreTheory(double scoreTheory) {
		this.scoreTheory = scoreTheory;
	}
	public double getScorePractice() {
		return scorePractice;
	}
	public void setScorePractice(double scorePractice) {
		this.scorePractice = scorePractice;
	}
	
	// add attendance of a lesson into list
	public void addAttendance(Attendance atten) {
		this.att.add(atten);
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
	
	// function: calculate score total person of a subject
	public double calTotalPerson() {
		double sum = 0;
		for (int i = 0; i < att.size(); i++) {
			sum += att.get(i).calTotalALesson();
		}
		return sum / att.size();
	}
	// calculate score total final of a subject
	public double calTotalSubject() {
		return this.calTotalPerson()*0.3 + this.scoreTheory*0.4 + this.scorePractice*0.3;
	}
	
	// show information score subject
	public void showInfo(){
		if (this.getScoreTheory() > 0 && this.getScorePractice() > 0 && calTotalPerson() > 0){
			System.out.println("\t----Name: " + this.getStudent().getName()
					+ "\n\tScore theory: " + this.getScoreTheory() 
					+ "\n\tScore practice: " +this.getScorePractice()
					+ "\n\tScore total person: " + this.calTotalPerson()
					+ "\n\tScore total subject: " + this.calTotalSubject());
		}else{
			System.out.println("This information is shown when students fully meet the score column.");
		}
		
	}
}
