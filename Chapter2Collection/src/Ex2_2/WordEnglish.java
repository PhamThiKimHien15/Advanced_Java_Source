package Ex2_2;
/*
 * Author: Pham Thi Kim Hien
 * Date: 07/09/2016
 * Version: 1.0
 */
public class WordEnglish implements Comparable<WordEnglish> {
	private String word;
	private String meaning;
	public WordEnglish(String word, String meaning) {
		super();
		this.word = word;
		this.meaning = meaning;
	}
	
	public WordEnglish(String word) {
		super();
		this.word = word;
	}

	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getMeaning() {
		return meaning;
	}
	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}
	// use to TreeSet sort list by word
	@Override
	public int compareTo(WordEnglish o) {
		return this.word.compareToIgnoreCase(o.word);
	}
	@Override
	public String toString() {
		return "\tWork: " + this.word + "\tMeaning: " + this.meaning;
	}
}
