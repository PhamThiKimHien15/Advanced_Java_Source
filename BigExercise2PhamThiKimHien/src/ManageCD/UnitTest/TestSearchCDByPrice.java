package ManageCD.UnitTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import ManageCD.JDBC.CD;
import ManageCD.JDBC.CDController;

/*
 * 	Author: Pham Thi Kim Hien
 *	Date: 20/09/2016
 *	Version: 1.0
 *  Description: Unit Test for searchCDByPrice(double start, double end) method of CDController class
 */
public class TestSearchCDByPrice {
	CDController cdController = new CDController();
	
	/*
	 * input is searchCDByPrice(double start, double end) method 
	 * output is True / False use assertTrue, assertFalse
	 */
	@Test
	public void testSearchCDByPrice1() {
		List<CD> list = cdController.searchCDByPrice(0, 100000);
		
		List<CD> list1 = new ArrayList<CD>();
		list1.add(new CD(8, "Bon chu lam", "Van Mai Huong", 5, 80000d));
		
		boolean ac = true;
		if (list.size() == list1.size()){
			for (int i = 0; i < list.size(); i++) {
				if(!list.get(i).equals(list1.get(i))){
					ac = false;
					break;
				}
			}
		}else{
			ac = false;
		}		
		assertTrue(ac);
	}
	
	@Test
	public void testSearchCDByPrice2() {
		List<CD> list = cdController.searchCDByPrice(100000, 200000);
		
		List<CD> list1 = new ArrayList<CD>();
		list1.add(new CD(8, "Bon chu lam", "Van Mai Huong", 5, 80000d));
		
		boolean ac = true;
		if (list.size() == list1.size()){
			for (int i = 0; i < list.size(); i++) {
				if(!list.get(i).equals(list1.get(i))){
					ac = false;
					break;
				}
			}
		}else{
			ac = false;
		}		
		assertFalse(ac);
	}
	
	@Test
	public void testSearchCDByPrice3() {
		List<CD> list = cdController.searchCDByPrice(200000, 400000);
		
		List<CD> list1 = new ArrayList<CD>();
		list1.add(new CD(2, "Em dung quay ve day", "Trinh Thang Binh", 8, 240000d));
		list1.add(new CD(4, "Mot ai do khac", "The men", 10, 250000d));
		list1.add(new CD(5, "Goc ban cong", "Vu Cat tuong", 10, 300000d));
		
		boolean ac = true;
		if (list.size() == list1.size()){
			for (int i = 0; i < list.size(); i++) {
				if(!list.get(i).equals(list1.get(i))){
					ac = false;
					break;
				}
			}
		}else{
			ac = false;
		}		
		assertTrue(ac);
	}
	
	@Test
	public void testSearchCDByPrice4() {
		List<CD> list = cdController.searchCDByPrice(400000, 600000);
		
		List<CD> list1 = new ArrayList<CD>();
		list1.add(new CD(2, "Em dung quay ve day", "Trinh Thang Binh", 8, 240000d));
		list1.add(new CD(4, "Mot ai do khac", "The men", 10, 250000d));
		list1.add(new CD(5, "Goc ban cong", "Vu Cat tuong", 10, 300000d));
		
		boolean ac = true;
		if (list.size() == list1.size()){
			for (int i = 0; i < list.size(); i++) {
				if(!list.get(i).equals(list1.get(i))){
					ac = false;
					break;
				}
			}
		}else{
			ac = false;
		}		
		assertFalse(ac);
	}

}
