package shapes;

/**
 * 
 * @author Ben Talbot
 * Represents a generic shape. Implements comparable to enable height comparisons between two shapes.
 */
public abstract class Shape implements Comparable<Shape> {

	private double height;

	public Shape(double height) {
		this.height = height;
	}

	public abstract double getHeight();
	
	public abstract double getBaseArea();
	
	public abstract double getVolume();
	
	/**
	 * From the Comparable interface, enables height comparison between two shapes.
	 */
	public int compareTo(Shape incomingShape) {
		if (this.height > incomingShape.getHeight()) {
			return 1;
		}
		else if (this.height < incomingShape.getHeight()) {
			return -1;
		}
		else {
			return 0;
		}
	}
}