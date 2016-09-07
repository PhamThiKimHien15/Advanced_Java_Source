package UnitTest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import Score.Attendance;
import Score.ScoreSubject;
/*
 * Author: Pham Thi Kim Hien
 * Date: 07/09/2016
 * Version: 1.0
 * 
 * Unit Test for calTotalSubject() method of ScoreSubject class
 */
public class TestScoreSubject {
	Score.ScoreSubject score;
	ArrayList<Attendance> att;
	/*
	 * input is calTotalSubject() method 
	 * output is True / False use assertEquals
	 */
	@Test
	public void testCalTotalSubject1() {
		att = new ArrayList<Attendance>();
		score = new ScoreSubject(7, 7, att);
		Attendance at = new Attendance(5, 7, 8);
		Attendance at2 = new Attendance(5, 7, 8);		
		score.addAttendance(at);
		score.addAttendance(at2);		
		double ex = 6.85;
		double ac = score.calTotalSubject();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testCalTotalSubject2() {
		att = new ArrayList<Attendance>();
		score = new ScoreSubject(8, 9, att);
		Attendance at = new Attendance(10, 7, 8);
		Attendance at2 = new Attendance(10, 7, 8);		
		score.addAttendance(at);
		score.addAttendance(at2);		
		double ex = 8.299;
		double ac = score.calTotalSubject();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testCalTotalSubject3() {
		att = new ArrayList<Attendance>();
		score = new ScoreSubject(5, 6, att);
		Attendance at = new Attendance(5, 4, 5);
		Attendance at2 = new Attendance(5, 7, 8);		
		score.addAttendance(at);
		score.addAttendance(at2);		
		double ex = 5.435;
		double ac = score.calTotalSubject();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testCalTotalSubject4() {
		att = new ArrayList<Attendance>();
		score = new ScoreSubject(9,8, att);
		Attendance at = new Attendance(10, 5, 4);
		Attendance at2 = new Attendance(10, 7,9);		
		score.addAttendance(at);
		score.addAttendance(at2);		
		double ex = 8.175;
		double ac = score.calTotalSubject();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testCalTotalSubject5() {
		att = new ArrayList<Attendance>();
		score = new ScoreSubject(9,8, att);
		Attendance at = new Attendance(10, 5, 4);
		Attendance at2 = new Attendance(0, 0,0);		
		score.addAttendance(at);
		score.addAttendance(at2);		
		double ex = 6.98;
		double ac = score.calTotalSubject();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testCalTotalSubject6() {
		att = new ArrayList<Attendance>();
		score = new ScoreSubject(7, 7, att);
		Attendance at = new Attendance(5, 7, 8);
		Attendance at2 = new Attendance(5, 7, 8);		
		score.addAttendance(at);
		score.addAttendance(at2);		
		double ex = 6.95;
		double ac = score.calTotalSubject();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testCalTotalSubject7() {
		att = new ArrayList<Attendance>();
		score = new ScoreSubject(8, 9, att);
		Attendance at = new Attendance(10, 7, 8);
		Attendance at2 = new Attendance(10, 7, 8);		
		score.addAttendance(at);
		score.addAttendance(at2);		
		double ex = 8.4;
		double ac = score.calTotalSubject();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testCalTotalSubject8() {
		att = new ArrayList<Attendance>();
		score = new ScoreSubject(5, 6, att);
		Attendance at = new Attendance(5, 4, 5);
		Attendance at2 = new Attendance(5, 7, 8);		
		score.addAttendance(at);
		score.addAttendance(at2);		
		double ex = 5.65;
		double ac = score.calTotalSubject();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testCalTotalSubject9() {
		att = new ArrayList<Attendance>();
		score = new ScoreSubject(9,8, att);
		Attendance at = new Attendance(10, 5, 4);
		Attendance at2 = new Attendance(10, 7,9);		
		score.addAttendance(at);
		score.addAttendance(at2);		
		double ex = 8.5;
		double ac = score.calTotalSubject();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testCalTotalSubject10() {
		att = new ArrayList<Attendance>();
		score = new ScoreSubject(9,8, att);
		Attendance at = new Attendance(10, 5, 4);
		Attendance at2 = new Attendance(0, 0,0);		
		score.addAttendance(at);
		score.addAttendance(at2);		
		double ex = 7.5;
		double ac = score.calTotalSubject();
		assertEquals(ex, ac, 0.1);
	}
}
























