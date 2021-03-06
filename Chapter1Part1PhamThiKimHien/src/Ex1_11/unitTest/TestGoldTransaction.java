package Ex1_11.unitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Ex1_11.source.GoldTransaction;

/*
 * Author: Pham Thi Kim Hien
 * Date: 28/08/2016
 * Version: 1.0
 * 
 * Unit Test for calcTotalMoney() method of Gold Transaction class
 */
public class TestGoldTransaction {
	Ex1_11.source.GoldTransaction gold;

	/*
	 * input is calcTotalMoney() method 
	 * output is True / False use assertEquals
	 */
	@Test
	public void testCalcTotalMoney1() {
		gold = new GoldTransaction(2.6, "24k");
		double ex = 9138740;
		double ac = gold.calcTotalMoney();
		assertEquals(ex, ac, 1);
	}

	@Test
	public void testCalcTotalMoney2() {
		gold = new GoldTransaction(2.15, "SJC");
		double ex = 7718500;
		double ac = gold.calcTotalMoney();
		assertEquals(ex, ac, 1);
	}

	@Test
	public void testCalcTotalMoney3() {
		gold = new GoldTransaction(3.25, "24k");
		double ex = 11423425;
		double ac = gold.calcTotalMoney();
		assertEquals(ex, ac, 1);
	}

	@Test
	public void testCalcTotalMoney4() {
		gold = new GoldTransaction(10.5, "SJC");
		double ex = 37695000;
		double ac = gold.calcTotalMoney();
		assertEquals(ex, ac, 1);
	}

	@Test
	public void testCalcTotalMoney5() {
		gold = new GoldTransaction(7.15, "24k");
		double ex = 25131535;
		double ac = gold.calcTotalMoney();
		assertEquals(ex, ac, 1);
	}

	@Test
	public void testCalcTotalMoney6() {
		gold = new GoldTransaction(2.6, "24k");
		double ex = 9139000;
		double ac = gold.calcTotalMoney();
		assertEquals(ex, ac, 1);
	}

	@Test
	public void testCalcTotalMoney7() {
		gold = new GoldTransaction(2.15, "SJC");
		double ex = 7728500;
		double ac = gold.calcTotalMoney();
		assertEquals(ex, ac, 1);
	}

	@Test
	public void testCalcTotalMoney8() {
		gold = new GoldTransaction(3.25, "24k");
		double ex = 11424000;
		double ac = gold.calcTotalMoney();
		assertEquals(ex, ac, 1);
	}

	@Test
	public void testCalcTotalMoney9() {
		gold = new GoldTransaction(10.5, "SJC");
		double ex = 37705000;
		double ac = gold.calcTotalMoney();
		assertEquals(ex, ac, 1);
	}

	@Test
	public void testCalcTotalMoney10() {
		gold = new GoldTransaction(7.15, "24k");
		double ex = 25140000;
		double ac = gold.calcTotalMoney();
		assertEquals(ex, ac, 1);
	}
}
