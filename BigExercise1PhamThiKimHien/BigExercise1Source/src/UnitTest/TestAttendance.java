package UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Score.Attendance;
/*
 * Author: Pham Thi Kim Hien
 * Date: 07/09/2016
 * Version: 1.0
 * 
 * Unit Test for calTotalALesson() method of Attendance class
 */
public class TestAttendance {
	Score.Attendance att;
	/*
	 * input is calTotalALesson() method 
	 * output is True / False use assertEquals
	 */
	@Test
	public void testCalTotalALesson1() {
		att = new Attendance(5, 7, 8);
		double ex = 6.5;
		double ac = att.calTotalALesson();
		assertEquals(ex, ac, 0);
	}
	@Test
	public void testCalTotalALesson2() {
		att = new Attendance(10, 5, 9);
		double ex = 6.9;
		double ac = att.calTotalALesson();
		assertEquals(ex, ac, 0);
	}
	@Test
	public void testCalTotalALesson3() {
		att = new Attendance(0, 0, 0);
		double ex = 0;
		double ac = att.calTotalALesson();
		assertEquals(ex, ac, 0);
	}
	@Test
	public void testCalTotalALesson4() {
		att = new Attendance(10, 8, 9);
		double ex = 8.7;
		double ac = att.calTotalALesson();
		assertEquals(ex, ac, 0);
	}
	@Test
	public void testCalTotalALesson5() {
		att = new Attendance(5, 6, 9);
		double ex = 6;
		double ac = att.calTotalALesson();
		assertEquals(ex, ac, 0
				);
	}
	@Test
	public void testCalTotalALesson6() {
		att = new Attendance(5, 7, 8);
		double ex = 6.7;
		double ac = att.calTotalALesson();
		assertEquals(ex, ac, 0);
	}
	@Test
	public void testCalTotalALesson7() {
		att = new Attendance(10, 5, 9);
		double ex = 7;
		double ac = att.calTotalALesson();
		assertEquals(ex, ac, 0);
	}
	@Test
	public void testCalTotalALesson8() {
		att = new Attendance(0, 0, 0);
		double ex = 1;
		double ac = att.calTotalALesson();
		assertEquals(ex, ac, 0);
	}
	@Test
	public void testCalTotalALesson9() {
		att = new Attendance(10, 8, 9);
		double ex = 9;
		double ac = att.calTotalALesson();
		assertEquals(ex, ac, 0);
	}
	@Test
	public void testCalTotalALesson10() {
		att = new Attendance(5, 6, 9);
		double ex = 6.5;
		double ac = att.calTotalALesson();
		assertEquals(ex, ac, 0);
	}
}
