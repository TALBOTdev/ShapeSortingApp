package shapes;

/**
 * 
 * @author Ben Talbot
 * Represents a Triangular Prism shape
 */
public class TriangularPrism extends Shape {

	private double height;
	private double edgeLength;
	private double baseArea;
	private double volume;
	
	public TriangularPrism(double height, double edgeLength) {
		super(height);
		this.height = height;
		this.edgeLength = edgeLength;
		this.baseArea = ((edgeLength * edgeLength) * Math.sqrt(3))/4;
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
		return "Triangular Prism";
	}
}
