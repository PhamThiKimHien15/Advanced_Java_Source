package Ex5_3;
/*
 * Author: Pham Thi Kim Hien
 * Date: 13/9/2016
 * Version: 1.0
 */
public class MaxThread extends Thread {
	private int lo, hi;
	private int[] arr;
	private int max;
	public MaxThread(int lo, int hi, int[] arr) {
		super();
		this.lo = lo;
		this.hi = hi;
		this.arr = arr;
	}
	public int getLo() {
		return lo;
	}
	public void setLo(int lo) {
		this.lo = lo;
	}
	public int getHi() {
		return hi;
	}
	public void setHi(int hi) {
		this.hi = hi;
	}
	public int[] getArr() {
		return arr;
	}
	public void setArr(int[] arr) {
		this.arr = arr;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}	
	@Override
	public void run() {
		this.max = this.lo;
		for (int i = this.lo; i < this.hi; i++) {
			if(this.max < this.arr[i])
				this.max = this.arr[i];
		}
	}
}
