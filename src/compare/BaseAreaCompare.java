package compare;

import java.util.Comparator;

import shapes.Shape;
/**
 * 
 * @author Ben Talbot
 * Compares the base area's of two shape objects using the Comparator interface.
 *
 */
public class BaseAreaCompare implements Comparator<Shape>{

	@Override
	public int compare(Shape shape1, Shape shape2) {
		if (shape1.getBaseArea() > shape2.getBaseArea()) {
			return 1;
		}
		else if (shape1.getBaseArea() < shape2.getBaseArea()) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	

}
