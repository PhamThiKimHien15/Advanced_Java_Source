package phamThiKimHien.unitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import phamThiKimHien.source.LinearEquation;

public class TestLinearEquation {

	// unit test for LinearEquation class
	// input is object of LinearEquation class, and use LinearEquation() method
	// output is True use assertTrue / assertFalse
	@Test
	public void test1() {
		phamThiKimHien.source.LinearEquation le = new LinearEquation(1, -1);
		assertTrue(le.solveEquation() == 1);
	}

	@Test
	public void test2() {
		phamThiKimHien.source.LinearEquation le = new LinearEquation(0, -1);
		assertTrue(le.solveEquation() == -1.0001);
	}

	@Test
	public void test3() {
		phamThiKimHien.source.LinearEquation le = new LinearEquation(0, 0);
		assertTrue(le.solveEquation() == -1.1111);
	}

	@Test
	public void test4() {
		phamThiKimHien.source.LinearEquation le = new LinearEquation(2, -1);
		assertTrue(le.solveEquation() == 0.5);
	}

	@Test
	public void test5() {
		phamThiKimHien.source.LinearEquation le = new LinearEquation(2, 4);
		assertTrue(le.solveEquation() == -2);
	}

	@Test
	public void test6() {
		phamThiKimHien.source.LinearEquation le = new LinearEquation(1, -1);
		assertFalse(le.solveEquation() == -1);
	}

	@Test
	public void test7() {
		phamThiKimHien.source.LinearEquation le = new LinearEquation(0, -1);
		assertFalse(le.solveEquation() == -1.1111);
	}
	
	@Test
	public void test8() {
		phamThiKimHien.source.LinearEquation le = new LinearEquation(0, 0);
		assertFalse(le.solveEquation() == -1.0001);
	}
	
	@Test
	public void test9() {
		phamThiKimHien.source.LinearEquation le = new LinearEquation(2, -1);
		assertFalse(le.solveEquation() == -0.5);
	}

}
