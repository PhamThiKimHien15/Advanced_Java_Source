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
 *  Description: Unit Test for searchCDByName(String name) method of CDController class
 */
public class TestSearchCDByName {
	CDController cdController = new CDController();
	
	/*
	 * input is searchCDByName(String name) method 
	 * output is True / False use assertTrue, assertFalse
	 */
	@Test
	public void testSearchCDByName1() {
		List<CD> list = cdController.searchCDByName("anh");
		
		List<CD> list1 = new ArrayList<CD>();
		list1.add(new CD(6, "Gui anh xa nho", "Bich Phuong", 5, 150000d));
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
	public void testSearchCDByNam6() {
		List<CD> list = cdController.searchCDByName("doi");
		
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
	
	@Test
	public void testSearchCDByName2() {
		List<CD> list = cdController.searchCDByName("anh");
		
		List<CD> list1 = new ArrayList<CD>();
		list1.add(new CD(6, "Gui anh xa nho", "Bich Phuong", 5, 150000d));
		list1.add(new CD(7, "Co anh o day roi", "Trinh Quang Minh", 6, 160000d));
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
	
	@Test
	public void testSearchCDByName3() {
		List<CD> list = cdController.searchCDByName("anh xa");
		
		List<CD> list1 = new ArrayList<CD>();
		list1.add(new CD(6, "Gui anh xa nho", "Bich Phuong", 5, 150000d));
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
	public void testSearchCDByName4() {
		List<CD> list = cdController.searchCDByName("anh xa");
		
		List<CD> list1 = new ArrayList<CD>();
		list1.add(new CD(6, "Gui anh xa nho", "Bich Phuong", 5, 150000d));
		list1.add(new CD(7, "Co anh o day roi", "Trinh Quang Minh", 6, 160000d));
		list1.add(new CD(1, "Em dung quay ve day", "Trinh Thang Binh", 11, 250000d));
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
	public void testSearchCDByName6() {
		List<CD> list = cdController.searchCDByName("em");
		
		List<CD> list1 = new ArrayList<CD>();
		list1.add(new CD(6, "Gui anh xa nho", "Bich Phuong", 5, 150000d));
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
}
