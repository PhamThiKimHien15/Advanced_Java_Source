package Ex1_13.unitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Ex1_13.source.ProductionEmployee;

/*
 * Author: Pham Thi Kim Hien
 * Date: 28/08/2016
 * Version: 1.0
 * 
 * Unit Test for calcBonuses() method of Production Employee class
 */
public class TestProductionEmployee {
	Ex1_13.source.ProductionEmployee pro;

	/*
	 * input is calcBonuses() method 
	 * output is True / False use assertEquals
	 */
	@Test
	public void testCalcBonuses1() {
		pro = new ProductionEmployee(1200);
		double ex = 10;
		double ac = pro.calcBonuses();
		assertEquals(ex, ac, 0);
	}

	@Test
	public void testCalcBonuses2() {
		pro = new ProductionEmployee(1500);
		double ex = 25;
		double ac = pro.calcBonuses();
		assertEquals(ex, ac, 0);
	}

	@Test
	public void testCalcBonuses3() {
		pro = new ProductionEmployee(1100);
		double ex = 5;
		double ac = pro.calcBonuses();
		assertEquals(ex, ac, 0);
	}

	@Test
	public void testCalcBonuses4() {
		pro = new ProductionEmployee(1000);
		double ex = 0;
		double ac = pro.calcBonuses();
		assertEquals(ex, ac, 0);
	}

	@Test
	public void testCalcBonuses5() {
		pro = new ProductionEmployee(1900);
		double ex = 45;
		double ac = pro.calcBonuses();
		assertEquals(ex, ac, 0);
	}

	@Test
	public void testCalcBonuses6() {
		pro = new ProductionEmployee(1200);
		double ex = 11;
		double ac = pro.calcBonuses();
		assertEquals(ex, ac, 0);
	}

	@Test
	public void testCalcBonuses7() {
		pro = new ProductionEmployee(1500);
		double ex = 24;
		double ac = pro.calcBonuses();
		assertEquals(ex, ac, 0);
	}

	@Test
	public void testCalcBonuses8() {
		pro = new ProductionEmployee(1100);
		double ex = 5.21;
		double ac = pro.calcBonuses();
		assertEquals(ex, ac, 0);
	}

	@Test
	public void testCalcBonuses9() {
		pro = new ProductionEmployee(1000);
		double ex = -1;
		double ac = pro.calcBonuses();
		assertEquals(ex, ac, 0);
	}

	@Test
	public void testCalcBonuses10() {
		pro = new ProductionEmployee(1900);
		double ex = -45;
		double ac = pro.calcBonuses();
		assertEquals(ex, ac, 0);
	}
}
