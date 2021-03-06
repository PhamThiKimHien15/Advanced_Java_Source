package Ex1_12.unitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Ex1_12.source.TextBook;

/*
 * Author: Pham Thi Kim Hien
 * Date: 28/08/2016
 * Version: 1.0
 * 
 * Unit Test for calcMoney() method of Text Book class
 */
public class TestTextBook {
	Ex1_12.source.TextBook text;

	/*
	 * input is calcMoney() method 
	 * output is True / False use assertEquals
	 */
	@Test
	public void testCalcMoney1() {
		text = new TextBook(15000, 2, "new");
		double ex = 30000;
		double ac = text.calcMoney();
		assertEquals(ex, ac, 1);
	}

	@Test
	public void testCalcMoney2() {
		text = new TextBook(40000, 4, "old");
		double ex = 80000;
		double ac = text.calcMoney();
		assertEquals(ex, ac, 1);
	}

	@Test
	public void testCalcMoney3() {
		text = new TextBook(152000, 4, "new");
		double ex = 608000;
		double ac = text.calcMoney();
		assertEquals(ex, ac, 1);
	}

	@Test
	public void testCalcMoney4() {
		text = new TextBook(265000, 8, "old");
		double ex = 1060000;
		double ac = text.calcMoney();
		assertEquals(ex, ac, 1);
	}

	@Test
	public void testCalcMoney5() {
		text = new TextBook(324000, 3, "new");
		double ex = 972000;
		double ac = text.calcMoney();
		assertEquals(ex, ac, 1);
	}

	@Test
	public void testCalcMoney6() {
		text = new TextBook(15000, 2, "new");
		double ex = 35000;
		double ac = text.calcMoney();
		assertEquals(ex, ac, 1);
	}

	@Test
	public void testCalcMoney7() {
		text = new TextBook(40000, 4, "old");
		double ex = 160000;
		double ac = text.calcMoney();
		assertEquals(ex, ac, 1);
	}

	@Test
	public void testCalcMoney8() {
		text = new TextBook(152000, 4, "new");
		double ex = 600000;
		double ac = text.calcMoney();
		assertEquals(ex, ac, 1);
	}

	@Test
	public void testCalcMoney9() {
		text = new TextBook(265000, 8, "old");
		double ex = 1065000;
		double ac = text.calcMoney();
		assertEquals(ex, ac, 1);
	}

	@Test
	public void testCalcMoney10() {
		text = new TextBook(324000, 3, "new");
		double ex = 970000;
		double ac = text.calcMoney();
		assertEquals(ex, ac, 1);
	}
}
