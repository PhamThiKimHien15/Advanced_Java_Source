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
 *  Description: Unit Test for searchCDBySinger(String singer) method of CDController class
 */
public class TestSearchCDBySinger {
	CDController cdController = new CDController();

	/*
	 * input is searchCDBySinger(String singer) method 
	 * output is True / False use assertTrue, assertFalse
	 */
	@Test
	public void testSearchCDBySinger1() {
		List<CD> list = cdController.searchCDBySinger("trinh");
		
		List<CD> list1 = new ArrayList<CD>();
		list1.add(new CD(2, "Em dung quay ve day", "Trinh Thang Binh", 8, 240000d));
		list1.add(new CD(7, "Co anh o day roi", "Trinh Quang Minh", 6, 160000d));
		
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
	public void testSearchCDBySinger2() {
		List<CD> list = cdController.searchCDBySinger("trinh quang");
		
		List<CD> list1 = new ArrayList<CD>();
		list1.add(new CD(2, "Em dung quay ve day", "Trinh Thang Binh", 11, 250000d));
		list1.add(new CD(7, "Co anh o day roi", "Trinh Quang Minh", 6, 160000d));
		
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
	public void testSearchCDBySinger3() {
		List<CD> list = cdController.searchCDBySinger("the men");
		
		List<CD> list1 = new ArrayList<CD>();
		list1.add(new CD(4, "Mot ai do khac", "The men", 10, 250000d));
		
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
	public void testSearchCDBySinger4() {
		List<CD> list = cdController.searchCDBySinger("the men");
		
		List<CD> list1 = new ArrayList<CD>();
		list1.add(new CD(4, "Mot ai do khac", "The men", 10, 250000d));
		list1.add(new CD(7, "Co anh o day roi", "Trinh Quang Minh", 6, 160000d));
		
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
	public void testSearchCDBySinger5() {
		List<CD> list = cdController.searchCDBySinger("Noo Phuoc Thinh");
		
		List<CD> list1 = new ArrayList<CD>();
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
}
