package Ex6_1;

/*
 * author: Pham Thi Kim Hien
 * date: 14/09/2016
 * Version: 1.0
 */
public class Diary {
	String date;
	String content;
	public Diary(String content) {
		super();
		this.content = content;
	}
	
	public Diary() {
		super();
	}

	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
