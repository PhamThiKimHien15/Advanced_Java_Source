package Ex1_32_Facade;

public class HotelBooker implements IBooker{
	
	public HotelBooker() {
		super();
	}

	@Override
	public String getInfo(String startDate, String endDate, String place) {
		return "Start date: " + startDate +
				"\tEnd date: " + endDate + 
				"\tPlace: " + place;
	}

}
