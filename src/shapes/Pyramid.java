package shapes;

/**
 * 
 * @author Ben Talbot
 * Represents a Pyramid shape
 */
public class Pyramid extends Shape {

	private double height;
	private double edgeLength;
	private double volume;
	private double baseArea;

	public Pyramid(double height, double edgeLength) {
		super(height);
		this.height = height;
		this.edgeLength = edgeLength;
		this.volume = ((edgeLength * edgeLength) / 3) * height;
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
		return "Pyramid";
	}
}
