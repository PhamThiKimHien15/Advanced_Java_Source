package Ex1_32_Facade;

public class TrainBooker implements IBooker {

	public TrainBooker() {
		super();
	}

	@Override
	public String getInfo(String startDate, String hour, String place) {
		return "Start date: " + startDate +
				"\tDeparture time: " + hour + 
				"\tPlace: " + place;
	}
	
}
