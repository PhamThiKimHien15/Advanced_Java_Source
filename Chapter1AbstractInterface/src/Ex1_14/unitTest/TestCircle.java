package Ex1_14.unitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Ex1_14.source.Circle;
/*
 * Author: Pham Thi Kim Hien
 * Date: 24/08/2016
 * Version: 1.0
 * 
 * Unit Test for perimeter() method and Area() method of Circle class
 */
public class TestCircle {
	Ex1_14.source.Circle cir;
	/*
	 * input is  perimeter() method
 	 * output is True / False use assertEquals
	 */
	@Test
	public void testPerimeter1() {
		cir = new Circle(5);
		double ex = 31.4;
		double ac = cir.perimeter();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testPerimeter2() {
		cir = new Circle(2.5);
		double ex = 15.7;
		double ac = cir.perimeter();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testPerimeter3() {
		cir = new Circle(7.6);
		double ex = 47.728;
		double ac = cir.perimeter();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testPerimeter4() {
		cir = new Circle(0);
		double ex = 0;
		double ac = cir.perimeter();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testPerimeter5() {
		cir = new Circle(1);
		double ex = 6.28;
		double ac = cir.perimeter();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testPerimeter6() {
		cir = new Circle(5);
		double ex = 31.6;
		double ac = cir.perimeter();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testPerimeter7() {
		cir = new Circle(2.5);
		double ex = 15;
		double ac = cir.perimeter();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testPerimeter8() {
		cir = new Circle(7.6);
		double ex = 47.928;
		double ac = cir.perimeter();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testPerimeter9() {
		cir = new Circle(0);
		double ex = 3.14;
		double ac = cir.perimeter();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testPerimeter10() {
		cir = new Circle(1);
		double ex = 6.48;
		double ac = cir.perimeter();
		assertEquals(ex, ac, 0.1);
	}
	/*
	 * input is  Area() method
 	 * output is True / False use assertEquals
 	 * 
	 */
	@Test
	public void testArea1() {
		cir = new Circle(5);
		double ex = 78.5;
		double ac = cir.area();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testArea2() {
		cir = new Circle(2.5);
		double ex = 19.625;
		double ac = cir.area();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testArea3() {
		cir = new Circle(7.6);
		double ex = 181.4664;
		double ac = cir.area();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testArea4() {
		cir = new Circle(0);
		double ex = 0;
		double ac = cir.area();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testArea5() {
		cir = new Circle(1);
		double ex = 3.14;
		double ac = cir.area();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testArea6() {
		cir = new Circle(5);
		double ex =78.7;
		double ac = cir.area();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testArea7() {
		cir = new Circle(2.5);
		double ex = 18.625;
		double ac = cir.area();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testArea8() {
		cir = new Circle(7.6);
		double ex = 181.5664;
		double ac = cir.area();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testArea9() {
		cir = new Circle(0);
		double ex = 3.14;
		double ac = cir.area();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testArea10() {
		cir = new Circle(1);
		double ex = 0;
		double ac = cir.area();
		assertEquals(ex, ac, 0.1);
	}
}
