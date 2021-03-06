package Ex6_4;

import java.io.Serializable;

/*
 * author: Pham Thi Kim Hien
 * date: 14/09/2016
 * Version: 1.0
 *
 * Include functions: calcOfIncome() method, calcOfTaxIncome() method, calcTaxTNCN() method and calcRealSalary() method
 */
public class Employee implements Serializable {

	private final double TAXINCOME1 = 4000000;
	private final double TAXINCOME2 = 5000000;
	private final double TAXINCOME3 = 8000000;
	private final double TAXINCOME4 = 14000000;
	private final double TAXINCOME5 = 20000000;
	private final double TAXINCOME6 = 28000000;
	private final double TAX1 = 0.05;
	private final double TAX2 = 0.1;
	private final double TAX3 = 0.15;
	private final double TAX4 = 0.2;
	private final double TAX5 = 0.25;
	private final double TAX6 = 0.3;
	private final double TAX7 = 0.35;
	protected final double BASICSALARY = 1260000;
	
	
	protected String name;
	protected double ceoSalary;
	protected int numOfPeople;
	protected double subsidize;
	
	public Employee(String name, double ceoSalary, int numOfPeople,
			double subsidize) {
		super();
		this.name = name;
		this.ceoSalary = ceoSalary;
		this.numOfPeople = numOfPeople;
		this.subsidize = subsidize;
	}
	
	public Employee() {
		super();
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCeoSalary() {
		return ceoSalary;
	}
	public void setCeoSalary(double ceoSalary) {
		this.ceoSalary = ceoSalary;
	}
	public int getNumOfPeople() {
		return numOfPeople;
	}
	public void setNumOfPeople(int numOfPeople) {
		this.numOfPeople = numOfPeople;
	}
	public double getSubsidize() {
		return subsidize;
	}
	public void setSubsidize(double subsidize) {
		this.subsidize = subsidize;
	}
	// calculated about the Income
	// input is ceoSalary, BASICSALARY, subsidize
	// output is result of the income calculation
	public double calcOfIncome() {
		return (ceoSalary*BASICSALARY + subsidize);
	}
	// calculated about the Income Tax
	// input is numOfPeople and result return of calcOfIncome() method
	// output is result of the Tax income calculation
	public double calcOfTaxIncome() {
		if ((calcOfIncome() - 9000000 - numOfPeople*3600000) > 0)
			return calcOfIncome() - 9000000 - numOfPeople*3600000;
		else
			return 0;
	}
	// calculated about the TNCN Tax
	// input is result return of calcOfTaxIncome() method and fields depend on class
	// output is result of the TNCN Tax calculation
	public double calcTaxTNCN() {
		double result = 0;
		if(calcOfTaxIncome() >= 80000000)
			result = (calcOfTaxIncome() - 80000000)*TAX7 + TAXINCOME6*TAX6 + TAXINCOME5*TAX5 + TAXINCOME4*TAX4 + TAXINCOME3*TAX3 + TAXINCOME2*TAX2+TAXINCOME1*TAX1;
		else if(calcOfTaxIncome() >= 52000000)
			result = (calcOfTaxIncome() - 52000000)*TAX6 + TAXINCOME5*TAX5 + TAXINCOME4*TAX4 + TAXINCOME3*TAX3 + TAXINCOME2*TAX2+TAXINCOME1*TAX1;
		else if(calcOfTaxIncome() >= 32000000)
			result = (calcOfTaxIncome() - 32000000)*TAX5 + TAXINCOME4*TAX4 + TAXINCOME3*TAX3 + TAXINCOME2*TAX2+TAXINCOME1*TAX1;
		else if(calcOfTaxIncome() >= 18000000)
			result = (calcOfTaxIncome() - 18000000)*TAX4 + TAXINCOME3*TAX3 + TAXINCOME2*TAX2+TAXINCOME1*TAX1;
		else if(calcOfTaxIncome() >= 10000000)
			result = (calcOfTaxIncome() - 10000000)*TAX3 + TAXINCOME2*TAX2+TAXINCOME1*TAX1;
		else if(calcOfTaxIncome() >= 5000000)
			result = (calcOfTaxIncome() - 5000000)*TAX2+ TAXINCOME1*TAX1;
		else
			result = calcOfTaxIncome()*TAX1;
		return result;
	}
	// calculate about actual salary of an employee
	// input is result return of calcOfIncome() method and calcTaxTNCN() method
	// output is result of actual salary for an employee
	public double calcRealSalary() {
		return (calcOfIncome() - calcTaxTNCN());
	}
	@Override
	public String toString() {
		return "\tName: " + getName() + "\tSalary coefficient: " + getCeoSalary() + "\tNumber of family allowances: " + getNumOfPeople() + "\tSubsidies: " + getSubsidize() + 
				"\tThe Income: " + String.format("%.2f", calcOfIncome()) + 
				"\tThe Income Tax: " + String.format("%.2f", calcOfTaxIncome()) + 
				"\tThe TNCN Tax: " + String.format("%.2f", calcTaxTNCN())+ 
				"\tReal wage: " + String.format("%.2f", calcRealSalary());
	}
}
