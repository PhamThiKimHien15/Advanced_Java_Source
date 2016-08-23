package Ex1_17;
/*
 * Author: Pham Thi Kim Hien
 * Date: 23/08/2016
 * Version: 1.0
 * Use to manage information of Boa
 */
public class Boa extends Animal implements IBurrow, IMoult, ISwim {

	public Boa(String name, String food) {
		super(name, food);
	}

	@Override
	public void swim() {
		System.out.println("swim");
	}

	@Override
	public void moult() {
		System.out.println("moult");
	}

	@Override
	public void toBurrow() {
		System.out.println("burrow");
	}

}
