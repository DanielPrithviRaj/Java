package com.collections;

import java.util.*;

public class Set_Ex {

	public static void main(String[] args) {
		Set<String> car = new LinkedHashSet<>();

		car.add("Swift");
		car.add("Baleno");
		car.add("Breeza");
		car.add("Punch");
		
		System.out.println(car);
		
		car.remove("Breeza");
		System.out.println(car);
		
		//System.out.println(car);
		
		TreeSet<Integer> num = new TreeSet<>();
		
		
		num.add(52);
		num.add(95);
		num.add(44);
		num.add(15);
		num.add(36);
		
		System.out.println(num);
		
		if(num.contains(15)) {
			System.out.println("It works");
		}else {
			System.out.println("It's not");
		}
		TreeSet<Integer> number = (TreeSet<Integer>) num.clone();
		
		System.out.println(number);
		
		//System.out.println(num);
		
	}

}
