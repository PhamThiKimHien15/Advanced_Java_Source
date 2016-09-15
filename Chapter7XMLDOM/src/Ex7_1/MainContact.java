package Ex7_1;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class MainContact {
	public static void main(String[] args) {
		Contact contact = new Contact();
		// create and write contact.xml file
		createFlie();
		
		
	}

	private static void createFlie() {
		try {
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			
			// root elements
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("contacts");
			doc.appendChild(rootElement);
			
		} catch (ParserConfigurationException e) {
			System.err.println(e.getMessage());
		}
	}
}
