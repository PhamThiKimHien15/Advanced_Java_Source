package Ex1_14.unitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Ex1_14.source.Rectangle;
/*
 * Author: Pham Thi Kim Hien
 * Date: 24/08/2016
 * Version: 1.0
 * 
 * Unit Test for perimeter() method and Area() method of Rectangle class
 */
public class TestRectangle {
	Ex1_14.source.Rectangle rec;
	/*
	 * input is perimeter() method
	 * output is True / False use assertEquals
	 */
	@Test
	public void testPerimeter1() {
		rec = new Rectangle(4, 5);
		double ex = 18;
		double ac = rec.perimeter();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testPerimeter2() {
		rec = new Rectangle(2.5, 5);
		double ex = 15;
		double ac = rec.perimeter();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testPerimeter3() {
		rec = new Rectangle(6.2, 0);
		double ex = 12.4;
		double ac = rec.perimeter();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testPerimeter4() {
		rec = new Rectangle(0, 2);
		double ex = 4;
		double ac = rec.perimeter();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testPerimeter5() {
		rec = new Rectangle(0, 0);
		double ex = 0;
		double ac = rec.perimeter();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testPerimeter6() {
		rec = new Rectangle(4, 5);
		double ex = 19;
		double ac = rec.perimeter();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testPerimeter7() {
		rec = new Rectangle(2.5, 5);
		double ex = 15.265;
		double ac = rec.perimeter();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testPerimeter8() {
		rec = new Rectangle(6.2, 0);
		double ex = 12.2;
		double ac = rec.perimeter();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testPerimeter9() {
		rec = new Rectangle(0, 2);
		double ex = 0;
		double ac = rec.perimeter();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testPerimeter10() {
		rec = new Rectangle(0, 0);
		double ex = 1;
		double ac = rec.perimeter();
		assertEquals(ex, ac, 0.1);
	}

	/*
	 * input is area() method
	 * output is True / False use assertEquals
	 */
	@Test
	public void testArea1() {
		rec = new Rectangle(4, 5);
		double ex = 20;
		double ac = rec.area();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testArea2() {
		rec = new Rectangle(2.5, 5);
		double ex = 12.5;
		double ac = rec.area();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testArea3() {
		rec = new Rectangle(6.2, 0);
		double ex = 0;
		double ac = rec.area();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testArea4() {
		rec = new Rectangle(0, 2);
		double ex = 0;
		double ac = rec.area();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testArea5() {
		rec = new Rectangle(0, 0);
		double ex = 0;
		double ac = rec.area();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testArea6() {
		rec = new Rectangle(4, 5);
		double ex = 19;
		double ac = rec.area();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testArea7() {
		rec = new Rectangle(2.5, 5);
		double ex = 11.2;
		double ac = rec.area();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testArea8() {
		rec = new Rectangle(6.2, 0);
		double ex = 12.2;
		double ac = rec.area();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testArea9() {
		rec = new Rectangle(0, 2);
		double ex = 2;
		double ac = rec.area();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testArea10() {
		rec = new Rectangle(0, 0);
		double ex = 1;
		double ac = rec.area();
		assertEquals(ex, ac, 0.1);
	}
}
