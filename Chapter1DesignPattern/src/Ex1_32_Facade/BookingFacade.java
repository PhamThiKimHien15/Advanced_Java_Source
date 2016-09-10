package Ex1_32_Facade;

public class BookingFacade {
	private IBooker fight;
	private IBooker hotel;
	private IBooker train;
	public BookingFacade() {
		super();
		this.fight = new FightBooker();
		this.hotel = new HotelBooker();
		this.train = new TrainBooker();
	}
	public String getInfoFight(String startDate, String hour, String place) {
		return fight.getInfo(startDate, hour, place);
	}
	public String getInfoHotel(String startDate, String endDate, String place) {
		return fight.getInfo(startDate, endDate, place);
	}
	public String getInfoTrain(String startDate, String hour, String place) {
		return fight.getInfo(startDate, hour, place);
	}
}
