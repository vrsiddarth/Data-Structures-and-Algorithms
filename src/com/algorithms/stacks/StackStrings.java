package com.algorithms.stacks;

import java.util.Date;
import java.util.Iterator;

public class StackStrings<item> implements Iterable<item>{
	private Node first = null;
	Date date;

	private class Node {
		private String item;
		private Node node;
	}

	public StackStrings() {
		// TODO Auto-generated constructor stub
		String item;
	}

	void push(String item) {
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.node = oldfirst;

	}

	public String pop() {
		String item = first.item;
		first = first.node;
		return item;

	}

	public Boolean isEmpty() {
		return (first == null);
	}

	@Override
	public Iterator<item> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
