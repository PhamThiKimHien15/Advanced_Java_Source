package phamThiKimHien.unitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import phamThiKimHien.source.Employee;
/*
 * Author: Pham Thi Kim Hien
 * Date: 19/08/2016
 * Version: 1.0
 * 
 * Unit Test for calcOfIncome() method and calcOfTaxIncome() method and calcTaxTNCN() method of Employee class
 */
public class TestEmployee {
	phamThiKimHien.source.Employee epl;
	// input is object of Employee class, and use calcOfIncome() method
	// output is True/False use assertEquals
	@Test
	public void testCalcOfIncome1() {
		epl = new Employee("A",5,2,15000000);
		double ex= 21300000;
		double ac = epl.calcOfIncome();
		assertEquals(ex, ac, 0);	
	}
	@Test
	public void testCalcOfIncome2() {
		epl = new Employee("A",2.67,1,12000000);
		double ex= 15364200;
		double ac = epl.calcOfIncome();
		assertEquals(ex, ac, 0);	
	}
	@Test
	public void testCalcOfIncome3() {
		epl = new Employee("A",7,2,12000000);
		double ex= 20820000;
		double ac = epl.calcOfIncome();
		assertEquals(ex, ac, 0);	
	}
	@Test
	public void testCalcOfIncome4() {
		epl = new Employee("A",4.5,3,15000000);
		double ex= 20670000;
		double ac = epl.calcOfIncome();
		assertEquals(ex, ac, 0);	
	}
	@Test
	public void testCalcOfIncome5() {
		epl = new Employee("A",5,3,20000000);
		double ex= 26310000;
		double ac = epl.calcOfIncome();
		assertEquals(ex, ac, 0);	
	}
	@Test
	public void testCalcOfIncome6() {
		epl = new Employee("A",2.3,1,10000000);
		double ex= 12899000;
		double ac = epl.calcOfIncome();
		assertEquals(ex, ac, 0);	
	}
	@Test
	public void testCalcOfIncome7() {
		epl = new Employee("A",2.64,2,12500000);
		double ex= 15826500;
		double ac = epl.calcOfIncome();
		assertEquals(ex, ac, 0);	
	}
	@Test
	public void testCalcOfIncome8() {
		epl = new Employee("A",2.35,2,135000000);
		double ex= 21300000;
		double ac = epl.calcOfIncome();
		assertEquals(ex, ac, 0);	
	}
	// input is object of Employee class, and use calcOfTaxIncome() method
	// output is True/False use assertEquals
	@Test
	public void testcCalcOfTaxIncome1() {
		epl = new Employee("A",5,2,15000000);
		double ex= 5100000;
		double ac = epl.calcOfTaxIncome();
		assertEquals(ex, ac, 0);	
	}
	@Test
	public void testcCalcOfTaxIncome2() {
		epl = new Employee("A",2.67,1,12000000);
		double ex= 2764200;
		double ac = epl.calcOfTaxIncome();
		assertEquals(ex, ac, 0);	
	}
	@Test
	public void testcCalcOfTaxIncome3() {
		epl = new Employee("A",7,2,12000000);
		double ex= 4620000;
		double ac = epl.calcOfTaxIncome();
		assertEquals(ex, ac, 0);	
	}
	@Test
	public void testcCalcOfTaxIncome4() {
		epl = new Employee("A",4.5,3,15000000);
		double ex= 870000;
		double ac = epl.calcOfTaxIncome();
		assertEquals(ex, ac, 0);	
	}
	@Test
	public void testcCalcOfTaxIncome5() {
		epl = new Employee("A",5,3,20000000);
		double ex= 6510000;
		double ac = epl.calcOfTaxIncome();
		assertEquals(ex, ac, 0);	
	}
	@Test
	public void testcCalcOfTaxIncome6() {
		epl = new Employee("A",2.3,1,10000000);
		double ex= 298100;
		double ac = epl.calcOfTaxIncome();
		assertEquals(ex, ac, 0);	
	}
	@Test
	public void testcCalcOfTaxIncome7() {
		epl = new Employee("A",2.64,2,12500000);
		double ex= 3700000;
		double ac = epl.calcOfTaxIncome();
		assertEquals(ex, ac, 0);	
	}
	@Test
	public void testcCalcOfTaxIncome8() {
		epl = new Employee("A",2.35,2,135000000);
		double ex= 121761000;
		double ac = epl.calcOfTaxIncome();
		assertEquals(ex, ac, 0);	
	}
	// input is object of Employee class, and use calcTaxTNCN() method
	// output is True/False use assertEquals
	@Test
	public void testCalcTaxTNCN1() {
		epl = new Employee("A",5,2,15000000);
		double ex= 210000;
		double ac = epl.calcTaxTNCN();
		assertEquals(ex, ac, 0);	
	}
	@Test
	public void testCalcTaxTNCN2() {
		epl = new Employee("A",2.67,1,12000000);
		double ex= 138210;
		double ac = epl.calcTaxTNCN();
		assertEquals(ex, ac, 0);	
	}
	@Test
	public void testCalcTaxTNCN3() {
		epl = new Employee("A",7,2,12000000);
		double ex= 231000;
		double ac = epl.calcTaxTNCN();
		assertEquals(ex, ac, 0);	
	}
	@Test
	public void testCalcTaxTNCN4() {
		epl = new Employee("A",4.5,3,15000000);
		double ex= 43500;
		double ac = epl.calcTaxTNCN();
		assertEquals(ex, ac, 0);	
	}
	@Test
	public void testCalcTaxTNCN5() {
		epl = new Employee("A",5,3,20000000);
		double ex= 355000;
		double ac = epl.calcTaxTNCN();
		assertEquals(ex, ac, 0);	
	}
	@Test
	public void testCalcTaxTNCN6() {
		epl = new Employee("A",2.3,1,10000000);
		double ex= 14910;
		double ac = epl.calcTaxTNCN();
		assertEquals(ex, ac, 0);	
	}
	@Test
	public void testCalcTaxTNCN7() {
		epl = new Employee("A",2.64,2,12500000);
		double ex= 1;
		double ac = epl.calcTaxTNCN();
		assertEquals(ex, ac, 0);	
	}
	@Test
	public void testCalcTaxTNCN8() {
		epl = new Employee("A",2.35,2,135000000);
		double ex= 327163550;
		double ac = epl.calcTaxTNCN();
		assertEquals(ex, ac, 0);	
	}
}
