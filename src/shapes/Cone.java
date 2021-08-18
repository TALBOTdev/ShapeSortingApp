package shapes;

/**
 * 
 * @author Ben Talbot
 * Represents a Cone shape
 */
public class Cone extends Shape {

	private double height;
	private double radius;
	private double volume;
	private double baseArea; 

	public Cone(double height, double radius) {
		super(height);
		this.height = height;
		this.radius = radius;
		this.volume = (Math.PI / 3) * (radius * radius) * height;
		this.baseArea = Math.PI * (radius * radius);
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getVolume() {
		return volume;
	}

	public double getBaseArea() {
		return baseArea;
	}

	@Override
	public String toString() {
		return "Cone";
	}
	
	

}
