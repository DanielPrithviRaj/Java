package com.arrays;

import java.util.*;

public class ArrayMethods {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int size;
		
		System.out.println("Enter the size of the array :");	
		size = scan.nextInt();
		
		int Num[] = new int[size];
		
		System.out.println("Enter the values for the array of size " + size + ":");	
		
		for(int i = 0; i<size; i++) {
			Num[i] = scan.nextInt();
		}
		System.out.println("Unsorted array :" + Arrays.toString(Num));
		
		int largest, smallest, secondLargest;
		
		smallest = Num[0];
		
		largest = Num[0];
		
		secondLargest = Num[0];
		
		for(int j = 1; j<size; j++) {
			
			if(Num[j] < smallest) {
				smallest = Num[j];
			}
			
			if(Num[j] > largest) {
				secondLargest = largest;
				largest = Num[j];
			}
			else if(Num[j] > secondLargest && Num[j] < largest && Num[j] != largest) {
				secondLargest = Num[j];
			}
		}
		
		System.out.println("Smallest value: " + smallest);
        System.out.println("Largest value: " + largest);
        System.out.println("Second Largest value: " + secondLargest);
        
        scan.close();
	}

}
