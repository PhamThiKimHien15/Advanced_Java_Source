package Ex1_14.unitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Ex1_14.source.Square;
/*
 * Author: Pham Thi Kim Hien
 * Date: 24/08/2016
 * Version: 1.0
 * 
 * Unit Test for perimeter() method and Area() method of Square class
 */
public class testSquare {
	Ex1_14.source.Square sq;
	/*
	 * input is perimeter() method
	 * output is True / False use assertEquals
	 */
	@Test
	public void testPerimeter1() {
		sq = new Square(4);
		double ex = 16; 
		double ac = sq.perimeter();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testPerimeter2() {
		sq = new Square(2.5);
		double ex = 10; 
		double ac = sq.perimeter();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testPerimeter3() {
		sq = new Square(3.2);
		double ex = 12.8; 
		double ac = sq.perimeter();
		assertEquals(ex, ac, 0.1);
	}	
	@Test
	public void testPerimeter4() {
		sq = new Square(8.4);
		double ex = 33.6; 
		double ac = sq.perimeter();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testPerimeter5() {
		sq = new Square(0);
		double ex = 0; 
		double ac = sq.perimeter();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testPerimeter6() {
		sq = new Square(4);
		double ex = 15; 
		double ac = sq.perimeter();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testPerimeter7() {
		sq = new Square(2.5);
		double ex = 11; 
		double ac = sq.perimeter();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testPerimeter8() {
		sq = new Square(3.2);
		double ex = 12.101; 
		double ac = sq.perimeter();
		assertEquals(ex, ac, 0.1);
	}	
	@Test
	public void testPerimeter9() {
		sq = new Square(8.4);
		double ex = 33.4; 
		double ac = sq.perimeter();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testPerimeter10() {
		sq = new Square(0);
		double ex = 4; 
		double ac = sq.perimeter();
		assertEquals(ex, ac, 0.1);
	}
	/*
	 * input is area() method
	 * output is True / False use assertEquals
	 */
	@Test
	public void testArea1() {
		sq = new Square(4);
		double ex = 16; 
		double ac = sq.area();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testArea2() {
		sq = new Square(2.5);
		double ex = 6.25; 
		double ac = sq.area();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testArea3() {
		sq = new Square(3.2);
		double ex = 10.24; 
		double ac = sq.area();
		assertEquals(ex, ac, 0.1);
	}	
	@Test
	public void testArea4() {
		sq = new Square(8.4);
		double ex = 70.56; 
		double ac = sq.area();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testArea5() {
		sq = new Square(0);
		double ex = 0; 
		double ac = sq.area();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testArea6() {
		sq = new Square(4);
		double ex = 16.21; 
		double ac = sq.area();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testArea7() {
		sq = new Square(2.5);
		double ex = 6.45; 
		double ac = sq.area();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testArea8() {
		sq = new Square(3.2);
		double ex = 10.42; 
		double ac = sq.perimeter();
		assertEquals(ex, ac, 0.1);
	}	
	@Test
	public void testArea9() {
		sq = new Square(8.4);
		double ex = 70.76; 
		double ac = sq.perimeter();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testArea10() {
		sq = new Square(0);
		double ex = 4; 
		double ac = sq.perimeter();
		assertEquals(ex, ac, 0.1);
	}
}










