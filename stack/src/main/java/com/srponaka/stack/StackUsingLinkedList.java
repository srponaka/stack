package com.srponaka.stack;

public class StackUsingLinkedList {

	LinkedList ll;

	public StackUsingLinkedList() {
		ll = new LinkedList();
	}

	// time complexity O(1)
	// space Complexity O(1)
	public void push(int value) {
		ll.insertInLinkedList(0, value);
		System.err.println("Inserted value in stack successfully");
	}

	// time complexity O(1)
	// space Complexity O(1)
	public boolean isEmpty() {
		if (ll.head == null) {
			return true;
		} else {
			return false;
		}
	}

	// time complexity O(1)
	// space Complexity O(1)
	public int pop() {
		if (isEmpty()) {
			System.err.println("Stack is empty");
			return Integer.MIN_VALUE;
		}
		int res = ll.head.value;
		ll.deleteANode(0);
		return res;
	}

	// time complexity O(1)
	// space Complexity O(1)
	public int peek() {
		if (isEmpty()) {
			System.err.println("Stack is empty");
			return Integer.MIN_VALUE;
		}
		return ll.head.value;
	}

	// time complexity O(1)
	// space Complexity O(1)
	public void deleteStack() {
		ll.head = null;
		System.err.println("Stack is deleted");

	}
}
