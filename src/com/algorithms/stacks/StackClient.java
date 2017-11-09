package com.algorithms.stacks;

import edu.princeton.cs.algs4.In;

public class StackClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackStrings SC = new StackStrings();
		In in = new In("Files/StackInputFile.txt");

		while (!in.isEmpty()) {
			String word = in.readString();
			if (word.equals("-"))
				System.out.print(SC.pop());
			else
				SC.push(word);

		}

	}
}