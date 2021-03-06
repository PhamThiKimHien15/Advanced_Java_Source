package phamThiKimHien.source;
/*
 * Author: Pham Thi Kim Hien
 * Date : 8/19/2016
 * Vesion: 1.0
 * 
 * Include functions: calculateTotal() method, calculateSubtraction() method, calculateMultiplication() method and calculateDivision() method
 */
public class Calculus {

	private float firstNumber;
	private float secondNumber;

	public Calculus(float firstNumber, float secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}

	public Calculus() {
		super();
	}

	public float getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(float firstNumber) {
		this.firstNumber = firstNumber;
	}

	public float getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(float secondNumber) {
		this.secondNumber = secondNumber;
	}

	// calcutate add of 2 fields
	// input is firstNumber and secondNumber
	// output is result total of 2 fields
	public double calculateTotal() {
		return firstNumber + secondNumber;
	}

	// calcutate subtract of 2 fields
	// input is firstNumber and secondNumber
	// output is result subtraction of 2 fields
	public double calculateSubtraction() {
		return firstNumber - secondNumber;
	}

	// calcutate multiply of 2 fields
	// input is firstNumber and secondNumber
	// output is result Multiplycation of 2 fields
	public double calculateMultiplication() {
		return firstNumber * secondNumber;
	}

	// calcutate devide of 2 fields
	// input is firstNumber and secondNumber
	// output is result division of 2 fields
	public double calculateDivision() throws ArithmeticException {
		if (secondNumber == 0)
			throw new ArithmeticException("Error: denominator == 0");
		return firstNumber / secondNumber;
	}
}
