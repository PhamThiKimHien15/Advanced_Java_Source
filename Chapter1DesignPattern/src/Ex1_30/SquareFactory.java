package Ex1_30;

public class SquareFactory extends ShapeFactory {

	@Override
	public IShape ShapeFactory() {
		return new Square();
	}

}
