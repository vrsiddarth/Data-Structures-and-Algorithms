package com.algorithms.sorting;

@SuppressWarnings({ "unused", "rawtypes", "unchecked" })
public class MergeSort {
	private static Comparable[] aux;

	private static void merge(Comparable[] a, Comparable[] aux, int low, int mid, int high) {

		assert isSorted(a, low, mid);
		assert isSorted(a, mid + 1, high);

		for (int k = 0; k < aux.length; k++)
			aux[k] = a[k];

		int i = low, j = mid + 1;

		for (int k = low; k < high; k++) {
			if (i > mid)
				a[k] = aux[j++];
			else if (j > high)
				a[k] = aux[i++];
			else if (less(aux[j], a[i]))
				a[k] = aux[j++];
			else
				a[k] = aux[i++];
		}
		assert isSorted(a, low, mid);
	}

	private static void sort(Comparable[] a, Comparable[] aux, int low, int high) {
		if (high <= low)
			return;
		int mid = low + (high - low) / 2;
		sort(a, aux, low, mid); 
		sort(a, aux, mid + 1, high);
		merge(a, aux, low, mid, high);
	}

	static void sort(Comparable[] a) {
		aux = new Comparable[a.length];
		sort(a, aux, 0, a.length - 1);

	}

	private static boolean isSorted(Comparable[] a, int low, int mid) {
		// TODO Auto-generated method stub
		return true   ;
	}

	private static void exch(Comparable[] a, int i, int min) {
		// TODO Auto-generated method stub
		Comparable swap = a[i];
		a[i] = a[min];
		a[min] = swap;
	}

	private static boolean less(Comparable var1, Comparable var2) {
		// TODO Auto-generated method stub
		return var1.compareTo(var2) < 0;
	}
	public static void main(String[] args) {
		Comparable[] a = {"Diaper","Ross","Sid","Geography"};
		sort(a);
		for (int i=0; i<a.length; i++) System.out.println(a[i]);
	}

}
