package shapes;

/**
 * 
 * @author Ben Talbot
 * Represents a Pentagonal Prism
 */
public class PentagonalPrism extends Shape {

	private double height;
	private double edgeLength;
	private double baseArea;
	private double volume;

	public PentagonalPrism(double height, double edgeLength) {
		super(height);
		this.height = height;
		this.edgeLength = edgeLength;
		// https://www.geeksforgeeks.org/java-math-tan-method-examples/
		this.baseArea = (5 * (edgeLength * edgeLength) * Math.tan(Math.toRadians(54))) / 4;
		this.volume = baseArea * height;
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
		return "Pentagonal Prism";
	}

}
