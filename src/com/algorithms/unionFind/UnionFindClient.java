package com.algorithms.unionFind;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import edu.princeton.cs.algs4.StdOut;

public class UnionFindClient {
	private static final int N = 10;
	private static final String fileLocation = "temp.txt";
	protected static String line = null;

	public static void main(String[] args) {
		WQUPathCompressionAlgorithm UFA = new WQUPathCompressionAlgorithm(N);
		try {
			FileReader fileReader = new FileReader(fileLocation);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				String[] array = line.split("");
				int p = Integer.parseInt(array[0]);
				int q = Integer.parseInt(array[2]);
				if (!UFA.connected(p, q)) {
					UFA.union(p, q);
				}
			}
			bufferedReader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileLocation + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + fileLocation + "'");
		}
	}
}
