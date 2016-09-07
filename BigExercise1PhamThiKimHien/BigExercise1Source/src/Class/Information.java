package Class;
/*
 * author: Pham Thi Kim Hien
 * date: 06/09/2016
 * version: 1.0
 * 
 */
public class Information {
	private String name;
	private String startDate;
	private String endDate;
	private int numberTraining;
	
	public Information(String name, String startDate, String endDate,
			int numberTraining) {
		super();
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.numberTraining = numberTraining;
	}
	
	public Information(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	public int getNumberTraining() {
		return numberTraining;
	}
	public void setNumberTraining(int numberTraining) {
		this.numberTraining = numberTraining;
	}
	@Override
	public String toString() {
		return "\tName: " + this.name + "\tStart date: " + this.startDate 
				+ "\tend date: " + this.endDate + "\tNumber training: " + this.numberTraining;
	}
}
