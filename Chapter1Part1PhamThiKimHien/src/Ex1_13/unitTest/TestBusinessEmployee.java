package Ex1_13.unitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Ex1_13.source.BusinessEmployee;

/*
 * Author: Pham Thi Kim Hien
 * Date: 28/08/2016
 * Version: 1.0
 * 
 * Unit Test for calcBonuses() method of Business Employee class
 */
public class TestBusinessEmployee {
	Ex1_13.source.BusinessEmployee bus;

	/*
	 * input is calcBonuses() method 
	 * output is True / False use assertEquals
	 */
	@Test
	public void testCalcBonuses1() {
		bus = new BusinessEmployee(5000000, 2.3);
		double ex = 11500000;
		double ac = bus.calcBonuses();
		assertEquals(ex, ac, 0);
	}

	@Test
	public void testCalcBonuses2() {
		bus = new BusinessEmployee(5500000, 2.4);
		double ex = 13200000;
		double ac = bus.calcBonuses();
		assertEquals(ex, ac, 0);
	}

	@Test
	public void testCalcBonuses3() {
		bus = new BusinessEmployee(6000000, 3.0);
		double ex = 18000000;
		double ac = bus.calcBonuses();
		assertEquals(ex, ac, 0);
	}

	@Test
	public void testCalcBonuses4() {
		bus = new BusinessEmployee(9000000, 3.5);
		double ex = 31500000;
		double ac = bus.calcBonuses();
		assertEquals(ex, ac, 0);
	}

	@Test
	public void testCalcBonuses5() {
		bus = new BusinessEmployee(12000000, 4.0);
		double ex = 48000000;
		double ac = bus.calcBonuses();
		assertEquals(ex, ac, 0);
	}

	@Test
	public void testCalcBonuses6() {
		bus = new BusinessEmployee(5000000, 2.3);
		double ex = 12500000;
		double ac = bus.calcBonuses();
		assertEquals(ex, ac, 0);
	}

	@Test
	public void testCalcBonuses7() {
		bus = new BusinessEmployee(5500000, 2.4);
		double ex = 13500000;
		double ac = bus.calcBonuses();
		assertEquals(ex, ac, 0);
	}

	@Test
	public void testCalcBonuses8() {
		bus = new BusinessEmployee(6000000, 3.0);
		double ex = 18500000;
		double ac = bus.calcBonuses();
		assertEquals(ex, ac, 0);
	}

	@Test
	public void testCalcBonuses9() {
		bus = new BusinessEmployee(9000000, 3.5);
		double ex = 32500000;
		double ac = bus.calcBonuses();
		assertEquals(ex, ac, 0);
	}

	@Test
	public void testCalcBonuses10() {
		bus = new BusinessEmployee(12000000, 4.0);
		double ex = 48100000;
		double ac = bus.calcBonuses();
		assertEquals(ex, ac, 0);
	}
}
