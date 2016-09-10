package Ex1_27;
/*
 * Author: Pham Thi Kim Hien
 * Date: 31/08/2016
 * Version: 1.0
 */
public abstract class ShapDecorator implements IShape {
	protected IShape shape;

	public ShapDecorator(IShape shape) {
		super();
		this.shape = shape;
	}
	public String draw(){
		return shape.draw();
	}
}
