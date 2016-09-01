package Ex1_30;

public class RectangleFactory extends ShapeFactory {

	@Override
	public IShape ShapeFactory() {
		return new Rectangle();
	}

}
