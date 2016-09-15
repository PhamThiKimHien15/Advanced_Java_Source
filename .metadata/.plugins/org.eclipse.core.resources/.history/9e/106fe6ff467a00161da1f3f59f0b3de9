package Ex2_6;

import java.util.HashMap;
import java.util.StringTokenizer;
/*
 * Author: Pham Thi Kim Hien
 * Date: 09/09/2016
 * Version: 1.0
 */
public class TextContentManagement {
	private HashMap<String, Integer> list;
	
	public TextContentManagement(){
		this.list = new HashMap<String, Integer>();
	}
	
	// use to split word and put in array list
	public HashMap<String, Integer> splitWord(String s) {
		StringTokenizer str = new StringTokenizer(s);
        while(str.hasMoreTokens()) {
            String temp = str.nextToken();
            if(list.containsKey(temp)) {
                int i = list.get(temp);
                list.put(temp, i + 1);
            } else {
                list.put(temp, 1);
            }
        }
        return list;
	}
	
	// Search a word in the text content
	public void searchWord(String word) {
		if (list.containsKey(word))
			System.out.println("\tWord: " + word + "\tthe number of occurrences: " + list.get(word));
		else
			System.out.println("\tNot found");
	}
	
	// show information 
	public void showInfo() {
		for (String key : list.keySet()) {
			System.out.println("\tWord: " + key + "\tthe number of occurrences: " + list.get(key));
		}
	}
}
