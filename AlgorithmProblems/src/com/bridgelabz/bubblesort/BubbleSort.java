package com.bridgelabz.bubblesort;
/**
 * 
 * @author Sanket
 * Sorting of generic type of array elements using
 * bubble sort 
 */
public class BubbleSort {
	/**
	 * 
	 * @param <T>
	 * @param integerArray
	 * @return
	 * 
	 * Method to sort array elements using bubble sort 
	 * technique in generic type
	 * 
	 */
	private<T extends Comparable<T>>T[] sortingUsingBubbleSort(T[] integerArray)
	{
		for (int i = 0; i < integerArray.length-1 ; i++)
		{
			for (int j = 0; j < integerArray.length-i-1; j++)
			{    
				if (integerArray[j].compareTo(integerArray[j+1]) > 0 )
				{
                    T temp = integerArray[j];
                    integerArray[j] = integerArray[j+1];
                    integerArray[j+1] = temp;
                }
			}
		}
		printSortedArray(integerArray);
		return integerArray;
	}
	
	/**
	 * Method to Print the sorted Array
	 * @param <T>
	 * @param integerArray
	 */
	private<T> void printSortedArray(T[] integerArray)
	{
		System.out.println("Given Array after sorting :");
		System.out.print("[ ");
		for(T iterator : integerArray)
		{
			System.out.print(iterator + " , ");
		}
		System.out.print("]");
	}
	
	
	public static void main(String[] args)
	{
		Integer[] integerArray = {75, 33, 10, 4, 7, 35, 78, 54, 29, 1};
		
		BubbleSort bubbleSortObject =  new BubbleSort();
		bubbleSortObject.sortingUsingBubbleSort(integerArray);
	}
}
