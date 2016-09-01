package Ex1_30;

public class CircleFactory extends ShapeFactory {

	@Override
	public IShape ShapeFactory() {
		return new Circle();
	}
	
}
