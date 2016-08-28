package Ex1_10.unitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Ex1_10.source.Student;

/*
 * Author: Pham Thi Kim Hien
 * Date: 28/08/2016
 * Version: 1.0
 * 
 * Unit Test for calcAverage() method of Student class
 */
public class TestStudent {
	Ex1_10.source.Student st;

	/*
	 * input is calcAverage() method 
	 * output is True / False use assertEquals
	 */
	@Test
	public void testCalcAverage1() {
		st = new Student(5.5, 7.3);
		double ex = 6.4;
		double ac = st.calcAverage();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testCalcAverage2() {
		st = new Student(8, 8.4);
		double ex = 8.2;
		double ac = st.calcAverage();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testCalcAverage3() {
		st = new Student(6.75, 7.3);
		double ex = 7.025;
		double ac = st.calcAverage();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testCalcAverage4() {
		st = new Student(5, 7.9);
		double ex = 6.45;
		double ac = st.calcAverage();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testCalcAverage5() {
		st = new Student(4.9, 6.5);
		double ex = 5.7;
		double ac = st.calcAverage();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testCalcAverage6() {
		st = new Student(5.5, 7.3);
		double ex = 6.45;
		double ac = st.calcAverage();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testCalcAverage7() {
		st = new Student(8, 8.4);
		double ex = 8.22;
		double ac = st.calcAverage();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testCalcAverage8() {
		st = new Student(6.75, 7.3);
		double ex = 7.25;
		double ac = st.calcAverage();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testCalcAverage9() {
		st = new Student(5, 7.9);
		double ex = 6.55;
		double ac = st.calcAverage();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testCalcAverage10() {
		st = new Student(4.9, 6.5);
		double ex = 6.7;
		double ac = st.calcAverage();
		assertEquals(ex, ac, 0.01);
	}

}
