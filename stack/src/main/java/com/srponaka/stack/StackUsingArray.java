package com.srponaka.stack;

public class StackUsingArray {

	int[] arr;
	int topOfStack;

	// time complexity O(1)
	// space complexity O(n)
	public StackUsingArray(int size) {
		this.arr = new int[size];
		this.topOfStack = -1;
		System.err.println("The stack is created with size of :" + size);
	}

	// time complexity O(1)
	// space complexity O(1)
	public boolean isEmpty() {
		if (topOfStack == -1) {
			return true;
		} else {
			return false;
		}
	}

	// time complexity O(1)
	// space complexity O(1)
	public boolean isFull() {
		if (topOfStack == arr.length - 1) {
			return true;
		} else {
			return false;
		}
	}

	// time complexity O(1)
	// space complexity O(1)
	public void push(int value) {
		if (isFull()) {
			System.err.println("Stack is full");
		} else {
			arr[++topOfStack] = value;
			System.err.println("The value is successfully inserted into stack");
		}
	}

	// time complexity O(1)
	// space complexity O(1)
	public int pop() {
		if (isEmpty()) {
			System.err.println("Stack is Empty");
			return Integer.MIN_VALUE;
		} else {
			int res = arr[topOfStack];
			topOfStack--;
			return res;
		}
	}

	// time complexity O(1)
	// space complexity O(1)
	public int peek() {
		if (isEmpty()) {
			System.err.println("Stack is Empty");
			return Integer.MIN_VALUE;
		} else {
			return arr[topOfStack];
		}
	}
	// time complexity O(1)
	// space complexity O(1)
	public void deleteStack() {
		this.arr = null;
		System.err.println("Stack is deleted");

	}
}
