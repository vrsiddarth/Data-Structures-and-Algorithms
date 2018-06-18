package com.algorithms.lists;

public class SingleLinkedList<dataType> {

	private Node head;
	private Node tail;
	private int count;

	private class Node {
		private Node next;
		private dataType value;

		public Node(dataType value, Node next) {
			this.value = value;
			this.next = next;
		}
	}

	public void addFirst(dataType value) { // O(1)
		head = new Node(value, head);
		if (count == 0)
			tail = head;
		count++;
	}

	public void addLast(dataType value) { // O(1)
		if (count == 0) {
			head = new Node(value, head);
			tail = head;
			count++;
			return;
		}
		Node temp = tail;
		tail = new Node(value, null);
		temp.next = tail;
		count++;
	}

	public Node removeFirst() { // O(1)
		if (isEmpty())
			return null;
		Node temp = head;
		head = head.next;
		count--;
		if (count == 0)
			tail = null;
		return temp;
	}

	public Node removeLast() { // O(N)
		if (isEmpty()) return null;
		Node temp = null;
		if (count == 1) {
			temp = head;
			head = null;
			tail = null;
			count--;
		} else {
			Node current = head;
			while (current.next != tail) {
				current = current.next;
			}
			temp = tail;
			current.next = null;
			tail = current;
			count--;
		}
		return temp;
	}

	public Node remove(dataType value) { // O(N)
		Node temp = null;
		if (!isEmpty()) {
			if (head.value.equals(value))
				return removeFirst();
			else {
				Node current = head;
				while (current.next != null) {
					if (current.next.value.equals(value)) {
						temp = current.next;
						current.next = current.next.next;
						count--;
						return temp;
					}
					current = current.next;
				}
			}
		}
		return temp;
	}

	public int size() {
		return count;
	}

	public boolean isEmpty() {
		return count == 0;
	}

	public Node find(dataType value) { // O(N)
		Node current = head;
		while (current != null) {
			if (current.value.equals(value))
				return current;
			else
				current = current.next;
		}
		return current;
	}

	public void printList() {
		Node current = head;
		while (current != null) {
			System.out.println(current.value);
			current = current.next;
		}
	}

	public static void main(String[] args) {
		SingleLinkedList<Integer> SLL = new SingleLinkedList<>();
		SLL.addFirst(10);
		SLL.addFirst(100);
		SLL.addFirst(200);
		SLL.addLast(300);
		System.out.println("Found " + SLL.find(200).value);
		SLL.remove(100);
		SLL.remove(10);
		SLL.remove(200);
		System.out.println(SLL.size());
		System.out.println(SLL.isEmpty());
		System.out.println(SLL.find(200));
		SLL.printList();
		SingleLinkedList<String> s = new SingleLinkedList<>();
		s.addFirst("s");
		s.printList();
	}

}