package Ex1_12.unitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Ex1_12.source.ReferenceBook;
/*
 * Author: Pham Thi Kim Hien
 * Date: 28/08/2016
 * Version: 1.0
 * 
 * Unit Test for calcMoney() method of Reference Book class
 */
public class TestReferenceBook {
	Ex1_12.source.ReferenceBook ref;
	/*
	 * input is calcMoney() method 
	 * output is True / False use assertEquals
	 */
	@Test
	public void testCalcMoney1() {
		ref = new ReferenceBook(12000, 2, 20);
		double ex = 28800;
		double ac = ref.calcMoney();
		assertEquals(ex, ac, 0);
	}
	@Test
	public void testCalcMoney2() {
		ref = new ReferenceBook(28000, 5, 12);
		double ex = 156800;
		double ac = ref.calcMoney();
		assertEquals(ex, ac, 0);
	}
	@Test
	public void testCalcMoney3() {
		ref = new ReferenceBook(56000, 4, 10);
		double ex = 246400;
		double ac = ref.calcMoney();
		assertEquals(ex, ac, 0);
	}
	@Test
	public void testCalcMoney4() {
		ref = new ReferenceBook(320000, 8, 35);
		double ex = 3456000;
		double ac = ref.calcMoney();
		assertEquals(ex, ac, 0);
	}
	@Test
	public void testCalcMoney5() {
		ref = new ReferenceBook(812000, 3, 25);
		double ex = 3045000;
		double ac = ref.calcMoney();
		assertEquals(ex, ac, 0);
	}
	@Test
	public void testCalcMoney6() {
		ref = new ReferenceBook(12000, 2, 20);
		double ex = 29000;
		double ac = ref.calcMoney();
		assertEquals(ex, ac, 0);
	}
	@Test
	public void testCalcMoney7() {
		ref = new ReferenceBook(28000, 5, 12);
		double ex = 157000;
		double ac = ref.calcMoney();
		assertEquals(ex, ac, 0);
	}
	@Test
	public void testCalcMoney8() {
		ref = new ReferenceBook(56000, 4, 10);
		double ex = 250400;
		double ac = ref.calcMoney();
		assertEquals(ex, ac, 0);
	}
	@Test
	public void testCalcMoney9() {
		ref = new ReferenceBook(320000, 8, 35);
		double ex = 4456000;
		double ac = ref.calcMoney();
		assertEquals(ex, ac, 0);
	}
	@Test
	public void testCalcMoney10() {
		ref = new ReferenceBook(812000, 3, 25);
		double ex = 3245000;
		double ac = ref.calcMoney();
		assertEquals(ex, ac, 0);
	}
}
