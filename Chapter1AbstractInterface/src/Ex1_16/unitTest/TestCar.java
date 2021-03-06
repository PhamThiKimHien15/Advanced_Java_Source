package Ex1_16.unitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Ex1_16.source.Car;
import Ex1_16.source.Move;
/*
 * Author: Pham Thi Kim Hien
 * Date: 27/08/2016
 * Version: 1.0
 * 
 * Unit Test for calcFuelCons() method and calcSpeed() method of Car class
 */
public class TestCar {
	Ex1_16.source.Car car;
	/*
	 * input is  calcFuelCons() method
 	 * output is True / False use assertEquals
	 */
	@Test
	public void testCalcFuelCons1() {
		car = new Car(60, 3, 2);
		double ex = 30;
		double ac = car.calcFuelCons();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testCalcFuelCons2() {
		car = new Car(72, 3.5, 3);
		double ex = 24;
		double ac = car.calcFuelCons();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testCalcFuelCons3() {
		car = new Car(110, 4, 8);
		double ex = 13.75;
		double ac = car.calcFuelCons();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testCalcFuelCons4() {
		car = new Car(80, 2, 3);
		double ex = 26.66;
		double ac = car.calcFuelCons();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testCalcFuelCons5() {
		car = new Car(200, 8, 20);
		double ex = 10;
		double ac = car.calcFuelCons();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testCalcFuelCons6() {
		car = new Car(60, 3, 2);
		double ex = 30.14;
		double ac = car.calcFuelCons();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testCalcFuelCons7() {
		car = new Car(72, 3.5, 3);
		double ex = 25;
		double ac = car.calcFuelCons();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testCalcFuelCons8() {
		car = new Car(110, 4, 8);
		double ex = 13.85;
		double ac = car.calcFuelCons();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testCalcFuelCons9() {
		car = new Car(80, 2, 3);
		double ex = 26.68;
		double ac = car.calcFuelCons();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testCalcFuelCons10() {
		car = new Car(200, 8, 20);
		double ex = 10.10;
		double ac = car.calcFuelCons();
		assertEquals(ex, ac, 0.01);
	}
	/*
	 * input is  calcSpeed() method
 	 * output is True / False use assertEquals
	 */
	@Test
	public void testCalcSpeed1() {
		car = new Car(60, 3, 2);
		double ex = 20;
		double ac = car.calcSpeed();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testCalcSpeed2() {
		car = new Car(72, 3.5, 3);
		double ex = 20.57;
		double ac = car.calcSpeed();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testCalcSpeed3() {
		car = new Car(110, 4, 8);
		double ex = 27.5;
		double ac = car.calcSpeed();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testCalcSpeed4() {
		car = new Car(80, 2, 3);
		double ex = 40;
		double ac = car.calcSpeed();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testCalcSpeed5() {
		car = new Car(200, 8, 20);
		double ex = 25;
		double ac = car.calcSpeed();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testCalcSpeed6() {
		car = new Car(60, 3, 2);
		double ex = 20.14;
		double ac = car.calcSpeed();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testCalcSpeed7() {
		car = new Car(72, 3.5, 3);
		double ex = 20.67;
		double ac = car.calcSpeed();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testCalcSpeed8() {
		car = new Car(110, 4, 8);
		double ex = 27.6;
		double ac = car.calcSpeed();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testCalcSpeed9() {
		car = new Car(80, 2, 3);
		double ex = 40.04;
		double ac = car.calcSpeed();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testCalcSpeed10() {
		car = new Car(200, 8, 20);
		double ex = 26;
		double ac = car.calcSpeed();
		assertEquals(ex, ac, 0.01);
	}
}
