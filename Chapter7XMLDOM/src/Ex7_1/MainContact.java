package Ex7_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ConcurrentModificationException;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
/*
 * author: Pham Thi Kim Hien
 * Date: 15/9/2016
 * Version: 1.0
*/
public class MainContact {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static String name;
	static String phone;
	public static void main(String[] args) {
		try {
			int ans;
			Contact contact;
			ListContact list = new ListContact();
			// read information of contact from contact.xml into ListContact
			readXML(list);
			do {
				while (true) {
					System.out.println("1. Add contact");
					System.out.println("2. Search contact");
					System.out.println("3. Update contact");
					System.out.println("4. Delete contact");
					System.out.println("5. Show information of contact");
					System.out.println("6. Exit");
					ans = Integer.parseInt(input.readLine());
					if (ans >= 1 && ans <= 6)
						break;
				}				
				switch (ans) {
				case 1:
					// add contact
					System.out.println("Enter name: ");
					name = input.readLine();
					System.out.println("Enter phone: ");
					phone = input.readLine();
					contact = new Contact(name, phone);
					list.addContact(contact);
					break;
				case 2:
					// Search contact
					System.out.println("Enter name or phone need contact: ");
					String nameOrPhone = input.readLine();
					if (list.searchContact(nameOrPhone) != null)
						System.out.println(list.searchContact(nameOrPhone).toString());
					else
						System.out.println("Not found");
					break;
				case 3:
					// Update contact
					System.out.println("Enter name or phone need update: ");
					String nameOrPhone2 = input.readLine();
					if (list.searchContact(nameOrPhone2) != null){
						System.out.println(list.searchContact(nameOrPhone2).toString());
						System.out.println("Enter name need update: ");
						String updateName = input.readLine();
						System.out.println("Enter phone need update: ");
						String updatePhone = input.readLine();
						list.updateContact(updateName, updatePhone, nameOrPhone2);						
					}
					else
						System.out.println("Not found");
					break;
				case 4:
					// Delete contact
					System.out.println("Enter name or phone need delete: ");
					String nameOrPhone3 = input.readLine();
					if (list.searchContact(nameOrPhone3) != null){
						System.out.println(list.searchContact(nameOrPhone3).toString());
						while (true) {
							System.out.println("Do you want to delete?(Y/N): ");
							String chooseDelete = input.readLine();
							if(chooseDelete.equalsIgnoreCase("Y") || chooseDelete.equalsIgnoreCase("N")){
								if (chooseDelete.equalsIgnoreCase("Y")){
									if (list.deleteContact(nameOrPhone3) != false)
										System.out.println("success");
								}
								break;
							}							
						}
					}
					else
						System.out.println("Not found");
					break;
				case 5:
					// Show information of contact					
					list.showInfo();
					break;
				case 6:
					// create and write contact.xml file
					createFlie(list);
					break;
				}
			} while (ans != 6);
			
		} catch (NumberFormatException | IOException | ConcurrentModificationException e) {
			System.err.println(e.getMessage());
		}		
	}

	// create and write into contact.xml file
	private static void createFlie(ListContact list) {
		// existing file
		Path path = Paths.get("src/Ex7_1/contact.xml");
		if(!Files.exists(path)){
			File file = new File("src/Ex7_1/contact.xml");
		}
		
		try {
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			
			// root elements
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("contacts");
			doc.appendChild(rootElement);
			
			List<Contact> list1 = list.list;
			for (int i = 0; i < list1.size(); i++) {
				Contact c = list1.get(i);
				// contact
				Element contact = doc.createElement("contact");
				rootElement.appendChild(contact);
				
				// name contact
				Element name = doc.createElement("name");
				name.appendChild(doc.createTextNode(c.getName()));
				contact.appendChild(name);
				
				// phone contact
				Element phone = doc.createElement("phone");
				phone.appendChild(doc.createTextNode(c.getPhone()));
				contact.appendChild(phone);
			}	
			
			// write the content into xml file			
			TransformerFactory tranformer = TransformerFactory.newInstance();
			Transformer tf = tranformer.newTransformer();
			
			// structure xml file (down line)
			tf.setOutputProperty(OutputKeys.INDENT, "yes");
			tf.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
			
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("src/Ex7_1/contact.xml"));
			tf.transform(source, result);			
		} catch (ParserConfigurationException | TransformerException e) {
			System.err.println(e.getMessage());
		}
	}
	
	// get formation of a node into a contact
	public static Contact getContact(Node node) {
		Contact co = new Contact();
		if (node.getNodeType() == node.ELEMENT_NODE){
			Element element = (Element) node;
			String name = element.getElementsByTagName("name").item(0).getTextContent();
			String phone = element.getElementsByTagName("phone").item(0).getTextContent();
			co = new Contact(name, phone);
		}			
		return co;		
	}
	
	// access file, open file, read and display result
	public static void readXML(ListContact list) {
		File xmlFile = new File("src/Ex7_1/contact.xml");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize();
//			System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
			doc.getDocumentElement().getNodeName();
			NodeList nodeList = doc.getElementsByTagName("contact");
//			System.out.println("Here");
			
			for (int i = 0; i < nodeList.getLength(); i++) {
				list.addContact(getContact(nodeList.item(i)));
				System.out.println(nodeList.item(i).getNodeName());
			}			
			
		} catch (SAXException | IOException | ParserConfigurationException e) {
			System.err.println(e.getMessage());
		}
		
	}
}
