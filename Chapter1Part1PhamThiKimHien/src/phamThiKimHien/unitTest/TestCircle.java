package phamThiKimHien.unitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import phamThiKimHien.source.Circle;
/*
 * Author: Pham Thi Kim Hien
 * Date: 19/08/2016
 * Version: 1.0
 * 
 * Unit Test for calculatePerimeter() method and calculateArea() method of Circle class
 */
public class TestCircle {
	phamThiKimHien.source.Circle cir;
	// input is object of Circle class, and use calculatePerimeter() method
	// output is True/False use assertEquals
	@Test
	public void testCalcPerimeter1() {
		cir = new Circle(2);
		double ex = 12.56;
		double ac = cir.calculatePerimeter();
		assertEquals(ex, ac, 0.001);
	}
	@Test
	public void testCalcPerimeter2() {
		cir = new Circle(2.5);
		double ex = 15.7;
		double ac = cir.calculatePerimeter();
		assertEquals(ex, ac, 0.001);
	}
	@Test
	public void testCalcPerimeter3() {
		cir = new Circle(1.2);
		double ex = 7.536;
		double ac = cir.calculatePerimeter();
		assertEquals(ex, ac, 0.001);
	}
	@Test
	public void testCalcPerimeter4() {
		cir = new Circle(0);
		double ex = 0;
		double ac = cir.calculatePerimeter();
		assertEquals(ex, ac, 0.001);
	}
	@Test
	public void testCalcPerimeter5() {
		cir = new Circle(1);
		double ex = 6.28;
		double ac = cir.calculatePerimeter();
		assertEquals(ex, ac, 0.001);
	}
	@Test
	public void testCalcPerimeter6() {
		cir = new Circle(2);
		double ex = 12.5;
		double ac = cir.calculatePerimeter();
		assertEquals(ex, ac, 0.001);
	}
	@Test
	public void testCalcPerimeter7() {
		cir = new Circle(9);
		double ex = 9;
		double ac = cir.calculatePerimeter();
		assertEquals(ex, ac, 0.001);
	}
	@Test
	public void testCalcPerimeter8() {
		cir = new Circle(1.2);
		double ex = 7.5;
		double ac = cir.calculatePerimeter();
		assertEquals(ex, ac, 0.001);
	}
	@Test
	public void testCalcPerimeter9() {
		cir = new Circle(0);
		double ex = -1;
		double ac = cir.calculatePerimeter();
		assertEquals(ex, ac, 0.001);
	}
	@Test
	public void testCalcPerimeter10() {
		cir = new Circle(1);
		double ex = 3.2;
		double ac = cir.calculatePerimeter();
		assertEquals(ex, ac, 0.001);
	}
	// input is object of Circle class, and use calculateArea() method
	// output is True/False use assertTrue / assertFalse
	@Test
	public void testCalcArea1() {
		cir = new Circle(0);
		double ex = 0;
		double ac = cir.calculateArea();
		assertEquals(ex, ac, 0.001);
	}
	@Test
	public void testCalcArea2() {
		cir = new Circle(1);
		double ex = 3.1415;
		double ac = cir.calculateArea();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testCalcArea3() {
		cir = new Circle(2);
		double ex = 12.566;
		double ac = cir.calculateArea();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testCalcArea4() {
		cir = new Circle(2.5);
		double ex = 19.634;
		double ac = cir.calculateArea();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testCalcArea5() {
		cir = new Circle(1.2);
		double ex = 7.5;
		double ac = cir.calculateArea();
		assertEquals(ex, ac, 0.001);
	}
	@Test
	public void testCalcArea6() {
		cir = new Circle(1);
		double ex = 3.2;
		double ac = cir.calculateArea();
		assertEquals(ex, ac, 0.001);
	}
	@Test
	public void testCalcArea7() {
		cir = new Circle(0);
		double ex = -1;
		double ac = cir.calculateArea();
		assertEquals(ex, ac, 0.001);
	}
	@Test
	public void testCalcArea8() {
		cir = new Circle(9);
		double ex = 9;
		double ac = cir.calculateArea();
		assertEquals(ex, ac, 0.001);
	}
}
