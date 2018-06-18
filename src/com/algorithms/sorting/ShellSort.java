package com.algorithms.sorting;

public class ShellSort {

	@SuppressWarnings("unchecked")
	public void sort(@SuppressWarnings("rawtypes") Comparable[] a) {
		int N = a.length;
		int h = 0;
		while (h <= N / 3)
			h = 3 * h + 1;
		while (h >= 1) {
			for (int i = h; i < a.length; i++) {
				for (int j =i; j >= h && less(a[j], a[j - h]); j -= h)
					exch(a, j, j - h);
			}
			h=h/3;
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
