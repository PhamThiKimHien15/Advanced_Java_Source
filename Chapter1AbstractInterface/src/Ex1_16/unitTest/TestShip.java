package Ex1_16.unitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Ex1_16.source.Ship;
/*
 * Author: Pham Thi Kim Hien
 * Date: 27/08/2016
 * Version: 1.0
 * 
 * Unit Test for calcFuelCons() method and calcSpeed() method of Ship class
 */
public class TestShip {
	Ex1_16.source.Ship ship;
	/*
	 * input is  calcFuelCons() method
 	 * output is True / False use assertEquals
	 */ 
	@Test
	public void testCalcFuelCons1() {
		ship =  new Ship(60, 3, 4, 0.5);
		double ex = 17.14;
		double ac = ship.calcFuelCons();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testCalcFuelCons2() {
		ship =  new Ship(72, 3.5, 3, 0.4);
		double ex = 27.69;
		double ac = ship.calcFuelCons();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testCalcFuelCons3() {
		ship =  new Ship(110, 4, 8, 0.7);
		double ex = 15.06;
		double ac = ship.calcFuelCons();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testCalcFuelCons4() {
		ship =  new Ship(80, 2, 3, 0.7);
		double ex = 34.78;
		double ac = ship.calcFuelCons();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testCalcFuelCons5() {
		ship =  new Ship(200, 8, 20, 0.3);
		double ex = 10.15;
		double ac = ship.calcFuelCons();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testCalcFuelCons6() {
		ship =  new Ship(60, 3, 4, 0.5);
		double ex = 17.16;
		double ac = ship.calcFuelCons();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testCalcFuelCons7() {
		ship =  new Ship(72, 3.5, 3, 0.4);
		double ex = 28;
		double ac = ship.calcFuelCons();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testCalcFuelCons8() {
		ship =  new Ship(110, 4, 8, 0.7);
		double ex = 15.16;
		double ac = ship.calcFuelCons();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testCalcFuelCons9() {
		ship =  new Ship(80, 2, 3, 0.7);
		double ex = 34.95;
		double ac = ship.calcFuelCons();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testCalcFuelCons10() {
		ship =  new Ship(200, 8, 20, 0.3);
		double ex = 10.22;
		double ac = ship.calcFuelCons();
		assertEquals(ex, ac, 0.01);
	}
	/*
	 * input is  calcSpeed() method
 	 * output is True / False use assertEquals
	 */ 
	@Test
	public void testCalcSpeed1() {
		ship =  new Ship(60, 3, 4, 10, 5);
		double ex = 25;
		double ac = ship.calcSpeed();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testCalcSpeed2() {
		ship =  new Ship(72, 3.5, 3, 7, 3);
		double ex = 24.57;
		double ac = ship.calcSpeed();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testCalcSpeed3() {
		ship =  new Ship(110, 4, 8, 5, 2);
		double ex = 30.5;
		double ac = ship.calcSpeed();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testCalcSpeed4() {
		ship =  new Ship(80, 2, 3, 8, 5);
		double ex = 43;
		double ac = ship.calcSpeed();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testCalcSpeed5() {
		ship =  new Ship(200, 8, 20, 5.5, 3.5);
		double ex = 27;
		double ac = ship.calcSpeed();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testCalcSpeed6() {
		ship =  new Ship(60, 3, 4, 10, 5);
		double ex = 25.5;
		double ac = ship.calcSpeed();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testCalcSpeed7() {
		ship =  new Ship(72, 3.5, 3, 7, 3);
		double ex = 24.675;
		double ac = ship.calcSpeed();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testCalcSpeed8() {
		ship =  new Ship(110, 4, 8, 5, 2);
		double ex = 30.64;
		double ac = ship.calcSpeed();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testCalcSpeed9() {
		ship =  new Ship(80, 2, 3, 8, 5);
		double ex = 43.15;
		double ac = ship.calcSpeed();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testCalcSpeed10() {
		ship =  new Ship(200, 8, 20, 5.5, 3.5);
		double ex = 28;
		double ac = ship.calcSpeed();
		assertEquals(ex, ac, 0.01);
	}
}
