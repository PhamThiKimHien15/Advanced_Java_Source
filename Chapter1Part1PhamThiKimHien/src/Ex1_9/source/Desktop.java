package Ex1_9.source;

/*
 * Author: Pham Thi Kim Hien
 * Date: 22/08/2016
 * Version: 1.0
 * 
 * Use to manage information of Desktop
 */
public class Desktop extends Computer {

	private String cPU;
	private String ram;

	public Desktop(String id, double price, String manufac, int number,
			String cPU, String ram) {
		super(id, price, manufac, number);
		this.cPU = cPU;
		this.ram = ram;
	}

	public Desktop() {
		super();
	}

	public String getcPU() {
		return cPU;
	}

	public void setcPU(String cPU) {
		this.cPU = cPU;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

}
