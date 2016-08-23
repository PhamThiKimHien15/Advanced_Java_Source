package Ex1_17;

/*
 * Author: Pham Thi Kim Hien
 * Date: 22/08/2016
 * Version: 1.0
 * Use to manage information of Tiger
 */
public class Tiger extends Animal implements IBurrow, INonMoult, IRun, ISwim {

	public Tiger(String name, String food) {
		super(name, food);
	}

	@Override
	public void swim() {
		System.out.println("swim");
	}

	@Override
	public void run() {
		System.out.println("run");
	}

	@Override
	public void grownNormal() {
		System.out.println("grown normal");
	}

	@Override
	public void toBurrow() {
		System.out.println("burrow");
	}

}
