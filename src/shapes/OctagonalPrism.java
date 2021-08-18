package shapes;

/**
 * 
 * @author Ben Talbot
 * Represents an Octagonal Prism
 */
public class OctagonalPrism extends Shape {

	private double height;
	private double edgeLength;
	private double baseArea;
	private double volume;

	public OctagonalPrism(double height, double edgeLength) {
		super(height);
		this.height = height;
		this.edgeLength = edgeLength;
		this.baseArea = 2 * (1 + Math.sqrt(2)) * (edgeLength * edgeLength);
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
		return "Octagonal Prism";
	}
}
