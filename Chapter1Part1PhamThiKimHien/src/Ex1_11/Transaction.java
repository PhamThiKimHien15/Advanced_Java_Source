package Ex1_11;

public class Transaction {

	private String id;
	private String days;
	private int number;
	public Transaction(String id, String days, int number) {
		super();
		this.id = id;
		this.days = days;
		this.number = number;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDays() {
		return days;
	}
	public void setDays(String days) {
		this.days = days;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
}
