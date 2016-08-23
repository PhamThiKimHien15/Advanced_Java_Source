package Ex1_17;

/*
 * Author: Pham Thi Kim Hien
 * Date: 23/08/2016
 * Version: 1.0
 * Use to manage information of Fish
 */
public class Fish extends Animal implements INonMoult, IWater, ISwim {

	public Fish(String name, String food) {
		super(name, food);
	}

	@Override
	public void swim() {
		System.out.println("swim");
	}

	@Override
	public void liveUnderWater() {
		System.out.println("live underwater");
	}

	@Override
	public void grownNormal() {
		System.out.println("grown normal");
	}

}
