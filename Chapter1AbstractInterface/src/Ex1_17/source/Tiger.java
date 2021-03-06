package Ex1_17.source;


/*
 * Author: Pham Thi Kim Hien
 * Date: 22/08/2016
 * Version: 1.0
 * Use to manage information of Tiger
 */
public class Tiger extends Animal implements IBurrow, INonMolt, IRun, ISwim {

	public Tiger(String name, String food) {
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
	 * @see Ex1_17.IRun#run()
	 * function: use to describe the action of running animals
	 * input is state: run
	 * No output
	 */
	@Override
	public void run() {
		System.out.println("run");
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
	 * @see Ex1_17.IBurrow#toBurrow()
	 * function: use to describe the action of burrowing animals
	 * input is state: burrow
	 * No output
	 */
	@Override
	public void toBurrow() {
		System.out.println("burrow");
	}

}
