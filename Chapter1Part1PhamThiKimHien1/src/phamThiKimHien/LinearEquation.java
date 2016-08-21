package phamThiKimHien;

public class LinearEquation {

	private int a;
	private int b;
	public LinearEquation(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	// solve for Linear Equation
	// input is fields depend on class
	// output is type double
	public double solveEquation() {
		double result = 0;
		if (a == 0){
			if (b == 0){
				result = -1.1111;
			}else{
				result = -1.0001;
			}
		}else{
			result = (double)(-b) / a;
		}
		return result;
		
	}
}
