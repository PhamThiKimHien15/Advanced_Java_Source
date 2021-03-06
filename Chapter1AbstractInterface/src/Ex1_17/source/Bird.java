package Ex1_17.source;


/*
 * Author: Pham Thi Kim Hien
 * Date: 23/08/2016
 * Version: 1.0
 * Use to manage information of Bird
 */
public class Bird extends Animal implements IFly, INonMolt, INest {

	public Bird(String name, String food) {
		super(name, food);
	}
	/*
	 * @see Ex1_17.INest#nest()
	 * function: use to describe the action of nesting animals
	 * input is state: nest
	 * No output
	 */
	@Override
	public void nest() {
		System.out.println("nest");
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
	/*
	 * @see Ex1_17.IFly#fly()
	 * function: use to describe the action of flying animals
	 * input is state: fly
	 * No output
	 */
	@Override
	public void fly() {
		System.out.println("fly");
	}

}
