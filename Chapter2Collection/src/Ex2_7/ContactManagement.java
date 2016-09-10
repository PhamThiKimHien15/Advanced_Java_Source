package Ex2_7;

import java.util.ArrayList;
import java.util.List;
/*
 * Author: Pham Thi Kim Hien
 * Date: 10/9/2016
 * Version: 1.0
 */
public class ContactManagement {
	private List<Contact> list;
	
	public ContactManagement (){
		this.list = new ArrayList<Contact>();
	}
	
	/*
	 *  check the contact already exists before adding contacts to the list
	 *  check based into the function equals of Contact class
	 */
	public boolean checkContact(Contact co){
		for (Contact contact : list) {
			if(contact.equals(co))
				return true;			
		}
		return false;
	}	
	
	/*
	 *  add contacts to the list 
	 *  before adding contacts, check this contact already exists
	 *  if none exists, it allows add contact to the list and vice versa
	 */
	public void addContact(Contact co) {
		if(checkContact(co) == true)
			System.out.println("contact already exists");
		else{
			this.list.add(co);
		}
	}
	
	// search contact by name
	public Contact searchContact(String name) {
		for (Contact contact : list) {
			if(contact.getName().equalsIgnoreCase(name))
				return contact;
		}
		return null;
	}
	
	// show contact before delete contact
	public Contact showInfoBeforeDelete(String nameOrNumPhone) {
		for (Contact contact : list) {
			if(contact.getName().equals(nameOrNumPhone))
				return contact;
			else if (contact.getNumPhone().equals(nameOrNumPhone))
				return contact;
		}
		return null;
	}
	
	// delete contact by name or number phone
	public boolean deleteContact(String nameOrNumPhone) {
		for (Contact contact : list) {
			if(contact.getName().equals(nameOrNumPhone))
				return list.remove(contact);
			else if (contact.getNumPhone().equals(nameOrNumPhone))
				return list.remove(contact);
		}
		return false;
	}
	
	// Update number phone by name of contact 
	public boolean updateContact(String name, String number) {
		for (Contact contact : list) {
			if(contact.getName().equals(name)){
				contact.setNumPhone(number);
			}
		}
		return false;
	}
	
	// show all contact
	public void showInfo (){
		for (Contact contact: list){
			System.out.println(contact.toString());
		}
	}
	
	
	
}
