package Ex1_11.unitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Ex1_11.source.CurrencyTransaction;

/*
 * Author: Pham Thi Kim Hien
 * Date: 28/08/2016
 * Version: 1.0
 * 
 * Unit Test for calcBuy() method and calcSell() method of Currency Transaction class
 */
public class TestCurrencyTransaction {
	Ex1_11.source.CurrencyTransaction cur;

	/*
	 * input is calcBuy() method 
	 * output is True / False use assertEquals
	 */
	@Test
	public void testCalcBuy1() {
		cur = new CurrencyTransaction(2000, "USD");
		double ex = 44670000;
		double ac = cur.calcBuy();
		assertEquals(ex, ac, 0);
	}

	@Test
	public void testCalcBuy2() {
		cur = new CurrencyTransaction(2000, "EUR");
		double ex = 50100000;
		double ac = cur.calcBuy();
		assertEquals(ex, ac, 0);
	}

	@Test
	public void testCalcBuy3() {
		cur = new CurrencyTransaction(15.24, "AUD");
		double ex = 262524;
		double ac = cur.calcBuy();
		assertEquals(ex, ac, 1);
	}

	@Test
	public void testCalcBuy4() {
		cur = new CurrencyTransaction(8.5, "EUR");
		double ex = 212925;
		double ac = cur.calcBuy();
		assertEquals(ex, ac, 1);
	}

	@Test
	public void testCalcBuy5() {
		cur = new CurrencyTransaction(2.56, "USD");
		double ex = 57177;
		double ac = cur.calcBuy();
		assertEquals(ex, ac, 1);
	}

	@Test
	public void testCalcBuy6() {
		cur = new CurrencyTransaction(20, "USD");
		double ex = 446750;
		double ac = cur.calcBuy();
		assertEquals(ex, ac, 1);
	}

	@Test
	public void testCalcBuy7() {
		cur = new CurrencyTransaction(20, "EUR");
		double ex = 502000;
		double ac = cur.calcBuy();
		assertEquals(ex, ac, 1);
	}

	@Test
	public void testCalcBuy8() {
		cur = new CurrencyTransaction(15.24, "AUD");
		double ex = 26260;
		double ac = cur.calcBuy();
		assertEquals(ex, ac, 1);
	}

	@Test
	public void testCalcBuy9() {
		cur = new CurrencyTransaction(8.5, "EUR");
		double ex = 212930;
		double ac = cur.calcBuy();
		assertEquals(ex, ac, 1);
	}

	@Test
	public void testCalcBuy10() {
		cur = new CurrencyTransaction(2.56, "USD");
		double ex = 57100;
		double ac = cur.calcBuy();
		assertEquals(ex, ac, 1);
	}

	/*
	 * input is calcSell() method output is True / False use assertEquals
	 */
	@Test
	public void testCalcSell1() {
		cur = new CurrencyTransaction(20, "USD");
		double ex = 489500;
		double ac = cur.calcSell();
		assertEquals(ex, ac, 1);
	}

	@Test
	public void testCalcSell2() {
		cur = new CurrencyTransaction(20, "EUR");
		double ex = 538054;
		double ac = cur.calcSell();
		assertEquals(ex, ac, 1);
	}

	@Test
	public void testCalcSell3() {
		cur = new CurrencyTransaction(15.24, "AUD");
		double ex = 277108;
		double ac = cur.calcSell();
		assertEquals(ex, ac, 1);
	}

	@Test
	public void testCalcSell4() {
		cur = new CurrencyTransaction(8.5, "EUR");
		double ex = 228672;
		double ac = cur.calcSell();
		assertEquals(ex, ac, 1);
	}

	@Test
	public void testCalcSell5() {
		cur = new CurrencyTransaction(2.56, "USD");
		double ex = 62656;
		double ac = cur.calcSell();
		assertEquals(ex, ac, 1);
	}

	@Test
	public void testCalcSell6() {
		cur = new CurrencyTransaction(20, "USD");
		double ex = 489600;
		double ac = cur.calcSell();
		assertEquals(ex, ac, 1);
	}

	@Test
	public void testCalcSell7() {
		cur = new CurrencyTransaction(20, "EUR");
		double ex = 5380500;
		double ac = cur.calcSell();
		assertEquals(ex, ac, 1);
	}

	@Test
	public void testCalcSell8() {
		cur = new CurrencyTransaction(15.24, "AUD");
		double ex = 277100;
		double ac = cur.calcSell();
		assertEquals(ex, ac, 1);
	}

	@Test
	public void testCalcSell9() {
		cur = new CurrencyTransaction(8.5, "EUR");
		double ex = 229672;
		double ac = cur.calcSell();
		assertEquals(ex, ac, 1);
	}

	@Test
	public void testCalcSell10() {
		cur = new CurrencyTransaction(2.56, "USD");
		double ex = 62666;
		double ac = cur.calcSell();
		assertEquals(ex, ac, 1);
	}
}
