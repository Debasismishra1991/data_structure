package com.dev.practice.queue;

public class QueueArrayImplementation {

	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.insert(12);
		queue.insert(2);
		queue.insert(7);
		queue.insert(27);
		queue.insert(18);
		queue.insert(80);

		System.out.println("Size: " + queue.getSize());
		System.out.println("Front: " + queue.getFront());
		System.out.println("Rear: " + queue.getRear());

		System.out.println("Removed Element: " + queue.remove());

		System.out.println("Size: " + queue.getSize());
		System.out.println("Front: " + queue.getFront());
		System.out.println("Rear: " + queue.getRear());
		queue.insert(80);

		System.out.println("Size: " + queue.getSize());
		System.out.println("Front: " + queue.getFront());
		System.out.println("Rear: " + queue.getRear());

		System.out.println("Removed Element: " + queue.remove());
		System.out.println("Removed Element: " + queue.remove());
		System.out.println("Removed Element: " + queue.remove());
		System.out.println("Removed Element: " + queue.remove());
		System.out.println("Removed Element: " + queue.remove());
		System.out.println("Removed Element: " + queue.remove());
	}

	static class Queue {
		int MAX = 5;
		int front = 0;
		int rear = -1;
		int size = 0;
		int[] a = new int[MAX];

		private boolean isFull() {
			if (size == MAX) {
				return true;
			}

			return false;
		}

		public void insert(int val) {
			if (isFull()) {
				System.out.println("Queue is full. Remove some elements");
				return;
			}
			rear = (rear + 1) % MAX;
			size++;
			a[rear] = val;
		}

		public boolean ifEmpty() {
			if (size == 0) {
				return true;
			}

			return false;
		}

		public int remove() {
			if (ifEmpty()) {
				System.out.println("Queue is empty. Nothing to remove");
				return Integer.MIN_VALUE;
			}
			front = front % MAX;
			size--;
			return a[front++];
		}

		public int getSize() {
			return size;
		}

		public int getFront() {
			if (ifEmpty()) {
				System.out.println("Queue is Empty. Nothing at Front");
				return Integer.MIN_VALUE;
			}
			return a[front];
		}

		public int getRear() {
			if (ifEmpty()) {
				System.out.println("Queue is Empty. Nothing at Rear");
				return Integer.MIN_VALUE;
			}
			return a[rear];
		}
	}

}