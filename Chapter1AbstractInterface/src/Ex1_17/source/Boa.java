package Ex1_17.source;


/*
 * Author: Pham Thi Kim Hien
 * Date: 23/08/2016
 * Version: 1.0
 * Use to manage information of Boa
 */
public class Boa extends Animal implements IBurrow, IMolt, ISwim {

	public Boa(String name, String food) {
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
	 * @see Ex1_17.IBurrow#toBurrow()
	 * function: use to describe the action of burrowing animals
	 * input is state: burrow
	 * No output
	 */
	@Override
	public void toBurrow() {
		System.out.println("burrow");
	}
	/*
	 * @see Ex1_17.IMolt#molt()
	 * function: use to describe the action of molting animals
	 * input is state: molt
	 * No output
	 */
	@Override
	public void molt() {
		System.out.println("molt");
		
	}

}
