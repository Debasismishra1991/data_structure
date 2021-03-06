package com.dev.practice.stack;

import java.util.Stack;

public class FindMinElementInO1Using2Stack {

	public static void main(String[] args) {
		ArrayImpl arrayImpl = new ArrayImpl();
		arrayImpl.pushElementInStack(2);
		arrayImpl.pushElementInStack(7);
		arrayImpl.pushElementInStack(5);
		arrayImpl.pushElementInStack(3);
		arrayImpl.pushElementInStack(2);
		arrayImpl.pushElementInStack(10);
		arrayImpl.pushElementInStack(1);

		System.out.println(arrayImpl.minElement());

		arrayImpl.popElementFromStack();
		arrayImpl.popElementFromStack();
		arrayImpl.popElementFromStack();
		arrayImpl.popElementFromStack();

		System.out.println(arrayImpl.minElement());
	}

	static class ArrayImpl {

		Stack<Integer> elementStack = new Stack<>();
		Stack<Integer> minElementStack = new Stack<>();

		public void pushElementInStack(int item) {
			elementStack.push(item);
			if (minElementStack.isEmpty()) {
				minElementStack.push(item);
			} else {
				if (item < minElementStack.peek()) {
					minElementStack.push(item);
				}
			}
		}

		public int popElementFromStack() {
			int item = elementStack.pop();
			if (item == minElementStack.peek()) {
				if (minElementStack.size() != 1) {
					minElementStack.pop();
				} else if (elementStack.isEmpty()) {
					minElementStack.pop();
				}
			}

			return item;
		}

		public int minElement() {
			if (minElementStack.isEmpty()) {
				return -1;
			}
			return minElementStack.pop();
		}
	}

}
