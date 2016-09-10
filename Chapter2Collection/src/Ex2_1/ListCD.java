package Ex2_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
 * Author: Pham Thi Kim Hien
 * Date: 07/09/2016
 * Version: 1.0
 */
public class ListCD {
	private List<CD> cd;

	public ListCD() {
		this.cd = new ArrayList<CD>();
	}
	// add cd into CD list
	public void addCD(CD cd){
		this.cd.add(cd);
	}
	// sort the list by cd name
	public void listSort() {
		Collections.sort(cd);
	}
	// calculate total amount of all cd
	public double calTotalAmount(){
		double result=0;
		for (int i = 0; i < this.cd.size(); i++) {
			result += this.cd.get(i).getPrice();
		}
		return result;
	}
	
	// show information of all cd
	public void showInfo(){
		for (int i = 0; i < this.cd.size(); i++) {
			this.cd.get(i).showInfo();
		}
		System.out.println("\tToatl amount: " + calTotalAmount());
	}
}
