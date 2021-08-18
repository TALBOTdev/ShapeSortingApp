package driver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


import shapes.Shape;
import utility.ArgumentParser;
import utility.ArgumentQuery;
import utility.ShapeBuilder;
import utility.ShapeSorter;

/**
 * 
 * @author Ben Talbot
 * Entry point into the program 
 */
public class SortDriver {
	static double start;
	static double end;
	
	public static void main(String[] args) {
		ArgumentParser argumentParser = new ArgumentParser();
		ArgumentQuery argumentQuery = argumentParser.parseArgument(args);
		try {
				BufferedReader shapeReader = new BufferedReader(new FileReader(new File(argumentQuery.getFilePath())));				
				
				// Creates an initial array split at the spaces
				String[] fileArray = shapeReader.readLine().split(" ");
				// Finds array size from the first entry
				int arraySize = Integer.parseInt(fileArray[0]);
				Shape[] shapeArray = new Shape[arraySize];
				int shapeArrayPosition = 0;

				// Fills the shape array with the contents of the file
				// Increments by three because every shape entry is 3 values
				for (int i  = 1; i < fileArray.length; i += 3) {
					
					String shapeName = fileArray[i];
					double dimension1 = Double.parseDouble(fileArray[i + 1]);
					double dimension2 = Double.parseDouble(fileArray[i + 2]);
					Shape shapeToAdd = ShapeBuilder.buildShape(shapeName, dimension1, dimension2);
					shapeArray[shapeArrayPosition] = shapeToAdd;
					shapeArrayPosition++;
				}

				ShapeSorter shapeSorter = new ShapeSorter(shapeArray, argumentQuery.getCompareType());
				char sortType = argumentQuery.getSortType();
				Shape[] sortedShapeArray = new Shape[arraySize];
				String typeString = null;
				String sortString = null;
				
				// If bubble sort is specified
				if (sortType == 'B') {
					start = System.currentTimeMillis();
					sortedShapeArray = shapeSorter.bubbleSort();
					end = System.currentTimeMillis();
					sortString = "Bubble Sort";
					typeString = shapeSorter.getTypeString();
				}
				// If selection sort is specified
				else if (sortType == 'S') {
					start = System.currentTimeMillis();
					sortedShapeArray = shapeSorter.selectionSort();
					end = System.currentTimeMillis();
					sortString = "Selection Sort";
					typeString = shapeSorter.getTypeString();
				}
				// If insertion sort is specified
				else if (sortType == 'I') {
					start = System.currentTimeMillis();
					sortedShapeArray = shapeSorter.insertionSort();
					end = System.currentTimeMillis();
					sortString = "Insertion Sort";
					typeString = shapeSorter.getTypeString();
				}
				// If merge sort is specified
				else if (sortType == 'M') {
					start = System.currentTimeMillis();
					sortedShapeArray = shapeSorter.mergeSort(0, shapeArray.length - 1);
					end = System.currentTimeMillis();
					sortString = "Merge Sort";
					typeString = shapeSorter.getTypeString();
				}
				// If quick sort is specified
				else if (sortType == 'Q') {
					start = System.currentTimeMillis();
					sortedShapeArray = shapeSorter.quickSort(0, shapeArray.length - 1);
					end = System.currentTimeMillis();
					sortString = "Quick Sort";
					typeString = shapeSorter.getTypeString();
				}
				// If gnome sort is specified
				else if (sortType == 'Z') {
					start = System.currentTimeMillis();
					sortedShapeArray = shapeSorter.gnomeSort();
					end = System.currentTimeMillis();
					sortString = "Gnome Sort";
					typeString = shapeSorter.getTypeString();
					
				}
				printShapes(sortedShapeArray, typeString, sortString);
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Prints the sorted shape array
	 * @param sortedShapeArray
	 */
	public static void printShapes(Shape[] sortedShapeArray, String typeString, String sortString) {
		int counter = 0;
		double returnedValue = 0;
		
		System.out.println("\nComparing " + typeString + "\nSorting using " + sortString + "\nRuntime: " + (end - start)/1000 + " seconds\n");
		System.out.printf("%20s%21s\n", "SHAPE", typeString.toUpperCase());
		System.out.println("-----------------------------------------------------");
		
		for (int i = 0; i < sortedShapeArray.length; i++) {
			
			switch (typeString) {
			case "Height":
				returnedValue = sortedShapeArray[i].getHeight();	
				break;
			case "Volume":
				returnedValue = sortedShapeArray[i].getVolume();
				break;
			case "Base Area":
				returnedValue = sortedShapeArray[i].getBaseArea();
				break;
			}
			
			if (i == 0 || i % 1000 == 0) {
				if (i == 0) {
					System.out.printf("%-10s%-24s%.2e\n", "First: ", sortedShapeArray[i].toString(), returnedValue);
				}
				else {
					System.out.printf("%-10s%-24s%.2e\n", counter + ": ", sortedShapeArray[i].toString(), returnedValue);
				}
			}
			else if (i == sortedShapeArray.length - 1) {
				System.out.printf("%-10s%-24s%.2e\n", "Last: ", sortedShapeArray[i].toString(), returnedValue);
			}
			counter++;
		}
		
	}
}
