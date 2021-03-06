package com.dev.practice.queue;

import java.util.Stack;

public class QueueUsingStackImplementation {

	public static void main(String[] args) {
		StackImpl stackImpl = new StackImpl();

		stackImpl.enqueue(7);
		stackImpl.enqueue(3);
		stackImpl.enqueue(4);

		stackImpl.dequeue();
		stackImpl.dequeue();

		stackImpl.enqueue(5);

		stackImpl.dequeue();
		stackImpl.dequeue();
		stackImpl.dequeue();
	}

	static class StackImpl {
		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();

		public void enqueue(int val) {
			System.out.println("Enqueue item to queue : " + val);
			s1.push(val);
		}

		public int dequeue() {
			if (!s2.empty()) {
				Integer popItem = s2.pop();
				System.out.println("Dequeue item from queue : " + popItem);
				return popItem;
			}

			if (s1.empty()) {
				return -1;
			}

			while (!s1.empty()) {
				s2.push(s1.pop());
			}
			Integer popItem = s2.pop();
			System.out.println("Dequeue item from queue : " + popItem);
			return popItem;
		}

	}
}