package Ex1_17;
/*
 * Author: Pham Thi Kim Hien
 * Date: 23/08/2016
 * Version: 1.0
 * Use to manage information of Animal
 */
public class Animal {

	protected String name;
	protected String food;

	public Animal(String name, String food) {
		super();
		this.name = name;
		this.food = food;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	@Override
	public String toString() {
		return "\tName: " + getName() + "\tFood: " + getFood();
	}
}
