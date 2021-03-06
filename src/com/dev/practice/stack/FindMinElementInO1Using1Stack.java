package com.dev.practice.stack;

import java.util.Stack;

public class FindMinElementInO1Using1Stack {

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
		int minUsingSingleStack = Integer.MAX_VALUE;

		public void pushElementInStack(int item) {
			if (elementStack.isEmpty()) {
				elementStack.push(item);
				minUsingSingleStack = item;
				return;
			}
			if (item > minUsingSingleStack) {
				elementStack.push(item);
			} else {
				elementStack.push(2 * item - minUsingSingleStack);
				minUsingSingleStack = item;
			}
		}

		public int popElementFromStack() {

			if (elementStack.isEmpty()) {
				return -1;
			}

			int item = elementStack.pop();
			if (item < minUsingSingleStack) {
				minUsingSingleStack = 2 * minUsingSingleStack - item;
			}

			return item;
		}

		public int minElement() {
			if (elementStack.isEmpty()) {
				return -1;
			}
			return minUsingSingleStack;
		}
	}

}
