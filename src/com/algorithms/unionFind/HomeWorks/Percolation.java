package com.algorithms.unionFind.HomeWorks;

import java.util.Arrays;

public class Percolation {

	private int[][] Node;

	public Percolation(int N) {
		// TODO Auto-generated constructor stub
		Node = new int[N + 2][N + 2];
		for (int i = 0; i <= N + 1; i++) {
			for (int j = 0; j <= N + 1; j++) {
				if (((i == 0) && ((j != 0)&&(j!=N+1))) || ((i == N + 1)&&(j!=0)) && (j != N + 1)) {
					Node[i][j] = 2;
				} else if ((j == 0) || (j == N + 1)) {
					Node[i][j] = 3;
				} else
					Node[i][j] = 0;
			}
		}
	}

	public boolean isFull(int row, int col) {
		// TODO Auto-generated method stub
		if (Node[row][col] == 2) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isOpen(int row, int col) {
		// TODO Auto-generated method stub
		if (Node[row][col] == 0) {
			return true;
		} else {
			return false;
		}
	}

	public void open(int i, int j) {
		// TODO Auto-generated method stub
		if (isOpen(i, j)) {
			if ((Node[i + 1][j] == 2) || (Node[i][j + 1] == 2) || (Node[i - 1][j] == 2) || (Node[i][j - 1] == 2)||(Node[i][j]==2)) {
				Node[i][j] = 2;
			} else {
				Node[i][j] = 1;
			}
		}

	}

	public boolean percolates() {
		// TODO Auto-generated method stub
		return false;
	}

}
