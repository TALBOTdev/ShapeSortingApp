package shapes;

/**
 * 
 * @author Ben Talbot
 * Represents a Square Prism shape
 */
public class SquarePrism extends Shape {

	private double height;
	private double edgeLength;
	private double volume;
	private double baseArea;

	public SquarePrism(double height, double edgeLength) {
		super(height);
		this.height = height;
		this.edgeLength = edgeLength;
		this.volume = (edgeLength * edgeLength) * height;
		this.baseArea = (edgeLength * edgeLength);
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getEdgeLength() {
		return edgeLength;
	}

	public void setEdgeLength(double edgeLength) {
		this.edgeLength = edgeLength;
	}
	
	public double getVolume() {
		return volume;
	}

	public double getBaseArea() {
		return baseArea;
	}

	@Override
	public String toString() {
		return "Square Prism";
	}
}
