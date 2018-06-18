package com.algorithms.sorting;

import java.util.Comparator;

public class TempSort implements Comparator {
	
	
	public static void main(String[] args) {
		String[] array = {"V","A"};
		
		System.out.println(array[0].compareTo(array[1]));
	}


	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
