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
 *  Description: Unit Test for updateCD(CD cd) method of CDController class
 */
public class TestUpdateCD {
	CDController cdController = new CDController();
	CD cd ;
	
	/*
	 * input is updateCD(CD cd) method 
	 * output is True / False use assertTrue, assertFalse
	 */
	@Test
	public void testUpdateCD1() {
		cd = new CD(2, 8, 220000);
		cdController.updateCD(cd);
		List<CD> list = new ArrayList<CD>();
		list.add(new CD(2, "Em dung quay ve day", "Trinh Thang Binh", 11, 250000d));
		
		List<CD> list1 = new ArrayList<CD>();
		list1.add(new CD(2, "Em dung quay ve day", "Trinh Thang Binh", 11, 250000d));
		
		boolean ac = true;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(list1.get(i))){
				ac = false;
				break;
			}
		}
		assertFalse(ac);
	}
	
	@Test
	public void testUpdateCD2() {
		cd = new CD(2, 8, 240000);
		cdController.updateCD(cd);
		List<CD> list = new ArrayList<CD>();
		list.add(new CD(2, "Em dung quay ve day", "Trinh Thang Binh", 8, 240000d));
		
		List<CD> list1 = new ArrayList<CD>();
		list1.add(new CD(2, "Em dung quay ve day", "Trinh Thang Binh", 8, 240000d));
		
		boolean ac = true;
		for (int i = 0; i < list.size(); i++) {
			if (!list.get(i).equals(list1.get(i))){
				ac = false;
				break;
			}
		}
		assertTrue(ac);
	}

}
