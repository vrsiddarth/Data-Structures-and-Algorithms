package com.algorithms.PriorityQueue;

import java.util.Arrays;

public class UnorderedPQ<Key extends Comparable<Key>> {
	private Key[] pq;
	private int N;

	@SuppressWarnings("unchecked")
	public UnorderedPQ(int Capacity) {
		// TODO Auto-generated constructor stub
		pq = (Key[]) new Comparable[Capacity];

	}

	public Boolean isEmpty() {
		if (N == 0)
			return true;
		return false;
	}

	public void insert(Key x) {
		pq[N++] = x;
	}

	public Key deleteMaxPQ() {
		int max = 0;
		 for (int i = 1; i < N; i++)
		 if (less(max, i)) max = i;
		 exch(max, N-1);
		 return pq[--N];
	}

	private void exch(int max, int i) {
		// TODO Auto-generated method stub
		Key temp = pq[i];
		pq[i] = pq[max];
		pq[max] = temp;

	}

	private boolean less(int max, int i) {
		// TODO Auto-generated method stub
		if (pq[max].compareTo(pq[i]) > 0)
			return false;
		return true;
	}

	public static void main(String[] args) {
		UnorderedPQ<Integer> UPQ = new UnorderedPQ<Integer>(5);
		UPQ.insert(23);
		UPQ.insert(3423);
		UPQ.insert(2);
		UPQ.insert(233);
		UPQ.insert(2323);
		
		System.out.println(UPQ.deleteMaxPQ());
	}

}
