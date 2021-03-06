package Ex1_27;
/*
 * Author: Pham Thi Kim Hien
 * Date: 31/08/2016
 * Version: 1.0
 */
public class RedShapeDecorator extends ShapDecorator  {

	public RedShapeDecorator(IShape shape) {
		super(shape);
	}
	public String draw(String choose){
		if (choose.equalsIgnoreCase("Y"))
			return this.shape.draw() + " and " + setRedBorder(shape);
		else
			return this.shape.draw() + setNoBorder(shape);
	}
	
	// show information when the user does not choose decorations
	public String setNoBorder(IShape shape) {
		return " with normal border";
	}
	// show information when the user does choose decorations
	public String setRedBorder(IShape shape) {
		return "Border color: Red";
	}
	
	
}
