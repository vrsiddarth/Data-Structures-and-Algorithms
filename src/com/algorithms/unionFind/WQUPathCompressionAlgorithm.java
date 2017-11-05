package com.algorithms.unionFind;

import java.util.Arrays;

public class WQUPathCompressionAlgorithm {
	private int[] Node;
	private int[] sizeofNode;

	public WQUPathCompressionAlgorithm(int N) {
		// TODO Auto-generated constructor stub
		Node = new int[N];
		sizeofNode= new int[N];
		for (int i = 0; i < N; i++) {
			Node[i] = i;
			sizeofNode[i]=1;
		}
	}

	public void union(int p, int q) {
		// TODO Auto-generated method stub
		int pid = root(p);
		int qid = root(q);
		if(sizeofNode[p]<sizeofNode[q]){
			Node[pid] = qid;
			sizeofNode[q]=sizeofNode[q]+sizeofNode[p];
		}
		else {
			Node[qid] = pid;
			sizeofNode[p]=sizeofNode[p]+sizeofNode[q];
		}
		System.out.println(Arrays.toString(Node));
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
			Node[p]=Node[Node[p]];
			p=Node[p];
		}
		return p;
	}
}
