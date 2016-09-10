package Ex2_2;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
/*
 * Author: Pham Thi Kim Hien
 * Date: 07/09/2016
 * Version: 1.0
 */
public class ListWordEnglish {
	private Set<WordEnglish> list;

	public ListWordEnglish() {
		this.list = new TreeSet<WordEnglish>();
	}
	// add wordEnglish into wordEnglish list
	public void addWork(WordEnglish work) {
		this.list.add(work);
	}
	
	// search a word in the dictionary
	public void searchWord(String word) {
		for (WordEnglish wEng : list) {
			if(word.equalsIgnoreCase(wEng.getWord()))
				System.out.println(wEng);
		}		
	}
	
	// delete a word in the  dictionary
	public void deleteWord(String word) {
		for (WordEnglish wEng : list) {
			if (word.equalsIgnoreCase(wEng.getWord()))
				list.remove(wEng);
		}
	}
	
	// show information of all dictionary 
	public void showInfo() {
		Iterator<WordEnglish> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
