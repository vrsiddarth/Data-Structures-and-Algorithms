package com.algorithms.sorting;

import java.util.Random;

import edu.princeton.cs.algs4.StdRandom;

@SuppressWarnings({ "rawtypes", "unused" })
public class QuickSort {

	private static Comparable[] a;

	public static int partition(Comparable[] a, int low, int high) {
		int j = high + 1;
		int i = low;
		while (true) {

			while (less(a[++i], a[0]))
				if (i == high)
					break;

			while (less(a[0], a[--j]))
				if (j == low)
					break;

			if (i >= j)
				break;
			exch(i, j, a);

		}
		exch(low, j, a);

		return j;

	}

	public void sort(Comparable[] a) {
		a = new Comparable[a.length];
		StdRandom.uniform();
		sort(a, 0, a.length);

	}

	public static void sort(Comparable[] a, int low, int high) {
		if (high <= low)
			return;
		int j = partition(a, low, high);
		sort(a, low, j - 1);
		sort(a, j + 1, high);

	}

	private static void exch(int i, int j, Comparable[] a) {
		// TODO Auto-generated method stub
		Comparable temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	private static boolean less(Comparable var1, Comparable var2) {
		// TODO Auto-generated method stub
		System.out.println("var1   "+var1+"       var2   "+var2   +"    "+var1.compareTo(var2));
		return var1.compareTo(var2) < 0;
	}

	private static void KnuthShuffle(Comparable[] a) {
		Random rand = new Random();
		for (int i = 0; i < a.length; i++) {
			int r = rand.nextInt(i + 1);
			exch(r, i, a);
		}
	}
	
	public static void main(String[] args) {
		//{"Diaper","Ross","Geology","Geography"};
		String[] a = {"Diaper","Ross","Geology","Geography"};
//		KnuthShuffle(a);
		sort(a, 0, a.length-1);
		for (int i=0; i<a.length; i++) System.out.println(a[i]);
	}

}
