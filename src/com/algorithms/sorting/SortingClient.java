package com.algorithms.sorting;

import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

public class SortingClient {

	public static void main(String[] args) {

		SelectionSort sortimpl = new SelectionSort();
		InsertionSort insSort = new InsertionSort();
		ShellSort shellsort = new ShellSort();
		MergeSort mergesort = new MergeSort();

		int N = 100000;
		Double[] array = new Double[N];

		for (int i = 0; i < array.length; i++)
			array[i] = StdRandom.uniform();

		Stopwatch selectionSortTime = new Stopwatch();
//		sortimpl.sort(array);

		System.out.println("Selection Sort     :" + selectionSortTime.elapsedTime());

		for (int i = 0; i < array.length; i++)
			array[i] = StdRandom.uniform();

		Stopwatch insertionSortTime = new Stopwatch();
//		insSort.sort(array);

		System.out.println("Insertion Sort     :" + insertionSortTime.elapsedTime());

		for (int i = 0; i < array.length; i++)
			array[i] = StdRandom.uniform();

		Stopwatch shellSortTime = new Stopwatch();
		shellsort.sort(array);

		System.out.println("Shell  Sort     :" + shellSortTime.elapsedTime());
		
		
		
		Stopwatch mergeSortTime = new Stopwatch();
		mergesort.sort(array);

		System.out.println("Merge Sort     :" + mergeSortTime.elapsedTime());
	}

}
