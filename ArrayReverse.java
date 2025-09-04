package com.arrays;

import java.util.*;

public class ArrayReverse {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int size;
		
		System.out.println("Enter the size of the array :");	
		size = scan.nextInt();
		
		int value[] = new int[size];
		
		System.out.println("Enter the values for the array of size " + size + ":");	
		
		for(int i = 0; i<size; i++) {
			value[i] = scan.nextInt();
		}
		
		Arrays.sort(value);
		System.out.println("Ascendingly Sorted array :" +Arrays.toString(value));
		
		for(int i = 0; i<size/2; i++) {
			int temp = value[i];
			value[i] = value[size - (i+1)];
			value[size - (i+1)] = temp;	
		}
		
		System.out.println("Descendingly Sorted array :" + Arrays.toString(value));
		
		scan.close();
		
	}
}
