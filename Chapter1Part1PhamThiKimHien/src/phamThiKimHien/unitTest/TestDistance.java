package phamThiKimHien.unitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import phamThiKimHien.source.Distance;
import phamThiKimHien.source.Point;
/*
 * Author: Pham Thi Kim Hien
 * Date: 08/21/2016
 * Version: 1.0
 * 
 * Unit Test for calcDistance() method of Distance class
 */
public class TestDistance {
	phamThiKimHien.source.Distance dis;
	Point pointA;
	Point pointB;
	@Test
	public void test1() {
		dis = new Distance();
		pointA = new Point(1, 3);
		pointB = new Point(2, 4);
		double ex = 1.4142;
		double ac = dis.calcDistance(pointA, pointB);
		assertEquals(ex, ac, 0.001);
	}
	@Test
	public void test2() {
		dis = new Distance();
		pointA = new Point(-1, -1);
		pointB = new Point(-3, -3);
		double ex = 2.828;
		double ac = dis.calcDistance(pointA, pointB);
		assertEquals(ex, ac, 0.001);
	}
	@Test
	public void test3() {
		dis = new Distance();
		pointA = new Point(4, 5);
		pointB = new Point(8, 9);
		double ex = 5.657;
		double ac = dis.calcDistance(pointA, pointB);
		assertEquals(ex, ac, 0.001);
	}
	@Test
	public void test4() {
		dis = new Distance();
		pointA = new Point(1, 1);
		pointB = new Point(2, 2);
		double ex = 1;
		double ac = dis.calcDistance(pointA, pointB);
		assertEquals(ex, ac, 0.001);
	}
	@Test
	public void test5() {
		dis = new Distance();
		pointA = new Point(1, 1);
		pointB = new Point(2, 2);
		double ex = 1;
		double ac = dis.calcDistance(pointA, pointB);
		assertEquals(ex, ac, 0.001);
	}
	@Test
	public void test6() {
		dis = new Distance();
		pointA = new Point(0, 0);
		pointB = new Point(0, 0);
		double ex = -1;
		double ac = dis.calcDistance(pointA, pointB);
		assertEquals(ex, ac, 0.001);
	}
}
