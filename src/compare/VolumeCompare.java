package compare;

import java.util.Comparator;

import shapes.Shape;

/**
 * 
 * @author Ben Talbot
 * Compares the volumes of two shape objects using the Comparator interface.
 *
 */
public class VolumeCompare implements Comparator<Shape>{

	@Override
	public int compare(Shape shape1, Shape shape2) {
		if (shape1.getVolume() > shape2.getVolume()) {
			return 1;
		}
		else if (shape1.getVolume() < shape2.getVolume()) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	

}
