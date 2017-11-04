package com.algorithms.unionFind;


public class QuickFindAlgorithm {

	private int[] Node;

	public QuickFindAlgorithm(int N) {
		// TODO Auto-generated constructor stub
		Node = new int[N];
		for (int i = 0; i < N; i++) {
			Node[i] = i;
		}
	}

	public void union(int p, int q) {
		// TODO Auto-generated method stub
		int pid = Node[p];
		int qid = Node[q];
		for (int i = 0; i < Node.length; i++) {
			if (Node[i] == pid)
				Node[i] = qid;
		}
	}

	public boolean connected(int p, int q) {
		// TODO Auto-generated method stub
		if (Node[p] == Node[q]) {
			return true;
		} else {
			return false;
		}
	}
}
