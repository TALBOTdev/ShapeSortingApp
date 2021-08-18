package utility;

import compare.BaseAreaCompare;
import compare.VolumeCompare;
import shapes.Shape;

/**
 * 
 * @author Ben Talbot
 * Sorts the shape array using various sorting algorithms.
 */
public class ShapeSorter {
	
	private Shape[] shapeArray;
	private char sortType;
	private int arrayLength;
	private String typeString;
	
	public ShapeSorter(Shape[] shapeArray, char sortType) {
		this.shapeArray = shapeArray;
		this.sortType = sortType;
		arrayLength = shapeArray.length;
	}
	
	/**
	 * Checks the sort criteria and returns the result of the shape comparison.
	 * @param shape1
	 * @param shape2
	 * @return
	 */
	public int compareShapes(Shape shape1, Shape shape2) {
		int result = 10;
		if (sortType == 'H') {
			typeString = "Height";
			result = shape1.compareTo(shape2);
		}
		else if (sortType == 'V') {
			typeString = "Volume";
			VolumeCompare volumeCompare = new VolumeCompare();
			result = volumeCompare.compare(shape1, shape2);
		}
		else {
			typeString = "Base Area";
			BaseAreaCompare baseAreaCompare = new BaseAreaCompare();
			result = baseAreaCompare.compare(shape1, shape2);
		}
		return result;
	}
	
	/**
	 * Returns a String stating the comparison type
	 * @return
	 */
	public String getTypeString() {
		return typeString;
	}

	
	/**
	 * https://www.geeksforgeeks.org/bubble-sort/
	 * Sorts the shape array using the bubble sort algorithm.
	 * @return
	 */
	public Shape[] bubbleSort() {	
		 for (int x = 0; x < arrayLength - 1; x++) {
			 for (int y = 0; y < arrayLength - x - 1; y++) {
				 if (this.compareShapes(shapeArray[y], shapeArray[y + 1]) < 0) {
					 Shape temp = shapeArray[y];
					 shapeArray[y] = shapeArray[y + 1];
					 shapeArray[y + 1] = temp;
				 }
			 }
		 }
		 return shapeArray;
	}
	
	
	/**
	 * https://www.geeksforgeeks.org/selection-sort/
	 * Sorts the shape array using the selection sort algorithm.
	 * @return
	 */
	public Shape[] selectionSort() {
		for (int x = 0; x < arrayLength - 1; x++) {
			int smallestElement = x;
			for (int y = x + 1; y < arrayLength; y++) {
				if (this.compareShapes(shapeArray[y],shapeArray[smallestElement]) > 0) {
					smallestElement = y;
				}
			}
			Shape temp = shapeArray[smallestElement];
			shapeArray[smallestElement] = shapeArray[x];
			shapeArray[x] = temp;
		}
		return shapeArray;
	}
	
	
	/**
	 * https://www.geeksforgeeks.org/insertion-sort/
	 * Sorts the shape array using the insertion sort algorithm.
	 * @return
	 */
	public Shape[] insertionSort() {
		for (int x = 1; x < arrayLength; x++) {
			Shape arrayKey = shapeArray[x];
			int y = x - 1;
			while (y >= 0 && this.compareShapes(shapeArray[y], arrayKey) < 0) {
				shapeArray[y + 1] = shapeArray[y];
				y = y -1;
			}
			shapeArray[y + 1] = arrayKey;
		}
		return shapeArray;
	}
	
	/**
	 * Merges two arrays, used in merge sort
	 * @param mergeArray
	 * @param mergeLeft
	 * @param middle
	 * @param mergeRight
	 */
	public void merge(Shape[] mergeArray, int mergeLeft, int middle, int mergeRight) {
		
		int size1 = middle - mergeLeft + 1;
		int size2 = mergeRight - middle;
		
		Shape[] leftArray = new Shape[size1];
		Shape[] rightArray = new Shape[size2];
		
		for (int x = 0; x < size1; ++x) {
			leftArray[x] = mergeArray[mergeLeft + x];
		}
		for (int y = 0; y < size2; ++y) {
			rightArray[y] = mergeArray[middle + 1 + y];
		}
		
		int x = 0, y = 0;
		
		int beginningPointer = mergeLeft;
		while (x < size1 && y < size2) {
			if (this.compareShapes(leftArray[x], rightArray[y]) == 1 || this.compareShapes(leftArray[x], rightArray[y]) == 0) {
				mergeArray[beginningPointer] = leftArray[x];
				x++;
			}
			else {
				mergeArray[beginningPointer] = rightArray[y];
				y++;
			}
			beginningPointer++;
		}
		
		while (x < size1) {
			mergeArray[beginningPointer] = leftArray[x];
			x++;
			beginningPointer++;
		}
		
		while (y < size2) {
			mergeArray[beginningPointer] = rightArray[y];
			y++;
			beginningPointer++;
		}
	}
	
	
	/**
	 * https://www.geeksforgeeks.org/merge-sort/
	 * Sorts the shape array using the merge sort algorithm.
	 * @return
	 */
	public Shape[] mergeSort(int mergeLeft, int mergeRight) {
			
		if (mergeLeft < mergeRight) {
			int middle = (mergeLeft+mergeRight)/2;
			
			mergeSort(mergeLeft, middle);
			mergeSort(middle+1, mergeRight);
			
			merge(shapeArray, mergeLeft, middle, mergeRight);
		}
		return shapeArray;
	}
	
	/**
	 * Partitions an array. Used in quick sort.
	 * @param quickArray
	 * @param lowest
	 * @param highest
	 * @return
	 */
	public int partition(Shape[] quickArray, int lowest, int highest) {

        Shape pivot = quickArray[highest];
        int i = (lowest - 1);

        for (int x = lowest; x < highest; x++) {
            if (this.compareShapes(quickArray[x], pivot) == 1) {
                i++;

                Shape tempShape = quickArray[i];
                quickArray[i] = quickArray[x];
                quickArray[x] = tempShape;
            }
        }
        Shape tempShape = quickArray[i + 1];
        quickArray[i + 1] = quickArray[highest];
        quickArray[highest] = tempShape;

        return i + 1;
    }
    
	/**
	 * https://www.geeksforgeeks.org/quick-sort/
	 * Sorts the shape array using the quick sort algorithm.
	 * @return
	 */
    public Shape[] quickSort(int lowest, int highest) {

        if (lowest < highest) {
            int partitionIndex = partition(shapeArray, lowest, highest);

            quickSort(lowest, partitionIndex - 1);
            quickSort(partitionIndex + 1, highest);

        }
        return shapeArray;
    }
    
    /** 
     * https://www.geeksforgeeks.org/gnome-sort-a-stupid-one/
	 * Sorts the shape array using the gnome sort algorithm.
	 * 
	 * Gnome sort is inspired by the idea of a garden Gnome sorting flower pots.
	 * Gnome sort works by swapping adjacent elements if they are not in order,
	 * making it similar to Insertion sort.
	 * 
	 * The Time Complexity of Gnome sort is O(n^2).
	 * @return
	 */
    public Shape[] gnomeSort() {
    	int index = 0;
    	
    	while (index < arrayLength) {
    		if (index == 0) {
    			index++;
    		}
    		if (this.compareShapes(shapeArray[index], shapeArray[index - 1]) == -1 || this.compareShapes(shapeArray[index], shapeArray[index - 1]) == 0) {
    			index++;
    		}
    		else {
    			Shape temp;
    			temp = shapeArray[index];
    			shapeArray[index] = shapeArray[index - 1];
    			shapeArray[index - 1] = temp;
    			index--;
    			
    		}
    	}
    	return shapeArray;
     }
}
