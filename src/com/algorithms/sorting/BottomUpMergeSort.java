package com.algorithms.sorting;

@SuppressWarnings("rawtypes")
public class BottomUpMergeSort {
/*
The only difference between the Merge Sort and Bottom Merge sort is taht there is no recursiveness in this type. 
*/
	private static Comparable[] aux;
	
	public static void sort(Comparable[] a) 
	{
		int N=a.length;
		aux=new Comparable[N];
		for (int size = 0; size < a.length; size+=size) {
			for (int low = 0; low < N-size; low+=size+size) {
			merge(a,low,low+size-1,Math.min(low+size+size-1, N-1));
			}
		}
		
	}

	private static void merge(Comparable[] a, int low, int i, int min) {
		// As before
		
	}
}
