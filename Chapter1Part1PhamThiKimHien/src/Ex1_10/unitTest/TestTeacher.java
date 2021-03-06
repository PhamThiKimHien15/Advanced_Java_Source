package Ex1_10.unitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Ex1_10.source.Teacher;

/*
 * Author: Pham Thi Kim Hien
 * Date: 28/08/2016
 * Version: 1.0
 * 
 * Unit Test for calcSalary() method of Teacher class
 */
public class TestTeacher {
	Ex1_10.source.Teacher teacher;

	/*
	 * input is calcSalary() method 
	 * output is True / False use assertEquals
	 */
	@Test
	public void testCalcSalary1() {
		teacher = new Teacher((float) 2.5, 15000000);
		double ex = 18150000;
		double ac = teacher.calcSalary();
		assertEquals(ex, ac, 1);
	}

	@Test
	public void testCalcSalary2() {
		teacher = new Teacher((float) 3.5, 18000000);
		double ex = 22410000;
		double ac = teacher.calcSalary();
		assertEquals(ex, ac, 1);
	}

	@Test
	public void testCalcSalary3() {
		teacher = new Teacher((float) 1.2, 10000000);
		double ex = 11512000;
		double ac = teacher.calcSalary();
		assertEquals(ex, ac, 1);
	}

	@Test
	public void testCalcSalary4() {
		teacher = new Teacher((float) 2.0, 12500000);
		double ex = 15020000;
		double ac = teacher.calcSalary();
		assertEquals(ex, ac, 1);
	}

	@Test
	public void testCalcSalary5() {
		teacher = new Teacher((float) 1.6, 12000000);
		double ex = 14016000;
		double ac = teacher.calcSalary();
		assertEquals(ex, ac, 1);
	}

	@Test
	public void testCalcSalary6() {
		teacher = new Teacher((float) 2.5, 15000000);
		double ex = 18160000;
		double ac = teacher.calcSalary();
		assertEquals(ex, ac, 1);
	}

	@Test
	public void testCalcSalary7() {
		teacher = new Teacher((float) 3.5, 18000000);
		double ex = 22415000;
		double ac = teacher.calcSalary();
		assertEquals(ex, ac, 1);
	}

	@Test
	public void testCalcSalary8() {
		teacher = new Teacher((float) 1.2, 10000000);
		double ex = 11510000;
		double ac = teacher.calcSalary();
		assertEquals(ex, ac, 1);
	}

	@Test
	public void testCalcSalary9() {
		teacher = new Teacher((float) 2.0, 12500000);
		double ex = 15025000;
		double ac = teacher.calcSalary();
		assertEquals(ex, ac, 1);
	}

	@Test
	public void testCalcSalary10() {
		teacher = new Teacher((float) 1.6, 12000000);
		double ex = 14006000;
		double ac = teacher.calcSalary();
		assertEquals(ex, ac, 1);
	}

}
