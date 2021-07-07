package com.bridgelabz.primenumber;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // Declare the variables
        int rangeFrom, rangeTo,flag;
 
        // Ask user to enter lower value of interval
        System.out.printf("Enter starting point :: ");
        rangeFrom = sc.nextInt(); // Take input
 
        // Ask user to enter upper value of interval
        System.out.printf("\nEnter ending point :: ");
        rangeTo = sc.nextInt(); // Take input
 
        // Print display message
        System.out.printf("\nPrime numbers between %d and %d are: ", rangeFrom, rangeTo);
 
        // Traverse each number in the interval
        // with the help of for loop
        for (int i = rangeFrom; i <= rangeTo; i++) {
 
            // Skip 0 and 1 as they are
            // neither prime nor composite
            if (i == 1 || i == 0)
                continue;
 
            // flag variable to tell
            // if i is prime or not
            flag = 1;
 
            for (int j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
 
            // flag = 1 means i is prime
            // and flag = 0 means i is not prime
            if (flag == 1)
                System.out.println(i);
        }
    }
}
