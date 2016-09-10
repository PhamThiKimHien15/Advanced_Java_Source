package Ex1_32_Facade;

public class FightBooker implements IBooker{
	
	public FightBooker() {
		super();
	}

	@Override
	public String getInfo(String startDate, String hour, String place) {
		return "Start date: " + startDate +
				"\tDeparture time: " + hour + 
				"\tPlace: " + place;
	}

}
