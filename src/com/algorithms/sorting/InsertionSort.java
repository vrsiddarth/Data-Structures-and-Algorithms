package com.algorithms.sorting;

public class InsertionSort {

	@SuppressWarnings("unchecked")
	public void sort(@SuppressWarnings("rawtypes") Comparable[] a) {
		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i; j > 0; j--) {
				if (less(a[j], a[min]))
					exch(a, i, min);
				else
					break;
			}
		}
	}

	private static void exch(@SuppressWarnings("rawtypes") Comparable[] a, int i, int min) {
		// TODO Auto-generated method stub
		Comparable<?> swap = a[i];
		a[i] = a[min];
		a[min] = swap;
	}

	private static boolean less(Comparable<Comparable<?>> var1, Comparable<?> var2) {
		// TODO Auto-generated method stub
		return var1.compareTo(var2) < 0;
	}

}
