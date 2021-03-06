package phamThiKimHien.unitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import phamThiKimHien.source.Calculus;

/*
 * Author: Pham Thi Kim Hien
 * Date: 19/08/2016
 * Version: 1.0
 * 
 * Unit Test for calculateTotal() method, calculateSubtraction() method, calculateMultiplication() method and calculateDivision() method of Calculus() class
 */

public class TestCalculus {

	// input is object of calculus class, and use calculateTotal() method
	// output is True use assertTrue / assertFalse
	@Test
	public void testCalculateTotal1() {
		phamThiKimHien.source.Calculus cal = new Calculus(5, 6);
		assertTrue(cal.calculateTotal() == 11);
	}

	@Test
	public void testCalculateTotal2() {
		phamThiKimHien.source.Calculus cal = new Calculus(4, 6);
		assertFalse(cal.calculateTotal() == 9);
	}

	@Test
	public void testCalculateTotal3() {
		phamThiKimHien.source.Calculus cal = new Calculus(0, (float) 6.5);
		assertTrue(cal.calculateTotal() == 6.5);
	}

	@Test
	public void testCalculateTotal4() {
		phamThiKimHien.source.Calculus cal = new Calculus(0, -1);
		assertTrue(cal.calculateTotal() == -1);
	}

	@Test
	public void testCalculateTotal5() {
		phamThiKimHien.source.Calculus cal = new Calculus(0, 0);
		assertFalse(cal.calculateTotal() == -1);
	}

	// input is object of calculus class, and use calculateSubtraction() method
	// output is True use assertTrue / assertFalse
	@Test
	public void testCalculateSubtraction1() {
		phamThiKimHien.source.Calculus cal = new Calculus(0, 0);
		assertFalse(cal.calculateSubtraction() == -1);
	}

	@Test
	public void testCalculateSubtraction2() {
		phamThiKimHien.source.Calculus cal = new Calculus(1, 2);
		assertTrue(cal.calculateSubtraction() == -1);
	}

	@Test
	public void testCalculateSubtraction3() {
		phamThiKimHien.source.Calculus cal = new Calculus((float) 2.5, (float) 6.5);
		assertFalse(cal.calculateSubtraction() == 4);
	}

	@Test
	public void testCalculateSubtraction4() {
		phamThiKimHien.source.Calculus cal = new Calculus(125, 142);
		assertTrue(cal.calculateSubtraction() == -17);
	}

	@Test
	public void testCalculateSubtraction5() {
		phamThiKimHien.source.Calculus cal = new Calculus(0, 0);
		assertFalse(cal.calculateSubtraction() == -1);
	}

	// input is object of calculus class, and use calculateMultiplication() method
	// output is True use assertTrue / assertFalse
	@Test
	public void testCalculateMultiplication1() {
		phamThiKimHien.source.Calculus cal = new Calculus(0, 0);
		assertTrue(cal.calculateMultiplication() == 0);
	}

	@Test
	public void testCalculateMultiplication2() {
		phamThiKimHien.source.Calculus cal = new Calculus(5, 6);
		assertTrue(cal.calculateMultiplication() == 30);
	}

	@Test
	public void testCalculateMultiplication3() {
		phamThiKimHien.source.Calculus cal = new Calculus(5, 0);
		assertFalse(cal.calculateMultiplication() == 5);
	}

	@Test
	public void testCalculateMultiplication4() {
		phamThiKimHien.source.Calculus cal = new Calculus(9, 3);
		assertFalse(cal.calculateMultiplication() == 30);
	}

	@Test
	public void testCalculateMultiplication5() {
		phamThiKimHien.source.Calculus cal = new Calculus((float) 2.5, (float) 3.2);
		assertTrue(cal.calculateMultiplication() == 8);
	}

	// input is object of calculus class, and use calculateDivision() method
	// output is True use assertTrue / assertFalse
	@Test
	public void testCalculateDivision1() {
		phamThiKimHien.source.Calculus cal = new Calculus(4, 2);
		assertFalse(cal.calculateDivision() == 8);
	}

	@Test
	public void testCalculateDivision2() {
		phamThiKimHien.source.Calculus cal = new Calculus(4, 2);
		assertTrue(cal.calculateDivision() == 2);
	}

	@Test
	public void testCalculateDivision3() {
		phamThiKimHien.source.Calculus cal = new Calculus(6, 2);
		assertFalse(cal.calculateDivision() == 2);
	}

	@Test
	public void testCalculateDivision4() {
		phamThiKimHien.source.Calculus cal = new Calculus(6, 2);
		assertTrue(cal.calculateDivision() == 3);
	}
}
