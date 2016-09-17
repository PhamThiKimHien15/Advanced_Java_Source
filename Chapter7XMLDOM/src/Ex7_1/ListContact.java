package Ex7_1;

import java.util.ArrayList;
import java.util.List;
/*
 * author: Pham Thi Kim Hien
 * Date: 15/9/2016
 * Version: 1.0
*/
public class ListContact {
	public List<Contact> list;
	
	public ListContact(){
		this.list = new ArrayList<Contact>();
	}
	
	/*
	 *  check the contact already exists before adding contacts to the list
	 *  check based into the function equals of Contact class
	 */
	public boolean checkContact(Contact co) {
		for (Contact contact : list) {
			if (contact.equals(co))
				return true;
		}
		return false;
	}
	
	// add contact
	public void addContact(Contact co) {
		if (checkContact(co) == true)
			System.out.println("contact already exists");
		else{
			this.list.add(co);
		}
	}
	
	// show information of contact
	public void showInfo() {
		for (Contact contact : list) {
			System.out.println(contact.toString());
		}
	}
	
	// search contact by name or phone
	public Contact searchContact(String nameOrPhone) {
		for (Contact contact : list) {
			if (contact.getName().equalsIgnoreCase(nameOrPhone))
				return contact;
			else if (contact.getPhone().equalsIgnoreCase(nameOrPhone))
				return contact;
		}
		return null;
	}
	
	// update contact
	public void updateContact(String name, String phone, String nameOrPhone) {
		for (Contact contact : list) {
			if (contact.getName().equalsIgnoreCase(nameOrPhone) || contact.getPhone().equalsIgnoreCase(nameOrPhone)){
				contact.setName(name);
				contact.setPhone(phone);
			}
		}
	}
	
	//delete contact
	public boolean deleteContact(String nameOrPhone) {
		for (Contact contact : list) {
			if (contact.getName().equalsIgnoreCase(nameOrPhone) || contact.getPhone().equalsIgnoreCase(nameOrPhone)){
				return list.remove(contact);
			}
		}
		return false;
	}
}











