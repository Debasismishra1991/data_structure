package com.dev.practice.queue;

public class QueueLinkedListImplementation {

	public static void main(String[] args) {
		QueueLinked queueLinked = new QueueLinked();
		queueLinked.insert(12);
		queueLinked.insert(2);
		queueLinked.insert(7);
		queueLinked.insert(27);
		queueLinked.insert(18);
		queueLinked.insert(80);

		System.out.println("Size: " + queueLinked.getSize());
		System.out.println("Front: " + queueLinked.getFront());
		System.out.println("Rear: " + queueLinked.getRear());

		System.out.println("Removed Element: " + queueLinked.remove());

		System.out.println("Size: " + queueLinked.getSize());
		System.out.println("Front: " + queueLinked.getFront());
		System.out.println("Rear: " + queueLinked.getRear());
		queueLinked.insert(81);

		System.out.println("Size: " + queueLinked.getSize());
		System.out.println("Front: " + queueLinked.getFront());
		System.out.println("Rear: " + queueLinked.getRear());

		System.out.println("Removed Element: " + queueLinked.remove());
		System.out.println("Removed Element: " + queueLinked.remove());
		System.out.println("Removed Element: " + queueLinked.remove());
		System.out.println("Removed Element: " + queueLinked.remove());
		System.out.println("Removed Element: " + queueLinked.remove());
		System.out.println("Removed Element: " + queueLinked.remove());
		System.out.println("Removed Element: " + queueLinked.remove());

	}

	static class Node {
		int data;
		Node next;
	}

	static class QueueLinked {
		Node first;
		Node last;
		int size;

		public Node getNewNode(int val) {
			Node a = new Node();
			a.data = val;
			a.next = null;
			return a;
		}

		// Complexity: O(1)
		public void insert(int val) {
			System.out.println("Inserting Element : " + val);
			if (last == null) {
				first = last = getNewNode(val);
				size++;
				return;
			}
			size++;
			last.next = getNewNode(val);
			last = last.next;
		}

		// Complexity: O(1)
		public boolean ifEmpty() {
			if (last == null) {
				return true;
			}

			return false;
		}

		// Complexity: O(1)
		public int remove() {

			if (ifEmpty()) {
				System.out.println("Queue is empty. Nothing to remove");
				return -1;
			}
			size--;
			int val = first.data;
			System.out.println("Removing Element : " + val);
			first = first.next;
			if (first == null) {
				last = null;
			}
			return val;
		}

		// Complexity: O(1)
		public int getSize() {
			return size;
		}

		// Complexity: O(1)
		public int getFront() {
			if (ifEmpty()) {
				System.out.println("Queue is Empty. Nothing at Front");
				return Integer.MIN_VALUE;
			}
			return first.data;
		}

		// Complexity: O(1)
		public int getRear() {
			if (ifEmpty()) {
				System.out.println("Queue is Empty. Nothing at Rear");
				return Integer.MIN_VALUE;
			}
			return last.data;
		}
	}

}