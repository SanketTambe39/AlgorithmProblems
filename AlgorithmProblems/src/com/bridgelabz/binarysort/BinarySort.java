package com.bridgelabz.binarysort;

public class BinarySort {

	/**
	 * Method for searching element(word) form given array of words
	 * returning -1 if the element is not present
	 * otherwise Method will send the address of word in array
	 * 
	 * @param arr
	 * @param x
	 * @return
	 */
	
	static int binarySearch(String[] arr, String x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
 
            int res = x.compareTo(arr[m]);
 
            // Check if x is present at mid
            if (res == 0)
                return m;
 
            // If x greater, ignore left half
            if (res > 0)
                l = m + 1;
 
            // If x is smaller, ignore right half
            else
                r = m - 1;
        }
 
        return -1;
    }
	public static void main(String []args)
    {
        String[] arr = {"It's","Not","Faith","In","Technology"};
        String x = "Technology";
        int result = binarySearch(arr, x);
 
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at "
                              + "index " + result);
    }
}
