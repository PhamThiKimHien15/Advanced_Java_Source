package Ex1_9.unitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Ex1_9.source.Computer;

/*
 * Author: Pham Thi Kim Hien
 * Date: 28/08/2016
 * Version: 1.0
 * 
 * Unit Test for calcMoney() method of Computer class
 */
public class TestComputer {
	Ex1_9.source.Computer cpt;

	/*
	 * input is calcMoney() method 
	 * output is True / False use assertEquals
	 */
	@Test
	public void testCalcMoney1() {
		cpt = new Computer(15000000, 4);
		double ex = 60000000;
		double ac = cpt.calcMoney();
		assertEquals(ex, ac, 0);
	}

	@Test
	public void testCalcMoney2() {
		cpt = new Computer(16500000, 2);
		double ex = 33000000;
		double ac = cpt.calcMoney();
		assertEquals(ex, ac, 0);
	}

	@Test
	public void testCalcMoney3() {
		cpt = new Computer(18000000, 6);
		double ex = 108000000;
		double ac = cpt.calcMoney();
		assertEquals(ex, ac, 0);
	}

	@Test
	public void testCalcMoney4() {
		cpt = new Computer(13500000, 1);
		double ex = 13500000;
		double ac = cpt.calcMoney();
		assertEquals(ex, ac, 0);
	}

	@Test
	public void testCalcMoney5() {
		cpt = new Computer(21000000, 5);
		double ex = 105000000;
		double ac = cpt.calcMoney();
		assertEquals(ex, ac, 0);
	}

	@Test
	public void testCalcMoney6() {
		cpt = new Computer(15000000, 4);
		double ex = 60500000;
		double ac = cpt.calcMoney();
		assertEquals(ex, ac, 0);
	}

	@Test
	public void testCalcMoney7() {
		cpt = new Computer(16500000, 2);
		double ex = 34000000;
		double ac = cpt.calcMoney();
		assertEquals(ex, ac, 0);
	}

	@Test
	public void testCalcMoney8() {
		cpt = new Computer(18000000, 6);
		double ex = 10800000;
		double ac = cpt.calcMoney();
		assertEquals(ex, ac, 0);
	}

	@Test
	public void testCalcMoney9() {
		cpt = new Computer(13500000, 1);
		double ex = 13550000;
		double ac = cpt.calcMoney();
		assertEquals(ex, ac, 0);
	}

	@Test
	public void testCalcMoney10() {
		cpt = new Computer(21000000, 5);
		double ex = 105400000;
		double ac = cpt.calcMoney();
		assertEquals(ex, ac, 0);
	}
}
