package phamThiKimHien.unitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import phamThiKimHien.source.Point;
import phamThiKimHien.source.Rectangle;
/*
 * Author: Pham Thi Kim Hien
 * Date: 08/21/2016
 * Version: 1.0
 * 
 * Unit Test for calcPerimeter() method and calcArea() method of Rectangle class
 */
public class TestRectangle {
	phamThiKimHien.source.Rectangle rec;
	// input is object of Rectangle class, and use calcPerimeter() method
	// output is True/False use assertEquals
	@Test
	public void testCalcPerimeter1() {
		rec = new Rectangle();		
		double ex = 4;
		double ac = rec.calcPerimeter(new Point(0, 0), new Point(1, 1));
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testCalcPerimeter2() {
		rec = new Rectangle();		
		double ex = 0;
		double ac = rec.calcPerimeter(new Point(0, 0), new Point(0, 0));
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testCalcPerimeter3() {
		rec = new Rectangle();		
		double ex = 12.324;
		double ac = rec.calcPerimeter(new Point(0, 0), new Point(2, 3));
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testCalcPerimeter4() {
		rec = new Rectangle();		
		double ex = 6.472;
		double ac = rec.calcPerimeter(new Point(0, 0), new Point(3,1));
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testCalcPerimeter5() {
		rec = new Rectangle();		
		double ex = 5;
		double ac = rec.calcPerimeter(new Point(0, 0), new Point(1,1));
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testCalcPerimeter6() {
		rec = new Rectangle();		
		double ex = 8.772;
		double ac = rec.calcPerimeter(new Point(0, 0), new Point(1,2));
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testCalcPerimeter7() {
		rec = new Rectangle();		
		double ex = 12.524;
		double ac = rec.calcPerimeter(new Point(0, 0), new Point(2,3));
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testCalcPerimeter8() {
		rec = new Rectangle();		
		double ex = 8.672;
		double ac = rec.calcPerimeter(new Point(0, 0), new Point(3,2));
		assertEquals(ex, ac, 0.1);
	}
	// input is object of Rectangle class, and use calcArea() method
	// output is True/False use assertEquals
	@Test
	public void testCalcArea1() {
		rec = new Rectangle();		
		double ex = 1;
		double ac = rec.calcArea(new Point(0, 0), new Point(1, 1));
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testCalcArea2() {
		rec = new Rectangle();		
		double ex = 0;
		double ac = rec.calcArea(new Point(0, 0), new Point(0, 0));
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testCalcArea3() {
		rec = new Rectangle();		
		double ex = 9.486;
		double ac = rec.calcArea(new Point(0, 0), new Point(2, 3));
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testCalcArea4() {
		rec = new Rectangle();		
		double ex = 2.236;
		double ac = rec.calcArea(new Point(0, 0), new Point(3,1));
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testCalcArea5() {
		rec = new Rectangle();		
		double ex = 1.2;
		double ac = rec.calcArea(new Point(0, 0), new Point(1,1));
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testCalcArea6() {
		rec = new Rectangle();		
		double ex = 4.672;
		double ac = rec.calcArea(new Point(0, 0), new Point(1,2));
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testCalcArea7() {
		rec = new Rectangle();		
		double ex = 8.486;
		double ac = rec.calcArea(new Point(0, 0), new Point(2,3));
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testCalcArea8() {
		rec = new Rectangle();		
		double ex = 5.472;
		double ac = rec.calcArea(new Point(0, 0), new Point(3,2));
		assertEquals(ex, ac, 0.1);
	}

}
