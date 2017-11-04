package com.algorithms.unionFind;

public class QuickUnionAlgorithm {
	private int[] Node;

	public QuickUnionAlgorithm(int N) {
		// TODO Auto-generated constructor stub
		Node = new int[N];
		for (int i = 0; i < N; i++) {
			Node[i] = i;
		}
	}

	public void union(int p, int q) {
		// TODO Auto-generated method stub
		int pid = root(p);
		int qid = root(q);
		Node[pid] = qid;
	}

	public boolean connected(int p, int q) {
		// TODO Auto-generated method stub
		if (root(p) == root(q)) {
			return true;
		} else {
			return false;
		}
	}

	private int root(int p) {
		// TODO Auto-generated method stub
		while(p!= Node[p]) {
			p=Node[p];
		}
		return p;
	}
}
