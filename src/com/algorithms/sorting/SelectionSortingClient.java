package com.algorithms.sorting;

import edu.princeton.cs.algs4.StdRandom;

public class SelectionSortingClient {

	public static void main(String[] args) {
		
		SelectionSortingImplementation sortimpl = new SelectionSortingImplementation();
		int N = 10;
		Double[] array = new Double[N];
		
			
			for (int i = 0; i < array.length; i++)
			array[i] = StdRandom.uniform();
			
			System.out.println("Before");
		
			for (int i = 0; i < array.length; i++)
			System.out.println(array[i]);
			
			sortimpl.sort(array);
		
			System.out.println("After");
		
			for (int i = 0; i < array.length; i++)
			System.out.println(array[i]);
			
	}

}
