package Ex1_28;

import java.util.ArrayList;
import java.util.List;
/*
 * Author: Pham Thi Kim Hien
 * Date: 5/09/2016
 * Version: 1.0
 */
public class Account {
	private List<Observer> list = new ArrayList<Observer>();
	private double state;
	
	public Account() {
		super();
	}
	public double getState() {
		return state;
	}
	public void setState(double state) {
		this.state = state;
		notifyAllObserver();
	}
	// Add observer into list of Observer
	public void attach(Observer observer) {
		list.add(observer);
	}
	// Notify to all observer when account change
	public void notifyAllObserver() {
		for (Observer observer : list) {
			observer.update();
		}
	}
	
}
