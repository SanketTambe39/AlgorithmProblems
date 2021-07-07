package com.bridgelabz.insertionsort;

import java.util.Arrays;

public class InsertionSort {

	private<T extends Comparable<T>> void insertionSort(T[] inputArray)
	{
		int i,j;
		T key;
		for (j = 1; j < inputArray.length; j++)
		{
			key = inputArray[j];
		    i = j - 1;
		    while (i >= 0)
		    {
		    	if (key.compareTo(inputArray[i]) > 0)
		    	{
		    		break;
		    	}
		    		inputArray[i + 1] = inputArray[i];
		    		i--;
		    }
		    inputArray[i + 1] = key;
		}
		System.out.println("Array after Sorting :: "+Arrays.toString(inputArray));
	}
	
	public static void main(String[] args)
	{
		String[] inputArray = {"It's","Not","Faith","In","Technology"};
		System.out.println("Given Array :: "+Arrays.toString(inputArray));
	  
		InsertionSort insertionSort = new InsertionSort();
		insertionSort.insertionSort(inputArray);
	}
	
}
