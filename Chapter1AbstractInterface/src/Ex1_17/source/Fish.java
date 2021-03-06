package Ex1_17.source;


/*
 * Author: Pham Thi Kim Hien
 * Date: 23/08/2016
 * Version: 1.0
 * Use to manage information of Fish
 */
public class Fish extends Animal implements INonMolt, IWater, ISwim {

	public Fish(String name, String food) {
		super(name, food);
	}
	/*
	 * @see Ex1_17.ISwim#swim()
	 * function: use to describe the action of swimming animals
	 * input is state: swim
	 * No output
	 */
	@Override
	public void swim() {
		System.out.println("swim");
	}
	/*
	 * @see Ex1_17.IWater#liveUnderWater()
	 * function: use to describe animals lived under water
	 * input is state: swim
	 * No output
	 */
	@Override
	public void liveUnderWater() {
		System.out.println("live underwater");
	}
	/*
	 * @see Ex1_17.INonMolt#grownNormal()
	 * function: use to describe animals grown up normal
	 * input is state: grown up normal
	 * No output
	 */
	@Override
	public void grownNormal() {
		System.out.println("grown up normal");
	}

}
