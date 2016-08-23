package Ex1_16;

/*
 * Author: Pham Thi Kim Hien
 * Date: 23/08/2016
 * Version: 1.0
 * create list to manage information of Car
 */
import java.util.ArrayList;

public class ListCar {

	ArrayList<Car> list;

	public ListCar() {
		this.list = new ArrayList<Car>();
	}

	public void add(Car car) {
		list.add(car);
	}

	// function: show information of Car
	public void showInfo() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}
}
