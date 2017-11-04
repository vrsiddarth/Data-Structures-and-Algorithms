package com.algorithms.unionFind;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class UnionFindClient {

	public static void main(String[] args) {
		System.out.println("Enter your number of Nodes");
		int N = StdIn.readInt();
		WeightedQuickUnionAlgorithm UFA = new WeightedQuickUnionAlgorithm(N);

		while (!StdIn.isEmpty()) {
			int p = StdIn.readInt();
			int q = StdIn.readInt();
			if (!UFA.connected(p, q)) {
				UFA.union(p, q);
				StdOut.println(p + "    " + q);
			} else {
				System.out.println("Already Connected   :   " + p + "     " + q);
			}
		}
	}
}
