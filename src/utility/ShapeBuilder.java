package utility;


import shapes.Cone;
import shapes.Cylinder;
import shapes.OctagonalPrism;
import shapes.PentagonalPrism;
import shapes.Pyramid;
import shapes.Shape;
import shapes.SquarePrism;
import shapes.TriangularPrism;

/**
 * 
 * @author Ben Talbot
 * Builds and returns a shape object from file input.
 */
public class ShapeBuilder {

	public static Shape buildShape(String shapeName, double dimension1, double dimension2) {
		Shape shapeToAdd = null;
		
		switch (shapeName) {
		case "Cylinder":
			shapeToAdd = new Cylinder(dimension1, dimension2);
			break;
		case "Cone":
			shapeToAdd = new Cone(dimension1, dimension2);
			break;
		case "Pyramid":
			shapeToAdd = new Pyramid(dimension1, dimension2);
			break;
		case "SquarePrism":
			shapeToAdd = new SquarePrism(dimension1, dimension2);
			break;
		case "TriangularPrism":
			shapeToAdd = new TriangularPrism(dimension1, dimension2);
			break;
		case "PentagonalPrism":
			shapeToAdd = new PentagonalPrism(dimension1, dimension2);
			break;
		case "OctagonalPrism":
			shapeToAdd = new OctagonalPrism(dimension1, dimension2);
			break;
		}
				
		return shapeToAdd;
	}
}
