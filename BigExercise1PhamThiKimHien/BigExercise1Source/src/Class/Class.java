package Class;

import java.util.ArrayList;

import Person.Student;
import Score.ScoreSubject;

/*
 * author: Pham Thi Kim Hien
 * date: 06/09/2016
 * version: 1.0
 * description: use to manage information of class
 */
public class Class extends Information {
	private int numberContract;
	private ArrayList<Subject> subject;
	private ArrayList<Student> student;
	// There are two list corresponding to the two subject
	ArrayList<ScoreSubject> firstSubjects = new ArrayList<ScoreSubject>();
	ArrayList<ScoreSubject> secondSubjects = new ArrayList<ScoreSubject>();
	public Class(String name, String startDate, String endDate,
			int numberTraining, int numberContract) {
		super(name, startDate, endDate, numberTraining);
		this.numberContract = numberContract;
		this.subject = new ArrayList<Subject>();
		this.student = new ArrayList<Student>();
		this.firstSubjects = new ArrayList<ScoreSubject>();
		this.secondSubjects = new ArrayList<ScoreSubject>();
	}
	//Print information of the first subject
	public void showInfoOfFistSubject(){
		for(int i=0;i<this.firstSubjects.size();i++){
			this.firstSubjects.get(i).showInfo();
		}
	}
	//Print information of the second subject
	public void showInfoOfSecondSubject(){
		for(int i=0;i<this.secondSubjects.size();i++){
			this.secondSubjects.get(i).showInfo();
		}
	}
	// Add subject score to the first list
	public void addScoreOfFirstSubject(ScoreSubject subject){
		this.firstSubjects.add(subject);
	}
	// Add subject score to the second list
	public void addScoreOfSecondSubject(ScoreSubject subject){
		this.secondSubjects.add(subject);
	}
	public ArrayList<Student> getArrayStudent(){
		return this.student;
	}
	public ArrayList<Subject> getArraySubject(){
		return this.subject;
	}
	
	// Add subject into subject list
	public void addSubject(Subject sub) {
		this.subject.add(sub);
	}
	
	// Add student into student list
	public void addStudent(Student stu) {
		this.student.add(stu);
	}
	public int getNumberContract() {
		return numberContract;
	}
	public void setNumberContract(int numberContract) {
		this.numberContract = numberContract;
	}
	// show subject list
	public void showSubject() {
		for (int i = 0; i < subject.size(); i++) {
			System.out.println(subject.get(i).toString());
		}
	}
	// show all name subject
	public void showNameSubject() {
		for (int i = 0; i < subject.size(); i++) {
			System.out.println((i+1) + ". " + subject.get(i).getName());
		}
	}
	
	// show all name student
	public void showStudent() {
		for (int i = 0; i < student.size(); i++) {
			System.out.println( (i+1) + ". " + student.get(i).getName());
		}
	}
	@Override
	public String toString() {
		return "\tNumber contract: " + this.numberContract + super.toString();
	}
}
