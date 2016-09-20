package ManageCD.TXTFile;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import ManageCD.JDBC.CD;
import ManageCD.JDBC.CDController;

/*
 * 	Author: Pham Thi Kim Hien
 *	Date: 19/09/2016
 *	Version: 1.0
 *  Description: use to read and write cd.txt file by Object Stream(CD)
 */
public class MainText {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// get data from database to the list
		CDController cdController = new CDController();
		List<CD> list = cdController.getAllCD();
		
		// Write CD list into cd.txt file 
		System.out.println("---- Write CD list into cd.txt file -----");
		writeCD(list);
		
		// Show information of cd.txt file
		System.out.println("\n\n---- Show information of cd.txt file-----");
		readCD();		
	}
	
	// Write CD list into cd.txt file 
	private static void readCD() {
		try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("src/ManageCD/TXTFile/cd.txt")))){
			while (true) {
				CD cd = (CD) in.readObject();
				System.out.println(cd.toString());
			}
		} catch ( ClassNotFoundException e) {
			System.err.println(e.getMessage());
		} catch ( IOException e2){}
	}
	
	// Show information of cd.txt file
	private static void writeCD(List<CD> list) {
		try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("src/ManageCD/TXTFile/cd.txt")))) {
			for (CD cd : list) {
				out.writeObject(cd);
			}			
			out.close();
			System.out.println("CD has been written");
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}	
	}

}
















