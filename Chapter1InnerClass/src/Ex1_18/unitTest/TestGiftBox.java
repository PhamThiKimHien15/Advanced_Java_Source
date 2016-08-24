package Ex1_18.unitTest;

import static org.junit.Assert.*;

import org.junit.Test;
import Ex1_18.source.GiftBox;
/*
 * Author: Pham Thi Kim Hien
 * Date: 24/08/2016
 * Version: 1.0
 * 
 * Unit Test for calFee() method of Gift class inside GiftBox class
 */
public class TestGiftBox {
	
	GiftBox gb = new GiftBox();
	GiftBox.Gift gift;
	/*
	 * input is  calFee() method
 	 * output is True / False use assertEquals
	 */
	@Test
	public void testCalFee1() {
		gift = gb.new Gift(400);
		double ex = 90000;
		double ac = gift.calFee();
		assertEquals(ex, ac, 0);
	}
	@Test
	public void testCalFee2() {
		gift = gb.new Gift(200);
		double ex = 50000;
		double ac = gift.calFee();
		assertEquals(ex, ac, 0);
	}
	@Test
	public void testCalFee3() {
		gift = gb.new Gift(250);
		double ex = 60000;
		double ac = gift.calFee();
		assertEquals(ex, ac, 0);
	}
	@Test
	public void testCalFee4() {
		gift = gb.new Gift(100);
		double ex = 30000;
		double ac = gift.calFee();
		assertEquals(ex, ac, 0);
	}
	@Test
	public void testCalFee5() {
		gift = gb.new Gift(70);
		double ex = 24000;
		double ac = gift.calFee();
		assertEquals(ex, ac, 0);
	}
	@Test
	public void testCalFee6() {
		gift = gb.new Gift(400);
		double ex = 91000;
		double ac = gift.calFee();
		assertEquals(ex, ac, 0);
	}
	@Test
	public void testCalFee7() {
		gift = gb.new Gift(200);
		double ex = 40000;
		double ac = gift.calFee();
		assertEquals(ex, ac, 0);
	}
	@Test
	public void testCalFee8() {
		gift = gb.new Gift(250);
		double ex = 52000;
		double ac = gift.calFee();
		assertEquals(ex, ac, 0);
	}
	@Test
	public void testCalFee9() {
		gift = gb.new Gift(100);
		double ex = 20000;
		double ac = gift.calFee();
		assertEquals(ex, ac, 0);
	}
	@Test
	public void testCalFee10() {
		gift = gb.new Gift(70);
		double ex = 24251;
		double ac = gift.calFee();
		assertEquals(ex, ac, 0);
	}
}
